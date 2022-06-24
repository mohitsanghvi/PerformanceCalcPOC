package com.example.PerformanceCalcPOC.businessLayer;

import com.example.PerformanceCalcPOC.screen.AmazonHomeScreen;


public class HomeBL {

    public SearchBL navigateTo(){
        AmazonHomeScreen.get().navigateUserToHomePage();
        return new SearchBL();
    }


}
