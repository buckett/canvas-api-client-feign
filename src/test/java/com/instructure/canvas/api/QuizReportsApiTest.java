package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.QuizReport;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuizReportsApi
 */
public class QuizReportsApiTest {

    private QuizReportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(QuizReportsApi.class);
    }

    /**
     * Abort the generation of a report, or remove a previously generated one
     *
     * This API allows you to cancel a previous request you issued for a report to be generated. Or in the case of an already generated report, you&#x27;d like to remove it, perhaps to generate it another time with an updated version that provides new features.  You must check the report&#x27;s generation status before attempting to use this interface. See the \&quot;workflow_state\&quot; property of the QuizReport&#x27;s Progress object for more information. Only when the progress reports itself in a \&quot;queued\&quot; state can the generation be aborted.  *Responses*  - &lt;code&gt;204 No Content&lt;/code&gt; if your request was accepted - &lt;code&gt;422 Unprocessable Entity&lt;/code&gt; if the report is not being generated   or can not be aborted at this stage
     */
    @Test
    public void abortGenerationOfReportOrRemovePreviouslyGeneratedOneTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        // api.abortGenerationOfReportOrRemovePreviouslyGeneratedOne(courseId, quizId, id);

        // TODO: test validations
    }

    /**
     * Create a quiz report
     *
     * Create and return a new report for this quiz. If a previously generated report matches the arguments and is still current (i.e. there have been no new submissions), it will be returned.  *Responses*  * &lt;code&gt;400 Bad Request&lt;/code&gt; if the specified report type is invalid * &lt;code&gt;409 Conflict&lt;/code&gt; if a quiz report of the specified type is already being   generated
     */
    @Test
    public void createQuizReportTest() {
        String courseId = null;
        String quizId = null;
        String quizReportReportType = null;
        Boolean quizReportIncludesAllVersions = null;
        String include = null;
        // QuizReport response = api.createQuizReport(courseId, quizId, quizReportReportType, quizReportIncludesAllVersions, include);

        // TODO: test validations
    }

    /**
     * Get a quiz report
     *
     * Returns the data for a single quiz report.
     */
    @Test
    public void getQuizReportTest() {
        String courseId = null;
        String quizId = null;
        String id = null;
        String include = null;
        // QuizReport response = api.getQuizReport(courseId, quizId, id, include);

        // TODO: test validations
    }

    /**
     * Get a quiz report
     *
     * Returns the data for a single quiz report.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getQuizReportTestQueryMap() {
        String courseId = null;
        String quizId = null;
        String id = null;
        QuizReportsApi.GetQuizReportQueryParams queryParams = new QuizReportsApi.GetQuizReportQueryParams()
            .include(null);
        // QuizReport response = api.getQuizReport(courseId, quizId, id, queryParams);

    // TODO: test validations
    }
    /**
     * Retrieve all quiz reports
     *
     * Returns a list of all available reports.
     */
    @Test
    public void retrieveAllQuizReportsTest() {
        String courseId = null;
        String quizId = null;
        Boolean includesAllVersions = null;
        // List<QuizReport> response = api.retrieveAllQuizReports(courseId, quizId, includesAllVersions);

        // TODO: test validations
    }

    /**
     * Retrieve all quiz reports
     *
     * Returns a list of all available reports.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void retrieveAllQuizReportsTestQueryMap() {
        String courseId = null;
        String quizId = null;
        QuizReportsApi.RetrieveAllQuizReportsQueryParams queryParams = new QuizReportsApi.RetrieveAllQuizReportsQueryParams()
            .includesAllVersions(null);
        // List<QuizReport> response = api.retrieveAllQuizReports(courseId, quizId, queryParams);

    // TODO: test validations
    }
}
