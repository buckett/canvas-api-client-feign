package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Progress;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProgressApi
 */
public class ProgressApiTest {

    private ProgressApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ProgressApi.class);
    }

    /**
     * Query progress
     *
     * Return completion and status information about an asynchronous job
     */
    @Test
    public void queryProgressTest() {
        String id = null;
        // Progress response = api.queryProgress(id);

        // TODO: test validations
    }

}
