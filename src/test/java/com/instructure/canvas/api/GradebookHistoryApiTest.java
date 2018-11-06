package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Day;
import com.instructure.canvas.model.Grader;
import com.instructure.canvas.model.SubmissionHistory;
import com.instructure.canvas.model.SubmissionVersion;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GradebookHistoryApi
 */
public class GradebookHistoryApiTest {

    private GradebookHistoryApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(GradebookHistoryApi.class);
    }

    /**
     * Days in gradebook history for this course
     *
     * Returns a map of dates to grader/assignment groups
     */
    @Test
    public void daysInGradebookHistoryForThisCourseTest() {
        Integer courseId = null;
        // List<Day> response = api.daysInGradebookHistoryForThisCourse(courseId);

        // TODO: test validations
    }

    /**
     * Details for a given date in gradebook history for this course
     *
     * Returns the graders who worked on this day, along with the assignments they worked on. More details can be obtained by selecting a grader and assignment and calling the &#x27;submissions&#x27; api endpoint for a given date.
     */
    @Test
    public void detailsForGivenDateInGradebookHistoryForThisCourseTest() {
        Integer courseId = null;
        String date = null;
        // List<Grader> response = api.detailsForGivenDateInGradebookHistoryForThisCourse(courseId, date);

        // TODO: test validations
    }

    /**
     * List uncollated submission versions
     *
     * Gives a paginated, uncollated list of submission versions for all matching submissions in the context. This SubmissionVersion objects will not include the +new_grade+ or +previous_grade+ keys, only the +grade+; same for +graded_at+ and +grader+.
     */
    @Test
    public void listUncollatedSubmissionVersionsTest() {
        Integer courseId = null;
        Integer assignmentId = null;
        Integer userId = null;
        Boolean ascending = null;
        // List<SubmissionVersion> response = api.listUncollatedSubmissionVersions(courseId, assignmentId, userId, ascending);

        // TODO: test validations
    }

    /**
     * List uncollated submission versions
     *
     * Gives a paginated, uncollated list of submission versions for all matching submissions in the context. This SubmissionVersion objects will not include the +new_grade+ or +previous_grade+ keys, only the +grade+; same for +graded_at+ and +grader+.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listUncollatedSubmissionVersionsTestQueryMap() {
        Integer courseId = null;
        GradebookHistoryApi.ListUncollatedSubmissionVersionsQueryParams queryParams = new GradebookHistoryApi.ListUncollatedSubmissionVersionsQueryParams()
            .assignmentId(null)
            .userId(null)
            .ascending(null);
        // List<SubmissionVersion> response = api.listUncollatedSubmissionVersions(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Lists submissions
     *
     * Gives a nested list of submission versions
     */
    @Test
    public void listsSubmissionsTest() {
        Integer courseId = null;
        String date = null;
        Integer graderId = null;
        Integer assignmentId = null;
        // List<SubmissionHistory> response = api.listsSubmissions(courseId, date, graderId, assignmentId);

        // TODO: test validations
    }

}
