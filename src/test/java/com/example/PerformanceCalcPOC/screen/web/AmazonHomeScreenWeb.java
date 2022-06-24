package com.example.PerformanceCalcPOC.screen.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.example.PerformanceCalcPOC.screen.AmazonHomeScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonHomeScreenWeb extends AmazonHomeScreen {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static Wait flu_wait;
    private static By searchBarID = By.id("twotabsearchtextbox");
    private static By srchRsPlaceHolder = By.xpath("//div[@class='autocomplete-results-container']//div[@class='s-suggestion-container']");
    private static By searchResultXpath = By.xpath("//div[@class='autocomplete-results-container']//div[@class='s-suggestion-container']/div");

    /*public AmazonHomeScreenWeb() {
        System.out.println("Default Constructor of Home Screen without Arg");
    }*/
    public AmazonHomeScreenWeb(WebDriver driver) {
        this.driver=driver;
    }


    @Override
    public AmazonHomeScreen navigateUserToHomePage() {
        driver.get("https://www.amazon.in/");
        System.out.println("SITE TITLE: "+driver.getTitle());
        return this;
    }

    @Override
    public AmazonHomeScreen searchFor(String productNm) {
        try {
            //System.out.println(driver.getTitle());
            driver.findElement(searchBarID).sendKeys(productNm);
            Thread.sleep(2000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }

    public static AmazonHomeScreen searchesFor(String productNm) {
        try {
            //System.out.println(driver.getTitle());
            driver.findElement(searchBarID).sendKeys(productNm);
            Thread.sleep(2000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new AmazonHomeScreenWeb(driver);
    }

    public static List<String> fetchProductSearchSuggestions() {
        List<String> searchSuggestionList=new ArrayList<>();

        try {
            flu_wait = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
            //wait = new WebDriverWait(driver,10);
            flu_wait.until(ExpectedConditions.presenceOfElementLocated(srchRsPlaceHolder));
            List<WebElement> searchResultsWe = driver.findElements(searchResultXpath);
            System.out.println("Search Result Suggestions:");
            for (WebElement we : searchResultsWe) {
                System.out.print(we.getText()+" | ");
                searchSuggestionList.add(we.getText());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        driver.quit();
        return searchSuggestionList;
    }
}
