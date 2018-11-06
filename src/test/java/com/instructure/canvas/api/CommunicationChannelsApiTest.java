package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.CommunicationChannel;
import com.instructure.canvas.model.SuccessTrue;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommunicationChannelsApi
 */
public class CommunicationChannelsApiTest {

    private CommunicationChannelsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CommunicationChannelsApi.class);
    }

    /**
     * Create a communication channel
     *
     * Creates a new communication channel for the specified user.
     */
    @Test
    public void createCommunicationChannelTest() {
        String userId = null;
        String communicationChannelAddress = null;
        String communicationChannelType = null;
        String communicationChannelToken = null;
        Boolean skipConfirmation = null;
        // CommunicationChannel response = api.createCommunicationChannel(userId, communicationChannelAddress, communicationChannelType, communicationChannelToken, skipConfirmation);

        // TODO: test validations
    }

    /**
     * Delete a communication channel
     *
     * Delete an existing communication channel.
     */
    @Test
    public void deleteCommunicationChannelIdTest() {
        String userId = null;
        String id = null;
        // CommunicationChannel response = api.deleteCommunicationChannelId(userId, id);

        // TODO: test validations
    }

    /**
     * Delete a communication channel
     *
     * Delete an existing communication channel.
     */
    @Test
    public void deleteCommunicationChannelTypeTest() {
        String userId = null;
        String type = null;
        String address = null;
        // CommunicationChannel response = api.deleteCommunicationChannelType(userId, type, address);

        // TODO: test validations
    }

    /**
     * Delete a push notification endpoint
     *
     * 
     */
    @Test
    public void deletePushNotificationEndpointTest() {
        // SuccessTrue response = api.deletePushNotificationEndpoint();

        // TODO: test validations
    }

    /**
     * List user communication channels
     *
     * Returns a paginated list of communication channels for the specified user, sorted by position.
     */
    @Test
    public void listUserCommunicationChannelsTest() {
        String userId = null;
        // List<CommunicationChannel> response = api.listUserCommunicationChannels(userId);

        // TODO: test validations
    }

}
