package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;



public class EmailFriend {
         protected static WebDriver driver;
         private static void expextedmessage() {;}

         public static void clickOnElement(By by){driver.findElement(by).click();}
         public static void typeText(By by,String text){driver.findElement(by).sendKeys(text);}
         public static String getTextFromElement(By by){ return driver.findElement(by).getText();}
         public static long timestamp(){
             Timestamp timestamp = new Timestamp(System.currentTimeMillis());
             return timestamp.getTime();}
             
             @BeforeMethod
             public static void openBrowser(){
             //open chrome browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //open url
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();}

    @AfterMethod
        public static void teardown(){driver.close();}
    @Test

    public static void verifyUserShouldBeAbleToSendEmailToFriendSuccessfully() {
        //Click on Products
        clickOnElement(By.className("Apple MacBook Pro 13-inch"));
        //Click on Email a friend button
        clickOnElement(By.className("email-a-friend-button)"));
        //Type your email
        typeText((By.name("Email")), "test1email" + timestamp() + "@gmail.com");
        //Type friend's email
        typeText((By.name("Email")), "test2email" + timestamp() + "@gmail.com");
        //Type msg for friend
        typeText((By.id("PersonalMessage")), "Hello");
        //Click on Send email button
        clickOnElement(By.name("send-email"));
        //GetText from webelement
        String actualMessage = getTextFromElement(By.linkText("Only registered customers can use email a friend feature"));

        //show error
        System.out.println("My massage:" + actualMessage);
        String expectedmessage = null;
        Assert.assertEquals(actualMessage, expectedmessage, "you have sent succesfully");
    }
}

