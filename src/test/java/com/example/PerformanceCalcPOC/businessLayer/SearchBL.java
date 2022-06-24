package com.example.PerformanceCalcPOC.businessLayer;

import org.junit.Assert;
import com.example.PerformanceCalcPOC.screen.web.AmazonHomeScreenWeb;

public class SearchBL {
    public SearchBL searchFor(String product) {
        //AmazonHomeScreen.get().searchFor(product);
        AmazonHomeScreenWeb.searchesFor(product);
        return this;
    }

    public SearchBL fetchProductSearchSuggestions() {
        String expected_in_results = "macbook pro";
        Assert.assertTrue(AmazonHomeScreenWeb.fetchProductSearchSuggestions().contains(expected_in_results));
        return new SearchBL();
    }
}
