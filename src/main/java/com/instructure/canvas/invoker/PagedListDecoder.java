package com.instructure.canvas.invoker;

import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import static com.instructure.canvas.invoker.LinkHeaderParser.Type.*;

/**
 * This is a feign decoder that attempts to make List&lt;T&gt; pageable through the extracting out the Link header
 * and storing this in a PagedList.
 */
public class PagedListDecoder implements Decoder {

    private Decoder decoder;

    public PagedListDecoder(Decoder decoder) {
        this.decoder = decoder;
    }

    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
        Object decoded = this.decoder.decode(response, type);
        if (response.headers().containsKey("Link")) {
            // Is there a better way?
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType)type;
                if (List.class.getName().equals(parameterizedType.getRawType().getTypeName())) {
                    // Should be dealing with paging.
                    try {
                        LinkHeaderParser parser = new LinkHeaderParser();
                        response.headers().get("Link").forEach(parser::parse);
                        PagedList pagedList = new PagedList((List) decoded,
                                parser.getType(FIRST),
                                parser.getType(PREV),
                                parser.getType(CURRENT),
                                parser.getType(NEXT),
                                parser.getType(LAST)
                        );


                        // How to deal with all the other stuf in feign (retry, interceptors, etc).
                        return pagedList;
                    } catch (LinkHeaderParser.ParseException e) {
                        throw new DecodeException("Link header parse failure: "+ e.getMessage());
                    }
                }
            }
        }
        return decoded;
    }
}
