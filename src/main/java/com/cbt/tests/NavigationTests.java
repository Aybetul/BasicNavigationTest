package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.Callable;

public class NavigationTests {
    public static void main(String[] args) {
     //   ChromeTest();
    //    FirefoxTest();
       EdgeTest();

    }





    public static void ChromeTest(){
    WebDriver driver = BrowserFactory.getDriver("chrome");
    driver.get("https://google.com");
      String page= driver.getTitle();
       driver.get("https://etsy.com");
       String page2=driver.getTitle();
       driver.navigate().back();
       String back= driver.getTitle();
        System.out.println(back.equals(page)?"Passed": "Failed");
       driver.navigate().forward();
       String forward= driver.getTitle();
        System.out.println(page2.equals(forward)?"Passed": "Failed");
        driver.quit();
    }
    public static void FirefoxTest(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String page= driver.getTitle();
        driver.get("https://etsy.com");
        String page2=driver.getTitle();
        driver.navigate().back();
        String back= driver.getTitle();
        System.out.println(back.equals(page)?"Passed": "Failed");
        driver.navigate().forward();
        String forward= driver.getTitle();
        System.out.println(page2.equals(forward)?"Passed": "Failed");
        driver.quit();
    }

    public static void EdgeTest(){
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String page= driver.getTitle();
        driver.get("https://etsy.com");
        String page2=driver.getTitle();
        driver.navigate().back();
        String back= driver.getTitle();
        System.out.println(back.equals(page)?"Passed": "Failed");
        driver.navigate().forward();
        String forward= driver.getTitle();
        System.out.println(page2.equals(forward)?"Passed": "Failed");
        driver.quit();
    }


}
