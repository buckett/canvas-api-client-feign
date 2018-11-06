package com.instructure.canvas.api;

import com.instructure.canvas.invoker.ApiClient;
import com.instructure.canvas.model.SharedBrandConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SharedBrandConfigsApi
 */
public class SharedBrandConfigsApiTest {

    private SharedBrandConfigsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SharedBrandConfigsApi.class);
    }

    /**
     * Share a BrandConfig (Theme)
     *
     * Create a SharedBrandConfig, which will give the given brand_config a name and make it available to other users of this account.
     */
    @Test
    public void shareBrandconfigThemeTest() {
        String accountId = null;
        String sharedBrandConfigName = null;
        String sharedBrandConfigBrandConfigMd5 = null;
        // SharedBrandConfig response = api.shareBrandconfigTheme(accountId, sharedBrandConfigName, sharedBrandConfigBrandConfigMd5);

        // TODO: test validations
    }

    /**
     * Un-share a BrandConfig (Theme)
     *
     * Delete a SharedBrandConfig, which will unshare it so you nor anyone else in your account will see it as an option to pick from.
     */
    @Test
    public void unShareBrandconfigThemeTest() {
        String id = null;
        // SharedBrandConfig response = api.unShareBrandconfigTheme(id);

        // TODO: test validations
    }

    /**
     * Update a shared theme
     *
     * Update the specified shared_brand_config with a new name or to point to a new brand_config. Uses same parameters as create.
     */
    @Test
    public void updateSharedThemeTest() {
        String accountId = null;
        String id = null;
        // SharedBrandConfig response = api.updateSharedTheme(accountId, id);

        // TODO: test validations
    }

}
