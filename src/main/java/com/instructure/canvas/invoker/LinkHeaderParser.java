package com.instructure.canvas.invoker;

import java.util.HashMap;
import java.util.Map;

/**
 * Very simple parser that just deals with the format Canvas uses. When a list of results are
 * returned Canvas provides links to additional pages in the HTTP headers and this parses the URLs
 * out.
 */
public class LinkHeaderParser {

    enum Type {FIRST, PREV, CURRENT, NEXT, LAST}

    // Holds the links found.
    private Map<Type, String> links = new HashMap<>();

    public LinkHeaderParser parse(String value) {
        // Each link is separated by a comma and this shouldn't be anywhere else (fingers crossed).
        String[] links = value.split(",");
        for (String link: links) {
            parseLink(link);
        }
        return this;
    }

    public Map<Type, String> getLinks() {
        return links;
    }

    public String getType(Type type) {
        return links.get(type);
    }

    private void parseLink(String link) {
        int urlStart = link.indexOf('<');
        if (urlStart < 0) {
            throw new ParseException("Failed to find < in: "+ link);
        }
        int urlEnd = link.indexOf('>', urlStart);
        if (urlEnd < 0) {
            throw new ParseException("Failed to find > in: "+ link);
        }
        String url = link.substring(urlStart+1, urlEnd);

        int rel = link.indexOf("rel=", urlEnd);
        if (rel < 0) {
            throw new ParseException("Failed to find rel= in: "+ link);
        }

        int openQuote = link.indexOf('"', rel);
        if (openQuote < 0) {
            throw new ParseException("Failed to find opening \" in: "+ link);
        }
        int closeQuote = link.indexOf('"', openQuote+1);
        if (closeQuote < 0) {
            throw new ParseException("Failed to find closing \" in: "+ link);
        }
        String type = link.substring(openQuote+1, closeQuote);

        try {
            Type typeEnum = Type.valueOf(type.toUpperCase());
            // Doesn't detect duplicate relationships
            links.put(typeEnum, url);
        } catch (IllegalArgumentException iae) {
            throw new ParseException("Not a valid type: "+ type);
        }
    }

    public static class ParseException extends RuntimeException {
        public ParseException(String message) {
            super(message);
        }

    }
}
