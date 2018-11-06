package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.NotificationPreference;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationPreferencesApi
 */
public class NotificationPreferencesApiTest {

    private NotificationPreferencesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(NotificationPreferencesApi.class);
    }

    /**
     * Get a preference
     *
     * Fetch the preference for the given notification for the given communicaiton channel
     */
    @Test
    public void getPreferenceCommunicationChannelIdTest() {
        String userId = null;
        String communicationChannelId = null;
        String notification = null;
        // NotificationPreference response = api.getPreferenceCommunicationChannelId(userId, communicationChannelId, notification);

        // TODO: test validations
    }

    /**
     * Get a preference
     *
     * Fetch the preference for the given notification for the given communicaiton channel
     */
    @Test
    public void getPreferenceTypeTest() {
        String userId = null;
        String type = null;
        String address = null;
        String notification = null;
        // NotificationPreference response = api.getPreferenceType(userId, type, address, notification);

        // TODO: test validations
    }

    /**
     * List of preference categories
     *
     * Fetch all notification preference categories for the given communication channel
     */
    @Test
    public void listOfPreferenceCategoriesTest() {
        String userId = null;
        String communicationChannelId = null;
        // api.listOfPreferenceCategories(userId, communicationChannelId);

        // TODO: test validations
    }

    /**
     * List preferences
     *
     * Fetch all preferences for the given communication channel
     */
    @Test
    public void listPreferencesCommunicationChannelIdTest() {
        String userId = null;
        String communicationChannelId = null;
        // List<NotificationPreference> response = api.listPreferencesCommunicationChannelId(userId, communicationChannelId);

        // TODO: test validations
    }

    /**
     * List preferences
     *
     * Fetch all preferences for the given communication channel
     */
    @Test
    public void listPreferencesTypeTest() {
        String userId = null;
        String type = null;
        String address = null;
        // List<NotificationPreference> response = api.listPreferencesType(userId, type, address);

        // TODO: test validations
    }

    /**
     * Update multiple preferences
     *
     * Change the preferences for multiple notifications for a single communication channel at once
     */
    @Test
    public void updateMultiplePreferencesCommunicationChannelIdTest() {
        String communicationChannelId = null;
        String notificationPreferencesXFrequency = null;
        // api.updateMultiplePreferencesCommunicationChannelId(communicationChannelId, notificationPreferencesXFrequency);

        // TODO: test validations
    }

    /**
     * Update multiple preferences
     *
     * Change the preferences for multiple notifications for a single communication channel at once
     */
    @Test
    public void updateMultiplePreferencesTypeTest() {
        String type = null;
        String address = null;
        String notificationPreferencesXFrequency = null;
        // api.updateMultiplePreferencesType(type, address, notificationPreferencesXFrequency);

        // TODO: test validations
    }

    /**
     * Update a preference
     *
     * Change the preference for a single notification for a single communication channel
     */
    @Test
    public void updatePreferenceCommunicationChannelIdTest() {
        String communicationChannelId = null;
        String notification = null;
        String notificationPreferencesFrequency = null;
        // api.updatePreferenceCommunicationChannelId(communicationChannelId, notification, notificationPreferencesFrequency);

        // TODO: test validations
    }

    /**
     * Update a preference
     *
     * Change the preference for a single notification for a single communication channel
     */
    @Test
    public void updatePreferenceTypeTest() {
        String type = null;
        String address = null;
        String notification = null;
        String notificationPreferencesFrequency = null;
        // api.updatePreferenceType(type, address, notification, notificationPreferencesFrequency);

        // TODO: test validations
    }

    /**
     * Update preferences by category
     *
     * Change the preferences for multiple notifications based on the category for a single communication channel
     */
    @Test
    public void updatePreferencesByCategoryTest() {
        String communicationChannelId = null;
        String category = null;
        String notificationPreferencesFrequency = null;
        // api.updatePreferencesByCategory(communicationChannelId, category, notificationPreferencesFrequency);

        // TODO: test validations
    }

}
