package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommunityPoll {

        protected static WebDriver driver;
        private static String expectedPolMessage;
        public static void clickOnElement(By by){driver.findElement(by).click();}
        public static String getTextFromElement(By by,String text){return driver.findElement(by).getText();}
        @BeforeMethod
        public static void openBrowser() {
            // open Chrome browser
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // open url
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();}
        @AfterMethod
        public static void closeBrowser(){
            driver.close();
        }
        @Test
        public static void VerifyUserAbleToPoleSuccessfully(){
            //click on good button
            clickOnElement(By.id("pollanswers-2"));
            //click on vote button
            clickOnElement(By.id("block-poll-vote-error-1"));
            //get text
            String actualMessage = getTestFromElement(By.className("poll-vote-1"));
            System.out.println("My message : "+actualMessage);
            Assert.assertEquals(actualMessage,expectedPolMessage,"registered users can vote");}

        private static  String getTestFromElement(By className){
            return null;
        }
        private static void clickOnElements(By id) {}}




