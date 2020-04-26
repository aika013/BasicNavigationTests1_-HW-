package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                                          "https://wayfair.com",
                                          "https://www.westelm.com",
                                          "https://walmart.com");

        //Tests: Title and URL test 2

//        for (String each : urls) {
//            WebDriver driver = BrowserFactory.getDriver("chrome");
//            driver.get(each);
//            if(driver.getTitle().toLowerCase().equals("Lulu and Georgia")){
//                if(driver.getTitle().toLowerCase().equals("Wayfair.com - Online Home Store for Furniture, Decor, Outdoors & More")){
//                    if (driver.getTitle().toLowerCase().equals("West Elm: Modern Furniture, Home Decor, Lighting & More ")){
//                        if(driver.getTitle().toLowerCase().equals("Walmart.com | Save Money. Live Better.")){
//                            System.out.println("PASS" + each );
//                        }
//                    }
//                }
//            }
//        }


        for (String each : urls) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(each);
            if(driver.getTitle().contains("Lulu")){
                String trim = driver.getTitle().toLowerCase();
                trim = trim.replace(" ", "");
                String currentUrl = driver.getCurrentUrl();
                System.out.println("trim = " + trim);
                System.out.println("currentUrl = " + currentUrl);
                boolean contains = driver.getCurrentUrl().contains(trim);
                System.out.println("url contains : " + trim + " : " +contains);
            }else{
                String trim = driver.getTitle().toLowerCase();
                trim = trim.replace(" ", "");
                String currentUrl = driver.getCurrentUrl();
                System.out.println("trim = " + trim);
                System.out.println("currentUrl = " + currentUrl);
                trim = trim.substring(0,7);
                boolean contains = driver.getCurrentUrl().contains(trim);
                System.out.println("url contains : " + trim + " : " +contains );
                driver.close();
            }

        }
    }
}
