package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ErrorReportsApi
 */
public class ErrorReportsApiTest {

    private ErrorReportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ErrorReportsApi.class);
    }

    /**
     * Create Error Report
     *
     * Create a new error report documenting an experienced problem  Performs the same action as when a user uses the \&quot;help -&gt; report a problem\&quot; dialog.
     */
    @Test
    public void createErrorReportTest() {
        String errorSubject = null;
        String errorUrl = null;
        String errorEmail = null;
        String errorComments = null;
        Object errorHttpEnv = null;
        // api.createErrorReport(errorSubject, errorUrl, errorEmail, errorComments, errorHttpEnv);

        // TODO: test validations
    }

}
