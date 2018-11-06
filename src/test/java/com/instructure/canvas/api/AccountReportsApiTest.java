package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.Report;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountReportsApi
 */
public class AccountReportsApiTest {

    private AccountReportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AccountReportsApi.class);
    }

    /**
     * Delete a Report
     *
     * Deletes a generated report instance.
     */
    @Test
    public void deleteReportTest() {
        String accountId = null;
        String report = null;
        String id = null;
        // Report response = api.deleteReport(accountId, report, id);

        // TODO: test validations
    }

    /**
     * Index of Reports
     *
     * Shows all reports that have been run for the account of a specific type.
     */
    @Test
    public void indexOfReportsTest() {
        String accountId = null;
        String report = null;
        // List<Report> response = api.indexOfReports(accountId, report);

        // TODO: test validations
    }

    /**
     * List Available Reports
     *
     * Returns a paginated list of reports for the current context.
     */
    @Test
    public void listAvailableReportsTest() {
        String accountId = null;
        // api.listAvailableReports(accountId);

        // TODO: test validations
    }

    /**
     * Start a Report
     *
     * Generates a report instance for the account. Note that \&quot;report\&quot; in the request must match one of the available report names. To fetch a list of available report names and parameters for each report (including whether or not those parameters are required), see {api:AccountReportsController#available_reports List Available Reports}.
     */
    @Test
    public void startReportTest() {
        String accountId = null;
        String report = null;
        String parameters = null;
        Integer parametersCourseId = null;
        Boolean parametersUsers = null;
        // Report response = api.startReport(accountId, report, parameters, parametersCourseId, parametersUsers);

        // TODO: test validations
    }

    /**
     * Status of a Report
     *
     * Returns the status of a report.
     */
    @Test
    public void statusOfReportTest() {
        String accountId = null;
        String report = null;
        String id = null;
        // Report response = api.statusOfReport(accountId, report, id);

        // TODO: test validations
    }

}
