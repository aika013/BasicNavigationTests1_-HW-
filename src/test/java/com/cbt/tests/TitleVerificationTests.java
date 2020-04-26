package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerificationTests {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");


        //Tests: Title and URL test

        for (String all : urls) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(all);
            StringUtility.verifyEquals("Practice", driver.getTitle());
            boolean startsWith = driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com");
            System.out.println("each urls: " + all);
            System.out.println(startsWith +": starts with --> http://practice.cybertekschool.com");
            driver.quit();

        }


    }
}
