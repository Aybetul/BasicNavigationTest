package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    //In all other cases, return a new WebDriver object
    // for   ChromeDriver,FirefoxDriver, EdgeDriver or
    // SafariDriver b ased on the value of the stringargument.
    public static WebDriver getDriver(String arg ){

        if(arg.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else    if(arg.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else    if(arg.equals("edge")){
            System.setProperty("webdriver.edge.driver","C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
            return   new EdgeDriver();}
//        if(arg.equals("Safari")){
//        WebDriverManager.
//            return   new SafariDriver();}
      return   null;
    }

    public void MicrosoftEdge_Test1() {
        System.setProperty("webdriver.edge.driver","C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.google.com");
    }





}
