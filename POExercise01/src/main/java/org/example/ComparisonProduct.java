package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class ComparisonProduct {
    protected static WebDriver driver;
    private static String expectedmessage;

    public static void clickOnElement(By by){driver.findElement(by).click();}
    public static void typeText(By by,String text){driver.findElement(by).sendKeys(text);}
    public static String getTextFromElement(By by){return driver.findElement(by).getText();}
    public static long timestamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();}
    @BeforeMethod
    public static void openBrowser(){
        //open Chrome browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open url
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();}
    @AfterMethod
    public static void teardown(){
        driver.close();
    }
    @Test
    public static void verifyUserAbleToRegisterSuccessfully(){
        //click on product htc one m8 android comparison button
        clickOnElement(By.xpath("//button[contains(@fdprocessedid,\"7m36z5\")]"));
        //click on product £25 virtual gift card comparison button
        clickOnElement(By.xpath("//button[contains(@fdprocessedid,\"3890gh\")]"));
        //typeText(By.id("firstname"),"tim");
        // use implicity wait for pop up bar leading to product comparision page
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //click on green pop up bar showing product comparison tab
        clickOnElement(By.xpath("//a[contains(@href,'/compareproducts',product comparison)]"));
        // what is next step? action? findout requirment
        String actualMassage = getTextFromElement(By.className("result"));
        Assert.assertEquals(actualMassage,expectedmessage,"comparison done");

}}
