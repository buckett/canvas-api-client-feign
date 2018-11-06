package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Feature;
import com.instructure.canvas.model.FeatureFlag;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeatureFlagsApi
 */
public class FeatureFlagsApiTest {

    private FeatureFlagsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(FeatureFlagsApi.class);
    }

    /**
     * Get feature flag
     *
     * Get the feature flag that applies to a given Account, Course, or User. The flag may be defined on the object, or it may be inherited from a parent account. You can look at the context_id and context_type of the returned object to determine which is the case. If these fields are missing, then the object is the global Canvas default.
     */
    @Test
    public void getFeatureFlagAccountsTest() {
        String accountId = null;
        String feature = null;
        // FeatureFlag response = api.getFeatureFlagAccounts(accountId, feature);

        // TODO: test validations
    }

    /**
     * Get feature flag
     *
     * Get the feature flag that applies to a given Account, Course, or User. The flag may be defined on the object, or it may be inherited from a parent account. You can look at the context_id and context_type of the returned object to determine which is the case. If these fields are missing, then the object is the global Canvas default.
     */
    @Test
    public void getFeatureFlagCoursesTest() {
        String courseId = null;
        String feature = null;
        // FeatureFlag response = api.getFeatureFlagCourses(courseId, feature);

        // TODO: test validations
    }

    /**
     * Get feature flag
     *
     * Get the feature flag that applies to a given Account, Course, or User. The flag may be defined on the object, or it may be inherited from a parent account. You can look at the context_id and context_type of the returned object to determine which is the case. If these fields are missing, then the object is the global Canvas default.
     */
    @Test
    public void getFeatureFlagUsersTest() {
        String userId = null;
        String feature = null;
        // FeatureFlag response = api.getFeatureFlagUsers(userId, feature);

        // TODO: test validations
    }

    /**
     * List enabled features
     *
     * A paginated list of all features that are enabled on a given Account, Course, or User. Only the feature names are returned.
     */
    @Test
    public void listEnabledFeaturesAccountsTest() {
        String accountId = null;
        // api.listEnabledFeaturesAccounts(accountId);

        // TODO: test validations
    }

    /**
     * List enabled features
     *
     * A paginated list of all features that are enabled on a given Account, Course, or User. Only the feature names are returned.
     */
    @Test
    public void listEnabledFeaturesCoursesTest() {
        String courseId = null;
        // api.listEnabledFeaturesCourses(courseId);

        // TODO: test validations
    }

    /**
     * List enabled features
     *
     * A paginated list of all features that are enabled on a given Account, Course, or User. Only the feature names are returned.
     */
    @Test
    public void listEnabledFeaturesUsersTest() {
        String userId = null;
        // api.listEnabledFeaturesUsers(userId);

        // TODO: test validations
    }

    /**
     * List features
     *
     * A paginated list of all features that apply to a given Account, Course, or User.
     */
    @Test
    public void listFeaturesAccountsTest() {
        String accountId = null;
        // List<Feature> response = api.listFeaturesAccounts(accountId);

        // TODO: test validations
    }

    /**
     * List features
     *
     * A paginated list of all features that apply to a given Account, Course, or User.
     */
    @Test
    public void listFeaturesCoursesTest() {
        String courseId = null;
        // List<Feature> response = api.listFeaturesCourses(courseId);

        // TODO: test validations
    }

    /**
     * List features
     *
     * A paginated list of all features that apply to a given Account, Course, or User.
     */
    @Test
    public void listFeaturesUsersTest() {
        String userId = null;
        // List<Feature> response = api.listFeaturesUsers(userId);

        // TODO: test validations
    }

    /**
     * Remove feature flag
     *
     * Remove feature flag for a given Account, Course, or User.  (Note that the flag must be defined on the Account, Course, or User directly.)  The object will then inherit the feature flags from a higher account, if any exist.  If this flag was &#x27;on&#x27; or &#x27;off&#x27;, then lower-level account flags that were masked by this one will apply again.
     */
    @Test
    public void removeFeatureFlagAccountsTest() {
        String accountId = null;
        String feature = null;
        // FeatureFlag response = api.removeFeatureFlagAccounts(accountId, feature);

        // TODO: test validations
    }

    /**
     * Remove feature flag
     *
     * Remove feature flag for a given Account, Course, or User.  (Note that the flag must be defined on the Account, Course, or User directly.)  The object will then inherit the feature flags from a higher account, if any exist.  If this flag was &#x27;on&#x27; or &#x27;off&#x27;, then lower-level account flags that were masked by this one will apply again.
     */
    @Test
    public void removeFeatureFlagCoursesTest() {
        String courseId = null;
        String feature = null;
        // FeatureFlag response = api.removeFeatureFlagCourses(courseId, feature);

        // TODO: test validations
    }

    /**
     * Remove feature flag
     *
     * Remove feature flag for a given Account, Course, or User.  (Note that the flag must be defined on the Account, Course, or User directly.)  The object will then inherit the feature flags from a higher account, if any exist.  If this flag was &#x27;on&#x27; or &#x27;off&#x27;, then lower-level account flags that were masked by this one will apply again.
     */
    @Test
    public void removeFeatureFlagUsersTest() {
        String userId = null;
        String feature = null;
        // FeatureFlag response = api.removeFeatureFlagUsers(userId, feature);

        // TODO: test validations
    }

    /**
     * Set feature flag
     *
     * Set a feature flag for a given Account, Course, or User. This call will fail if a parent account sets a feature flag for the same feature in any state other than \&quot;allowed\&quot;.
     */
    @Test
    public void setFeatureFlagAccountsTest() {
        String accountId = null;
        String feature = null;
        String state = null;
        // FeatureFlag response = api.setFeatureFlagAccounts(accountId, feature, state);

        // TODO: test validations
    }

    /**
     * Set feature flag
     *
     * Set a feature flag for a given Account, Course, or User. This call will fail if a parent account sets a feature flag for the same feature in any state other than \&quot;allowed\&quot;.
     */
    @Test
    public void setFeatureFlagCoursesTest() {
        String courseId = null;
        String feature = null;
        String state = null;
        // FeatureFlag response = api.setFeatureFlagCourses(courseId, feature, state);

        // TODO: test validations
    }

    /**
     * Set feature flag
     *
     * Set a feature flag for a given Account, Course, or User. This call will fail if a parent account sets a feature flag for the same feature in any state other than \&quot;allowed\&quot;.
     */
    @Test
    public void setFeatureFlagUsersTest() {
        String userId = null;
        String feature = null;
        String state = null;
        // FeatureFlag response = api.setFeatureFlagUsers(userId, feature, state);

        // TODO: test validations
    }

}
