package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.EnrollmentTerm;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnrollmentTermsApi
 */
public class EnrollmentTermsApiTest {

    private EnrollmentTermsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(EnrollmentTermsApi.class);
    }

    /**
     * Create enrollment term
     *
     * Create a new enrollment term for the specified account.
     */
    @Test
    public void createEnrollmentTermTest() {
        String accountId = null;
        String enrollmentTermName = null;
        String enrollmentTermStartAt = null;
        String enrollmentTermEndAt = null;
        String enrollmentTermSisTermId = null;
        String enrollmentTermOverridesEnrollmentTypeStartAt = null;
        String enrollmentTermOverridesEnrollmentTypeEndAt = null;
        // EnrollmentTerm response = api.createEnrollmentTerm(accountId, enrollmentTermName, enrollmentTermStartAt, enrollmentTermEndAt, enrollmentTermSisTermId, enrollmentTermOverridesEnrollmentTypeStartAt, enrollmentTermOverridesEnrollmentTypeEndAt);

        // TODO: test validations
    }

    /**
     * Delete enrollment term
     *
     * Delete the specified enrollment term.
     */
    @Test
    public void deleteEnrollmentTermTest() {
        String accountId = null;
        String id = null;
        // EnrollmentTerm response = api.deleteEnrollmentTerm(accountId, id);

        // TODO: test validations
    }

    /**
     * List enrollment terms
     *
     * A paginated list of all of the terms in the account.
     */
    @Test
    public void listEnrollmentTermsTest() {
        String accountId = null;
        List<String> workflowState = null;
        List<String> include = null;
        // List<EnrollmentTerm> response = api.listEnrollmentTerms(accountId, workflowState, include);

        // TODO: test validations
    }

    /**
     * List enrollment terms
     *
     * A paginated list of all of the terms in the account.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listEnrollmentTermsTestQueryMap() {
        String accountId = null;
        EnrollmentTermsApi.ListEnrollmentTermsQueryParams queryParams = new EnrollmentTermsApi.ListEnrollmentTermsQueryParams()
            .workflowState(null)
            .include(null);
        // List<EnrollmentTerm> response = api.listEnrollmentTerms(accountId, queryParams);

    // TODO: test validations
    }
    /**
     * Update enrollment term
     *
     * Update an existing enrollment term for the specified account.
     */
    @Test
    public void updateEnrollmentTermTest() {
        String accountId = null;
        String id = null;
        String enrollmentTermName = null;
        String enrollmentTermStartAt = null;
        String enrollmentTermEndAt = null;
        String enrollmentTermSisTermId = null;
        String enrollmentTermOverridesEnrollmentTypeStartAt = null;
        String enrollmentTermOverridesEnrollmentTypeEndAt = null;
        // EnrollmentTerm response = api.updateEnrollmentTerm(accountId, id, enrollmentTermName, enrollmentTermStartAt, enrollmentTermEndAt, enrollmentTermSisTermId, enrollmentTermOverridesEnrollmentTypeStartAt, enrollmentTermOverridesEnrollmentTypeEndAt);

        // TODO: test validations
    }

}
