package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.invoker.EncodingUtils;

import com.instructure.canvas.model.CommunicationChannel;
import com.instructure.canvas.model.SuccessTrue;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-11-06T15:34:49.014533Z[Europe/London]")
public interface CommunicationChannelsApi extends ApiClient.Api {

  /**
   * Create a communication channel
   * Creates a new communication channel for the specified user.
   * @param userId ID (required)
   * @param communicationChannelAddress  (optional)
   * @param communicationChannelType  (optional)
   * @param communicationChannelToken  (optional)
   * @param skipConfirmation  (optional)
   * @return CommunicationChannel
   */
  @RequestLine("POST /v1/users/{userId}/communication_channels")
  @Headers({
      "Content-Type: multipart/form-data",
      "Accept: application/json",
  })
  CommunicationChannel createCommunicationChannel(@Param("userId") String userId, @Param("communicationChannelAddress") String communicationChannelAddress, @Param("communicationChannelType") String communicationChannelType, @Param("communicationChannelToken") String communicationChannelToken, @Param("skipConfirmation") Boolean skipConfirmation);
  
  /**
   * Delete a communication channel
   * Delete an existing communication channel.
   * @param userId ID (required)
   * @param id ID (required)
   * @return CommunicationChannel
   */
  @RequestLine("DELETE /v1/users/{userId}/communication_channels/{id}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  CommunicationChannel deleteCommunicationChannelId(@Param("userId") String userId, @Param("id") String id);
  
  /**
   * Delete a communication channel
   * Delete an existing communication channel.
   * @param userId ID (required)
   * @param type ID (required)
   * @param address ID (required)
   * @return CommunicationChannel
   */
  @RequestLine("DELETE /v1/users/{userId}/communication_channels/{type}/{address}")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  CommunicationChannel deleteCommunicationChannelType(@Param("userId") String userId, @Param("type") String type, @Param("address") String address);
  
  /**
   * Delete a push notification endpoint
   * 
   * @return SuccessTrue
   */
  @RequestLine("DELETE /v1/users/self/communication_channels/push")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  SuccessTrue deletePushNotificationEndpoint();
  
  /**
   * List user communication channels
   * Returns a paginated list of communication channels for the specified user, sorted by position.
   * @param userId ID (required)
   * @return List&lt;CommunicationChannel&gt;
   */
  @RequestLine("GET /v1/users/{userId}/communication_channels")
  @Headers({
      "Accept: application/json",
  })
  List<CommunicationChannel> listUserCommunicationChannels(@Param("userId") String userId);

  /**
   * Allows paging through the results.
   * @param uri The paging URI to follow
   * @return List&lt;CommunicationChannel&gt;
   */
  @RequestLine("GET")
  @Headers({
      "Accept: application/json",
  })
  List<CommunicationChannel> listUserCommunicationChannels(URI uri);
  
}
