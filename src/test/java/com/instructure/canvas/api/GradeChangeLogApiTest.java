package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.GradeChangeEvent;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GradeChangeLogApi
 */
public class GradeChangeLogApiTest {

    private GradeChangeLogApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(GradeChangeLogApi.class);
    }

    /**
     * Query by assignment.
     *
     * List grade change events for a given assignment.
     */
    @Test
    public void queryByAssignmentTest() {
        String assignmentId = null;
        String startTime = null;
        String endTime = null;
        // List<GradeChangeEvent> response = api.queryByAssignment(assignmentId, startTime, endTime);

        // TODO: test validations
    }

    /**
     * Query by assignment.
     *
     * List grade change events for a given assignment.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryByAssignmentTestQueryMap() {
        String assignmentId = null;
        GradeChangeLogApi.QueryByAssignmentQueryParams queryParams = new GradeChangeLogApi.QueryByAssignmentQueryParams()
            .startTime(null)
            .endTime(null);
        // List<GradeChangeEvent> response = api.queryByAssignment(assignmentId, queryParams);

    // TODO: test validations
    }
    /**
     * Query by course.
     *
     * List grade change events for a given course.
     */
    @Test
    public void queryByCourseTest() {
        String courseId = null;
        String startTime = null;
        String endTime = null;
        // List<GradeChangeEvent> response = api.queryByCourse(courseId, startTime, endTime);

        // TODO: test validations
    }

    /**
     * Query by course.
     *
     * List grade change events for a given course.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryByCourseTestQueryMap() {
        String courseId = null;
        GradeChangeLogApi.QueryByCourseQueryParams queryParams = new GradeChangeLogApi.QueryByCourseQueryParams()
            .startTime(null)
            .endTime(null);
        // List<GradeChangeEvent> response = api.queryByCourse(courseId, queryParams);

    // TODO: test validations
    }
    /**
     * Query by grader.
     *
     * List grade change events for a given grader.
     */
    @Test
    public void queryByGraderTest() {
        String graderId = null;
        String startTime = null;
        String endTime = null;
        // List<GradeChangeEvent> response = api.queryByGrader(graderId, startTime, endTime);

        // TODO: test validations
    }

    /**
     * Query by grader.
     *
     * List grade change events for a given grader.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryByGraderTestQueryMap() {
        String graderId = null;
        GradeChangeLogApi.QueryByGraderQueryParams queryParams = new GradeChangeLogApi.QueryByGraderQueryParams()
            .startTime(null)
            .endTime(null);
        // List<GradeChangeEvent> response = api.queryByGrader(graderId, queryParams);

    // TODO: test validations
    }
    /**
     * Query by student.
     *
     * List grade change events for a given student.
     */
    @Test
    public void queryByStudentTest() {
        String studentId = null;
        String startTime = null;
        String endTime = null;
        // List<GradeChangeEvent> response = api.queryByStudent(studentId, startTime, endTime);

        // TODO: test validations
    }

    /**
     * Query by student.
     *
     * List grade change events for a given student.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryByStudentTestQueryMap() {
        String studentId = null;
        GradeChangeLogApi.QueryByStudentQueryParams queryParams = new GradeChangeLogApi.QueryByStudentQueryParams()
            .startTime(null)
            .endTime(null);
        // List<GradeChangeEvent> response = api.queryByStudent(studentId, queryParams);

    // TODO: test validations
    }
}
