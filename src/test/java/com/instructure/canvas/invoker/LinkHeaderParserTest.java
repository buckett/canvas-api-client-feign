package com.instructure.canvas.invoker;

import com.instructure.canvas.invoker.LinkHeaderParser.Type;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkHeaderParserTest {

    LinkHeaderParser parser = new LinkHeaderParser();

    @Test
    public void testUsersStart() {
        String value = "<https://{hostname}/api/v1/accounts/1/users?page=1&per_page=10>; rel=\"current\",<https://{hostname}/api/v1/accounts/1/users?page=2&per_page=10>; rel=\"next\",<https://{hostname}/api/v1/accounts/1/users?page=1&per_page=10>; rel=\"first\",<https://{hostname}/api/v1/accounts/1/users?page=472&per_page=10>; rel=\"last\"";

        parser.parse(value);

        assertEquals(4, parser.getLinks().size());
        assertEquals("https://{hostname}/api/v1/accounts/1/users?page=1&per_page=10", parser.getLinks().get(Type.CURRENT));
        assertEquals("https://{hostname}/api/v1/accounts/1/users?page=2&per_page=10", parser.getLinks().get(Type.NEXT));
        assertEquals("https://{hostname}/api/v1/accounts/1/users?page=1&per_page=10", parser.getLinks().get(Type.FIRST));
        assertEquals("https://{hostname}/api/v1/accounts/1/users?page=472&per_page=10", parser.getLinks().get(Type.LAST));
    }
}
