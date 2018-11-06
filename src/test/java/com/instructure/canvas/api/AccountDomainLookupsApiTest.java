package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountDomainLookupsApi
 */
public class AccountDomainLookupsApiTest {

    private AccountDomainLookupsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AccountDomainLookupsApi.class);
    }

    /**
     * Search account domains
     *
     * Returns a list of up to 5 matching account domains  Partial match on name / domain are supported
     */
    @Test
    public void searchAccountDomainsTest() {
        String name = null;
        String domain = null;
        BigDecimal latitude = null;
        BigDecimal longitude = null;
        // api.searchAccountDomains(name, domain, latitude, longitude);

        // TODO: test validations
    }

    /**
     * Search account domains
     *
     * Returns a list of up to 5 matching account domains  Partial match on name / domain are supported
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void searchAccountDomainsTestQueryMap() {
        AccountDomainLookupsApi.SearchAccountDomainsQueryParams queryParams = new AccountDomainLookupsApi.SearchAccountDomainsQueryParams()
            .name(null)
            .domain(null)
            .latitude(null)
            .longitude(null);
        // api.searchAccountDomains(queryParams);

    // TODO: test validations
    }
}
