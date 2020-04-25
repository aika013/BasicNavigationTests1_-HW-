package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
     chrome();
     safari();
     firefox();
    }

    public static void chrome() {
        System.out.println("Test for CHROME");
        WebDriver driver = BrowserFactory.getDriver("Chrome");
        driver.get("https://www.google.com/");
        String titleGoogle = driver.getTitle();

        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals("Google", titleGoogle);

        driver.navigate().forward();
        StringUtility.verifyEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", titleEtsy);

        driver.quit();
    }

    public static void firefox() {
        System.out.println("===========");

        System.out.println("Test for FIREFOX");

        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://www.google.com/");
        String titleGoogle = driver.getTitle();

        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals("Google", titleGoogle);

        driver.navigate().forward();
        StringUtility.verifyEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", titleEtsy);

        driver.close();
    }

    public static void safari() {
        System.out.println("===========");

        System.out.println("Test for SAFARI");

        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://www.google.com/");
        String titleGoogle = driver.getTitle();

        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals("Google", titleGoogle);

        driver.navigate().forward();
        StringUtility.verifyEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", titleEtsy);

        driver.close();
    }
}
