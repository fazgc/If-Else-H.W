package org.example;

import java.sql.Timestamp;

public class Utils {

    public static void clickOnElement(By by){driver.findElement(by).click();}
    public static void typeText(By by,String text){driver.findElement(by).sendKeys(text);}
    public static String getTextFromElement(By by){return driver.findElement(by).getText();}
    public static long timestamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();public static void clickOnElement(){

    }
}
