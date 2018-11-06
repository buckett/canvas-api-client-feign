package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServicesApi
 */
public class ServicesApiTest {

    private ServicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ServicesApi.class);
    }

    /**
     * Get Kaltura config
     *
     * Return the config information for the Kaltura plugin in json format.
     */
    @Test
    public void getKalturaConfigTest() {
        // api.getKalturaConfig();

        // TODO: test validations
    }

    /**
     * Start Kaltura session
     *
     * Start a new Kaltura session, so that new media can be recorded and uploaded to this Canvas instance&#x27;s Kaltura instance.
     */
    @Test
    public void startKalturaSessionTest() {
        // api.startKalturaSession();

        // TODO: test validations
    }

}
