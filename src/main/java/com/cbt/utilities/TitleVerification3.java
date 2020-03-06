package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com, ", "https://westelm.com/");
        WebDriver driver = BrowserFactory.getDriver("chrome");
        for (String each : urls) {

            driver.get(each);
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getCurrentUrl().contains(
                    (driver.getTitle().replace(" ", "").toLowerCase())) ?
                    driver.getTitle() + " passed" :
                    driver.getTitle() + " failed");
            driver.close();
             driver = BrowserFactory.getDriver("chrome");
        }
driver.quit();
    }
    }

