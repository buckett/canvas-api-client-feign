package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.JWT;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JwTsApi
 */
public class JwTsApiTest {

    private JwTsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(JwTsApi.class);
    }

    /**
     * Create JWT
     *
     * Create a unique jwt for using with other canvas services  Generates a different JWT each time it&#x27;s called, each one expires after a short window (1 hour)
     */
    @Test
    public void createJwtTest() {
        // JWT response = api.createJwt();

        // TODO: test validations
    }

    /**
     * Refresh JWT
     *
     * Refresh a JWT for use with other canvas services  Generates a different JWT each time it&#x27;s called, each one expires after a short window (1 hour).
     */
    @Test
    public void refreshJwtTest() {
        String jwt = null;
        // JWT response = api.refreshJwt(jwt);

        // TODO: test validations
    }

}
