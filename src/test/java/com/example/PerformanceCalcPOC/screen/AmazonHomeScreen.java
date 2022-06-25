package com.example.PerformanceCalcPOC.screen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.example.PerformanceCalcPOC.screen.web.AmazonHomeScreenWeb;

public abstract class AmazonHomeScreen {

    private static WebDriver driver;
    private static String execPlatform="web";

    public static AmazonHomeScreen get(){

        switch(execPlatform) {
            case "web":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                return new AmazonHomeScreenWeb(driver);
        }
        throw new NotImplementedException(execPlatform+ "is not yet Implemented");


    }

    public abstract AmazonHomeScreen navigateUserToHomePage();

    public abstract AmazonHomeScreen searchFor(String productNm);
}
