package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.CourseEvent;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CourseAuditLogApi
 */
public class CourseAuditLogApiTest {

    private CourseAuditLogApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(CourseAuditLogApi.class);
    }

    /**
     * Query by course.
     *
     * List course change events for a given course.
     */
    @Test
    public void queryByCourseTest() {
        String courseId = null;
        String startTime = null;
        String endTime = null;
        // List<CourseEvent> response = api.queryByCourse(courseId, startTime, endTime);

        // TODO: test validations
    }

    /**
     * Query by course.
     *
     * List course change events for a given course.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryByCourseTestQueryMap() {
        String courseId = null;
        CourseAuditLogApi.QueryByCourseQueryParams queryParams = new CourseAuditLogApi.QueryByCourseQueryParams()
            .startTime(null)
            .endTime(null);
        // List<CourseEvent> response = api.queryByCourse(courseId, queryParams);

    // TODO: test validations
    }
}
