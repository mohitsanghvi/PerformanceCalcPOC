package com.example.PerformanceCalcPOC.businessLayer;

import com.example.PerformanceCalcPOC.screen.AmazonHomeScreen;
import org.springframework.stereotype.Component;

public class HomeBL {

    public SearchBL navigateTo(){
        AmazonHomeScreen.get().navigateUserToHomePage();
        return new SearchBL();
    }


}
