package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BrandConfigsApi
 */
public class BrandConfigsApiTest {

    private BrandConfigsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(BrandConfigsApi.class);
    }

    /**
     * Get the brand config variables that should be used for this domain
     *
     * Will redirect to a static json file that has all of the brand variables used by this account. Even though this is a redirect, do not store the redirected url since if the account makes any changes it will redirect to a new url. Needs no authentication.
     */
    @Test
    public void getBrandConfigVariablesThatShouldBeUsedForThisDomainTest() {
        // api.getBrandConfigVariablesThatShouldBeUsedForThisDomain();

        // TODO: test validations
    }

}
