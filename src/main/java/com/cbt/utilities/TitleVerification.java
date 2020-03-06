package com.cbt.utilities;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        String[] arr = new String[3];
        String[] geturls= new String[3];
        for (int i = 0, j = 0; i < urls.size(); i++, j++) {
            driver.get(urls.get(i));
            arr[j] = driver.getTitle();
            geturls[j]=driver.getCurrentUrl();
        }
        System.out.println(arr[0]==arr[1]&&arr[0]==arr[2]&&arr[1]==arr[2]?"passed":"failed");
        boolean verify=false;
for(String  each:geturls){
    if(each.startsWith("http://practice.cybertekschool.com")){
       verify=true;
    }else{
        verify=false;
    }

}
System.out.println("verify that all the urls star with http://practice.cybertekschool.com.  = " + verify);
driver.quit();
    }
}