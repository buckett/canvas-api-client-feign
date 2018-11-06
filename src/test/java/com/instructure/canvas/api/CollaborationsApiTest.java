package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Collaboration;
import com.instructure.canvas.model.Collaborator;
import com.instructure.canvas.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollaborationsApi
 */
public class CollaborationsApiTest {

    private CollaborationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CollaborationsApi.class);
    }

    /**
     * List collaborations
     *
     * A paginated list of collaborations the current user has access to in the context of the course provided in the url. NOTE: this only returns ExternalToolCollaboration type collaborations.    curl https://&lt;canvas&gt;/api/v1/courses/1/collaborations/
     */
    @Test
    public void listCollaborationsCoursesTest() {
        String courseId = null;
        // List<Collaboration> response = api.listCollaborationsCourses(courseId);

        // TODO: test validations
    }

    /**
     * List collaborations
     *
     * A paginated list of collaborations the current user has access to in the context of the course provided in the url. NOTE: this only returns ExternalToolCollaboration type collaborations.    curl https://&lt;canvas&gt;/api/v1/courses/1/collaborations/
     */
    @Test
    public void listCollaborationsGroupsTest() {
        String groupId = null;
        // List<Collaboration> response = api.listCollaborationsGroups(groupId);

        // TODO: test validations
    }

    /**
     * List members of a collaboration.
     *
     * A paginated list of the collaborators of a given collaboration
     */
    @Test
    public void listMembersOfCollaborationTest() {
        String id = null;
        List<String> include = null;
        // List<Collaborator> response = api.listMembersOfCollaboration(id, include);

        // TODO: test validations
    }

    /**
     * List members of a collaboration.
     *
     * A paginated list of the collaborators of a given collaboration
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listMembersOfCollaborationTestQueryMap() {
        String id = null;
        CollaborationsApi.ListMembersOfCollaborationQueryParams queryParams = new CollaborationsApi.ListMembersOfCollaborationQueryParams()
            .include(null);
        // List<Collaborator> response = api.listMembersOfCollaboration(id, queryParams);

    // TODO: test validations
    }
    /**
     * List potential members
     *
     * A paginated list of the users who can potentially be added to a collaboration in the given context.  For courses, this consists of all enrolled users.  For groups, it is comprised of the group members plus the admins of the course containing the group.
     */
    @Test
    public void listPotentialMembersCoursesTest() {
        String courseId = null;
        // List<User> response = api.listPotentialMembersCourses(courseId);

        // TODO: test validations
    }

    /**
     * List potential members
     *
     * A paginated list of the users who can potentially be added to a collaboration in the given context.  For courses, this consists of all enrolled users.  For groups, it is comprised of the group members plus the admins of the course containing the group.
     */
    @Test
    public void listPotentialMembersGroupsTest() {
        String groupId = null;
        // List<User> response = api.listPotentialMembersGroups(groupId);

        // TODO: test validations
    }

}
