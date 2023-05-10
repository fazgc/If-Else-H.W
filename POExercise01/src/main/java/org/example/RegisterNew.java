package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class RegisterNew {
    protected static WebDriver driver;
    private static String expectedRegisterCompleteMessage;

    public static void clickOnElement(By by){driver.findElement(by).click();}
    public static void typeText(By by,String text){driver.findElement(by).sendKeys(text);}
    public static String getTextFromElement(By by){return driver.findElement(by).getText();}
    public static long timestamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    @BeforeMethod
    public static void openBrowser(){
        //open chrome browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open url
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public static void teardown(){
        driver.close();
    }
    @Test
    public static void verifyUserAbleToRegisterSuccessfully(){
        //click on register button
        clickOnElement(By.className("ico-register"));
        //enter first name
        typeText(By.id("firstname"),"tim");
        //enter last name
        typeText(By.id("lastname"),"bean");
        //enter email
        typeText(By.id("email"), "xyz+"+timestamp() + "@gmail.com");
        //enter password
        typeText(By.id("password"),"text1234");
        //confirm password
        typeText(By.id("confirmpassword"),"text12345");
        //click on register submit button
        clickOnElement(By.id("register-button"));
        //gettingtext from result page
        String actualMassage = getTextFromElement(By.className("result"));
        System.out.println("my actual result is:"+ actualMassage);
        Assert.assertEquals(actualMassage,expectedRegisterCompleteMessage,"registration failed");

    }
}
