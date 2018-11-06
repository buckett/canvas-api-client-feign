package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Proficiency;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProficiencyRatingsApi
 */
public class ProficiencyRatingsApiTest {

    private ProficiencyRatingsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ProficiencyRatingsApi.class);
    }

    /**
     * Create/update proficiency ratings
     *
     * Create or update account-level proficiency ratings. These ratings will apply to all sub-accounts, unless they have their own account-level proficiency ratings defined.
     */
    @Test
    public void createUpdateProficiencyRatingsTest() {
        String accountId = null;
        List<String> ratingsDescription = null;
        List<Integer> ratingsPoints = null;
        List<Integer> ratingsMastery = null;
        List<Integer> ratingsColor = null;
        // Proficiency response = api.createUpdateProficiencyRatings(accountId, ratingsDescription, ratingsPoints, ratingsMastery, ratingsColor);

        // TODO: test validations
    }

    /**
     * Get proficiency ratings
     *
     * Get account-level proficiency ratings. If not defined for this account, it will return proficiency ratings for the nearest super-account with ratings defined. Will return 404 if none found.    Examples:     curl https://&lt;canvas&gt;/api/v1/accounts/&lt;account_id&gt;/outcome_proficiency \\         -H &#x27;Authorization: Bearer &lt;token&gt;&#x27;
     */
    @Test
    public void getProficiencyRatingsTest() {
        String accountId = null;
        // Proficiency response = api.getProficiencyRatings(accountId);

        // TODO: test validations
    }

}
