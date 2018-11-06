package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.NotificationPreference;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface NotificationPreferencesApi extends ApiClient.Api {

  /**
   * Get a preference
   * Fetch the preference for the given notification for the given communicaiton channel
   * @param userId ID (required)
   * @param communicationChannelId ID (required)
   * @param notification ID (required)
   * @return NotificationPreference
   */
  @RequestLine("GET /v1/users/{userId}/communication_channels/{communicationChannelId}/notification_preferences/{notification}")
  @Headers({
      "Accept: application/json",
  })
  NotificationPreference getPreferenceCommunicationChannelId(@Param("userId") String userId, @Param("communicationChannelId") String communicationChannelId, @Param("notification") String notification);
  
  /**
   * Get a preference
   * Fetch the preference for the given notification for the given communicaiton channel
   * @param userId ID (required)
   * @param type ID (required)
   * @param address ID (required)
   * @param notification ID (required)
   * @return NotificationPreference
   */
  @RequestLine("GET /v1/users/{userId}/communication_channels/{type}/{address}/notification_preferences/{notification}")
  @Headers({
      "Accept: application/json",
  })
  NotificationPreference getPreferenceType(@Param("userId") String userId, @Param("type") String type, @Param("address") String address, @Param("notification") String notification);
  
  /**
   * List of preference categories
   * Fetch all notification preference categories for the given communication channel
   * @param userId ID (required)
   * @param communicationChannelId ID (required)
   */
  @RequestLine("GET /v1/users/{userId}/communication_channels/{communicationChannelId}/notification_preference_categories")
  @Headers({
      "Accept: */*",
  })
  void listOfPreferenceCategories(@Param("userId") String userId, @Param("communicationChannelId") String communicationChannelId);
  
  /**
   * List preferences
   * Fetch all preferences for the given communication channel
   * @param userId ID (required)
   * @param communicationChannelId ID (required)
   * @return List&lt;NotificationPreference&gt;
   */
  @RequestLine("GET /v1/users/{userId}/communication_channels/{communicationChannelId}/notification_preferences")
  @Headers({
      "Accept: application/json",
  })
  List<NotificationPreference> listPreferencesCommunicationChannelId(@Param("userId") String userId, @Param("communicationChannelId") String communicationChannelId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;NotificationPreference&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<NotificationPreference> listPreferencesCommunicationChannelId(URI uri);
  
  /**
   * List preferences
   * Fetch all preferences for the given communication channel
   * @param userId ID (required)
   * @param type ID (required)
   * @param address ID (required)
   * @return List&lt;NotificationPreference&gt;
   */
  @RequestLine("GET /v1/users/{userId}/communication_channels/{type}/{address}/notification_preferences")
  @Headers({
      "Accept: application/json",
  })
  List<NotificationPreference> listPreferencesType(@Param("userId") String userId, @Param("type") String type, @Param("address") String address);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;NotificationPreference&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<NotificationPreference> listPreferencesType(URI uri);
  
  /**
   * Update multiple preferences
   * Change the preferences for multiple notifications for a single communication channel at once
   * @param communicationChannelId ID (required)
   * @param notificationPreferencesXFrequency  (optional)
   */
  @RequestLine("PUT /v1/users/self/communication_channels/{communicationChannelId}/notification_preferences")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateMultiplePreferencesCommunicationChannelId(@Param("communicationChannelId") String communicationChannelId, @Param("notificationPreferencesXFrequency") String notificationPreferencesXFrequency);
  
  /**
   * Update multiple preferences
   * Change the preferences for multiple notifications for a single communication channel at once
   * @param type ID (required)
   * @param address ID (required)
   * @param notificationPreferencesXFrequency  (optional)
   */
  @RequestLine("PUT /v1/users/self/communication_channels/{type}/{address}/notification_preferences")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updateMultiplePreferencesType(@Param("type") String type, @Param("address") String address, @Param("notificationPreferencesXFrequency") String notificationPreferencesXFrequency);
  
  /**
   * Update a preference
   * Change the preference for a single notification for a single communication channel
   * @param communicationChannelId ID (required)
   * @param notification ID (required)
   * @param notificationPreferencesFrequency  (optional)
   */
  @RequestLine("PUT /v1/users/self/communication_channels/{communicationChannelId}/notification_preferences/{notification}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updatePreferenceCommunicationChannelId(@Param("communicationChannelId") String communicationChannelId, @Param("notification") String notification, @Param("notificationPreferencesFrequency") String notificationPreferencesFrequency);
  
  /**
   * Update a preference
   * Change the preference for a single notification for a single communication channel
   * @param type ID (required)
   * @param address ID (required)
   * @param notification ID (required)
   * @param notificationPreferencesFrequency  (optional)
   */
  @RequestLine("PUT /v1/users/self/communication_channels/{type}/{address}/notification_preferences/{notification}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updatePreferenceType(@Param("type") String type, @Param("address") String address, @Param("notification") String notification, @Param("notificationPreferencesFrequency") String notificationPreferencesFrequency);
  
  /**
   * Update preferences by category
   * Change the preferences for multiple notifications based on the category for a single communication channel
   * @param communicationChannelId ID (required)
   * @param category The name of the category. Must be parameterized (e.g. The category \&quot;Course Content\&quot; should be \&quot;course_content\&quot;) (required)
   * @param notificationPreferencesFrequency  (optional)
   */
  @RequestLine("PUT /v1/users/self/communication_channels/{communicationChannelId}/notification_preference_categories/{category}")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: */*",
  })
  void updatePreferencesByCategory(@Param("communicationChannelId") String communicationChannelId, @Param("category") String category, @Param("notificationPreferencesFrequency") String notificationPreferencesFrequency);
  
}
