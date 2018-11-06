package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Section;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SectionsApi
 */
public class SectionsApiTest {

    private SectionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SectionsApi.class);
    }

    /**
     * Create course section
     *
     * Creates a new section for this course.
     */
    @Test
    public void createCourseSectionTest() {
        String courseId = null;
        String courseSectionName = null;
        String courseSectionSisSectionId = null;
        String courseSectionIntegrationId = null;
        String courseSectionStartAt = null;
        String courseSectionEndAt = null;
        Boolean courseSectionRestrictEnrollmentsToSectionDates = null;
        Boolean enableSisReactivation = null;
        // Section response = api.createCourseSection(courseId, courseSectionName, courseSectionSisSectionId, courseSectionIntegrationId, courseSectionStartAt, courseSectionEndAt, courseSectionRestrictEnrollmentsToSectionDates, enableSisReactivation);

        // TODO: test validations
    }

    /**
     * Cross-list a Section
     *
     * Move the Section to another course.  The new course may be in a different account (department), but must belong to the same root account (institution).
     */
    @Test
    public void crossListSectionTest() {
        String id = null;
        String newCourseId = null;
        // Section response = api.crossListSection(id, newCourseId);

        // TODO: test validations
    }

    /**
     * De-cross-list a Section
     *
     * Undo cross-listing of a Section, returning it to its original course.
     */
    @Test
    public void deCrossListSectionTest() {
        String id = null;
        // Section response = api.deCrossListSection(id);

        // TODO: test validations
    }

    /**
     * Delete a section
     *
     * Delete an existing section.  Returns the former Section.
     */
    @Test
    public void deleteSectionTest() {
        String id = null;
        // Section response = api.deleteSection(id);

        // TODO: test validations
    }

    /**
     * Edit a section
     *
     * Modify an existing section.
     */
    @Test
    public void editSectionTest() {
        String id = null;
        String courseSectionName = null;
        String courseSectionSisSectionId = null;
        String courseSectionIntegrationId = null;
        String courseSectionStartAt = null;
        String courseSectionEndAt = null;
        Boolean courseSectionRestrictEnrollmentsToSectionDates = null;
        // Section response = api.editSection(id, courseSectionName, courseSectionSisSectionId, courseSectionIntegrationId, courseSectionStartAt, courseSectionEndAt, courseSectionRestrictEnrollmentsToSectionDates);

        // TODO: test validations
    }

    /**
     * Get section information
     *
     * Gets details about a specific section
     */
    @Test
    public void getSectionInformationCoursesTest() {
        String courseId = null;
        String id = null;
        List<String> include = null;
        // Section response = api.getSectionInformationCourses(courseId, id, include);

        // TODO: test validations
    }

    /**
     * Get section information
     *
     * Gets details about a specific section
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSectionInformationCoursesTestQueryMap() {
        String courseId = null;
        String id = null;
        SectionsApi.GetSectionInformationCoursesQueryParams queryParams = new SectionsApi.GetSectionInformationCoursesQueryParams()
            .include(null);
        // Section response = api.getSectionInformationCourses(courseId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Get section information
     *
     * Gets details about a specific section
     */
    @Test
    public void getSectionInformationSectionsTest() {
        String id = null;
        List<String> include = null;
        // Section response = api.getSectionInformationSections(id, include);

        // TODO: test validations
    }

    /**
     * Get section information
     *
     * Gets details about a specific section
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getSectionInformationSectionsTestQueryMap() {
        String id = null;
        SectionsApi.GetSectionInformationSectionsQueryParams queryParams = new SectionsApi.GetSectionInformationSectionsQueryParams()
            .include(null);
        // Section response = api.getSectionInformationSections(id, queryParams);

    // TODO: test validations
    }
    /**
     * List course sections
     *
     * A paginated list of the list of sections for this course.
     */
    @Test
    public void listCourseSectionsTest() {
        String courseId = null;
        List<String> include = null;
        // List<Section> response = api.listCourseSections(courseId, include);

        // TODO: test validations
    }

    /**
     * List course sections
     *
     * A paginated list of the list of sections for this course.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listCourseSectionsTestQueryMap() {
        String courseId = null;
        SectionsApi.ListCourseSectionsQueryParams queryParams = new SectionsApi.ListCourseSectionsQueryParams()
            .include(null);
        // List<Section> response = api.listCourseSections(courseId, queryParams);

    // TODO: test validations
    }
}
