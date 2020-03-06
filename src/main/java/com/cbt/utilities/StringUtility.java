package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StringUtility {
    public static void main(String[] args) {

    }
public static void verifyEquals(String actual , String expected ){
    System.out.println(actual.equals(expected)?"PASSED":"FAILED");
}
}
