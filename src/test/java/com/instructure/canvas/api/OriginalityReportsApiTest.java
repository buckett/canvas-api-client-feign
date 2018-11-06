package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import java.math.BigDecimal;
import com.instructure.canvas.model.OriginalityReport;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OriginalityReportsApi
 */
public class OriginalityReportsApiTest {

    private OriginalityReportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(OriginalityReportsApi.class);
    }

    /**
     * Create an Originality Report
     *
     * Create a new OriginalityReport for the specified file
     */
    @Test
    public void createOriginalityReportTest() {
        String assignmentId = null;
        String submissionId = null;
        Integer originalityReportFileId = null;
        BigDecimal originalityReportOriginalityScore = null;
        String originalityReportOriginalityReportUrl = null;
        Integer originalityReportOriginalityReportFileId = null;
        String originalityReportToolSettingResourceTypeCode = null;
        String originalityReportToolSettingResourceUrl = null;
        String originalityReportWorkflowState = null;
        // OriginalityReport response = api.createOriginalityReport(assignmentId, submissionId, originalityReportFileId, originalityReportOriginalityScore, originalityReportOriginalityReportUrl, originalityReportOriginalityReportFileId, originalityReportToolSettingResourceTypeCode, originalityReportToolSettingResourceUrl, originalityReportWorkflowState);

        // TODO: test validations
    }

    /**
     * Edit an Originality Report
     *
     * Modify an existing originality report. An alternative to this endpoint is to POST the same parameters listed below to the CREATE endpoint.
     */
    @Test
    public void editOriginalityReportFilesTest() {
        String assignmentId = null;
        String fileId = null;
        BigDecimal originalityReportOriginalityScore = null;
        String originalityReportOriginalityReportUrl = null;
        Integer originalityReportOriginalityReportFileId = null;
        String originalityReportToolSettingResourceTypeCode = null;
        String originalityReportToolSettingResourceUrl = null;
        String originalityReportWorkflowState = null;
        // OriginalityReport response = api.editOriginalityReportFiles(assignmentId, fileId, originalityReportOriginalityScore, originalityReportOriginalityReportUrl, originalityReportOriginalityReportFileId, originalityReportToolSettingResourceTypeCode, originalityReportToolSettingResourceUrl, originalityReportWorkflowState);

        // TODO: test validations
    }

    /**
     * Edit an Originality Report
     *
     * Modify an existing originality report. An alternative to this endpoint is to POST the same parameters listed below to the CREATE endpoint.
     */
    @Test
    public void editOriginalityReportSubmissionsTest() {
        String assignmentId = null;
        String submissionId = null;
        String id = null;
        BigDecimal originalityReportOriginalityScore = null;
        String originalityReportOriginalityReportUrl = null;
        Integer originalityReportOriginalityReportFileId = null;
        String originalityReportToolSettingResourceTypeCode = null;
        String originalityReportToolSettingResourceUrl = null;
        String originalityReportWorkflowState = null;
        // OriginalityReport response = api.editOriginalityReportSubmissions(assignmentId, submissionId, id, originalityReportOriginalityScore, originalityReportOriginalityReportUrl, originalityReportOriginalityReportFileId, originalityReportToolSettingResourceTypeCode, originalityReportToolSettingResourceUrl, originalityReportWorkflowState);

        // TODO: test validations
    }

    /**
     * Show an Originality Report
     *
     * Get a single originality report
     */
    @Test
    public void showOriginalityReportFilesTest() {
        String assignmentId = null;
        String fileId = null;
        // OriginalityReport response = api.showOriginalityReportFiles(assignmentId, fileId);

        // TODO: test validations
    }

    /**
     * Show an Originality Report
     *
     * Get a single originality report
     */
    @Test
    public void showOriginalityReportSubmissionsTest() {
        String assignmentId = null;
        String submissionId = null;
        String id = null;
        // OriginalityReport response = api.showOriginalityReportSubmissions(assignmentId, submissionId, id);

        // TODO: test validations
    }

}
