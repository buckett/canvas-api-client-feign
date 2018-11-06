package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.Feature;
import com.instructure.canvas.model.FeatureFlag;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface FeatureFlagsApi extends ApiClient.Api {

  /**
   * Get feature flag
   * Get the feature flag that applies to a given Account, Course, or User. The flag may be defined on the object, or it may be inherited from a parent account. You can look at the context_id and context_type of the returned object to determine which is the case. If these fields are missing, then the object is the global Canvas default.
   * @param accountId ID (required)
   * @param feature ID (required)
   * @return FeatureFlag
   */
  @RequestLine("GET /v1/accounts/{accountId}/features/flags/{feature}")
  @Headers({
      "Accept: application/json",
  })
  FeatureFlag getFeatureFlagAccounts(@Param("accountId") String accountId, @Param("feature") String feature);
  
  /**
   * Get feature flag
   * Get the feature flag that applies to a given Account, Course, or User. The flag may be defined on the object, or it may be inherited from a parent account. You can look at the context_id and context_type of the returned object to determine which is the case. If these fields are missing, then the object is the global Canvas default.
   * @param courseId ID (required)
   * @param feature ID (required)
   * @return FeatureFlag
   */
  @RequestLine("GET /v1/courses/{courseId}/features/flags/{feature}")
  @Headers({
      "Accept: application/json",
  })
  FeatureFlag getFeatureFlagCourses(@Param("courseId") String courseId, @Param("feature") String feature);
  
  /**
   * Get feature flag
   * Get the feature flag that applies to a given Account, Course, or User. The flag may be defined on the object, or it may be inherited from a parent account. You can look at the context_id and context_type of the returned object to determine which is the case. If these fields are missing, then the object is the global Canvas default.
   * @param userId ID (required)
   * @param feature ID (required)
   * @return FeatureFlag
   */
  @RequestLine("GET /v1/users/{userId}/features/flags/{feature}")
  @Headers({
      "Accept: application/json",
  })
  FeatureFlag getFeatureFlagUsers(@Param("userId") String userId, @Param("feature") String feature);
  
  /**
   * List enabled features
   * A paginated list of all features that are enabled on a given Account, Course, or User. Only the feature names are returned.
   * @param accountId ID (required)
   */
  @RequestLine("GET /v1/accounts/{accountId}/features/enabled")
  @Headers({
      "Accept: */*",
  })
  void listEnabledFeaturesAccounts(@Param("accountId") String accountId);
  
  /**
   * List enabled features
   * A paginated list of all features that are enabled on a given Account, Course, or User. Only the feature names are returned.
   * @param courseId ID (required)
   */
  @RequestLine("GET /v1/courses/{courseId}/features/enabled")
  @Headers({
      "Accept: */*",
  })
  void listEnabledFeaturesCourses(@Param("courseId") String courseId);
  
  /**
   * List enabled features
   * A paginated list of all features that are enabled on a given Account, Course, or User. Only the feature names are returned.
   * @param userId ID (required)
   */
  @RequestLine("GET /v1/users/{userId}/features/enabled")
  @Headers({
      "Accept: */*",
  })
  void listEnabledFeaturesUsers(@Param("userId") String userId);
  
  /**
   * List features
   * A paginated list of all features that apply to a given Account, Course, or User.
   * @param accountId ID (required)
   * @return List&lt;Feature&gt;
   */
  @RequestLine("GET /v1/accounts/{accountId}/features")
  @Headers({
      "Accept: application/json",
  })
  List<Feature> listFeaturesAccounts(@Param("accountId") String accountId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Feature&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Feature> listFeaturesAccounts(URI uri);
  
  /**
   * List features
   * A paginated list of all features that apply to a given Account, Course, or User.
   * @param courseId ID (required)
   * @return List&lt;Feature&gt;
   */
  @RequestLine("GET /v1/courses/{courseId}/features")
  @Headers({
      "Accept: application/json",
  })
  List<Feature> listFeaturesCourses(@Param("courseId") String courseId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Feature&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Feature> listFeaturesCourses(URI uri);
  
  /**
   * List features
   * A paginated list of all features that apply to a given Account, Course, or User.
   * @param userId ID (required)
   * @return List&lt;Feature&gt;
   */
  @RequestLine("GET /v1/users/{userId}/features")
  @Headers({
      "Accept: application/json",
  })
  List<Feature> listFeaturesUsers(@Param("userId") String userId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;Feature&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<Feature> listFeaturesUsers(URI uri);
  
  /**
   * Remove feature flag
   * Remove feature flag for a given Account, Course, or User.  (Note that the flag must be defined on the Account, Course, or User directly.)  The object will then inherit the feature flags from a higher account, if any exist.  If this flag was &#x27;on&#x27; or &#x27;off&#x27;, then lower-level account flags that were masked by this one will apply again.
   * @param accountId ID (required)
   * @param feature ID (required)
   * @return FeatureFlag
   */
  @RequestLine("DELETE /v1/accounts/{accountId}/features/flags/{feature}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  FeatureFlag removeFeatureFlagAccounts(@Param("accountId") String accountId, @Param("feature") String feature);
  
  /**
   * Remove feature flag
   * Remove feature flag for a given Account, Course, or User.  (Note that the flag must be defined on the Account, Course, or User directly.)  The object will then inherit the feature flags from a higher account, if any exist.  If this flag was &#x27;on&#x27; or &#x27;off&#x27;, then lower-level account flags that were masked by this one will apply again.
   * @param courseId ID (required)
   * @param feature ID (required)
   * @return FeatureFlag
   */
  @RequestLine("DELETE /v1/courses/{courseId}/features/flags/{feature}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  FeatureFlag removeFeatureFlagCourses(@Param("courseId") String courseId, @Param("feature") String feature);
  
  /**
   * Remove feature flag
   * Remove feature flag for a given Account, Course, or User.  (Note that the flag must be defined on the Account, Course, or User directly.)  The object will then inherit the feature flags from a higher account, if any exist.  If this flag was &#x27;on&#x27; or &#x27;off&#x27;, then lower-level account flags that were masked by this one will apply again.
   * @param userId ID (required)
   * @param feature ID (required)
   * @return FeatureFlag
   */
  @RequestLine("DELETE /v1/users/{userId}/features/flags/{feature}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  FeatureFlag removeFeatureFlagUsers(@Param("userId") String userId, @Param("feature") String feature);
  
  /**
   * Set feature flag
   * Set a feature flag for a given Account, Course, or User. This call will fail if a parent account sets a feature flag for the same feature in any state other than \&quot;allowed\&quot;.
   * @param accountId ID (required)
   * @param feature ID (required)
   * @param state  (optional)
   * @return FeatureFlag
   */
  @RequestLine("PUT /v1/accounts/{accountId}/features/flags/{feature}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  FeatureFlag setFeatureFlagAccounts(@Param("accountId") String accountId, @Param("feature") String feature, @Param("state") String state);
  
  /**
   * Set feature flag
   * Set a feature flag for a given Account, Course, or User. This call will fail if a parent account sets a feature flag for the same feature in any state other than \&quot;allowed\&quot;.
   * @param courseId ID (required)
   * @param feature ID (required)
   * @param state  (optional)
   * @return FeatureFlag
   */
  @RequestLine("PUT /v1/courses/{courseId}/features/flags/{feature}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  FeatureFlag setFeatureFlagCourses(@Param("courseId") String courseId, @Param("feature") String feature, @Param("state") String state);
  
  /**
   * Set feature flag
   * Set a feature flag for a given Account, Course, or User. This call will fail if a parent account sets a feature flag for the same feature in any state other than \&quot;allowed\&quot;.
   * @param userId ID (required)
   * @param feature ID (required)
   * @param state  (optional)
   * @return FeatureFlag
   */
  @RequestLine("PUT /v1/users/{userId}/features/flags/{feature}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  FeatureFlag setFeatureFlagUsers(@Param("userId") String userId, @Param("feature") String feature, @Param("state") String state);
  
}
