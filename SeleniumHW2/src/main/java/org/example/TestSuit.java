package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class TestSuit {

    protected static WebDriver driver;  // calling web driver here

    static String expectedRegisterCompleteMessage = "Registration completed";
    static String expectedEmailShownOnWebPage = "customer can use email a friend feature";
    static String expectedClearListMassageOnPage = "You have no items to compare.";
    static String expectedCommunityMessage = "All users can vote.";
    static String expectedEmailMassageOnWebPage = "message has been sent.";
    static String expectedVotes = "vot(s)...";

    public static void clickOnElement(By by) {driver.findElement(by).click();} // declaring click on element method

    public static void typeText(By by, String text) {driver.findElement(by).sendKeys(text);} //calling type text

    public static String getTextFromElement(By by) {return driver.findElement(by).getText();} //get text methode

    public static long timestamp() {Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                                    return timestamp.getTime();}

    @BeforeMethode
    public static void openBrowser() {
        //open driver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //open url
        driver.get("https://demo.nopcommerce.com/");}

    @AfterMethode
    public static void closeBrowser() {
        driver.close();}

    @Test
    public static void verifyUserAbleToRegisterSuccessfully() {
        //click on register button
        clickOnElement(By.className("ico-register"));
        //enter first name
        typeText(By.id("firstname"), "tim");
        //enter last name
        typeText(By.id("lastname"), "bean");
        //enter email
        typeText(By.id("email"), "xyz+" + timestamp() + "@gmail.com");
        //enter password
        typeText(By.id("password"), "text1234");
        //confirm password
        typeText(By.id("confirmpassword"), "text12345");
        //click on register submit button
        clickOnElement(By.id("register-button"));
        //getting text from result page
        String actualMassage = getTextFromElement(By.className("result"));
        System.out.println("my actual result is:" + actualMassage);
        Assert.assertEquals(actualMassage, expectedRegisterCompleteMessage, "registration failed");
    }

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
        //GetText from web element
        String actualMessage = getTextFromElement(By.linkText("Only registered customers can use email a friend feature"));
        //show error
        System.out.println("My massage:" + actualMessage);
        String expectedmessage = null;
        Assert.assertEquals(actualMessage, expectedmessage, "you have sent successfully");
    }

    @Test
    public static void verifyUserAbleCompareProductsSuccessfully() {
        //click on product htc one m8 android comparison button
        clickOnElement(By.xpath("//button[contains(@fdprocessedid,\"7m36z5\")]"));
        //click on product £25 virtual gift card comparison button
        clickOnElement(By.xpath("//button[contains(@fdprocessedid,\"3890gh\")]"));
        //typeText(By.id("firstname"),"tim");
        // use implicity wait for pop up bar leading to product comparision page
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //click on green pop up bar showing product comparison tab
        clickOnElement(By.xpath("//a[contains(@href,'/compareproducts',product comparison)]"));
        // what is next step? action? findout requirment
        String actualMassage = getTextFromElement(By.className("result"));
        Assert.assertEquals(actualMassage, expectedClearListMassageOnPage, "comparison done");
    }

    @Test
    public static void VerifyUserAbleToPoleSuccessfully() {
        //click on good button
        clickOnElement(By.id("pollanswers-2"));
        //click on vote button
        clickOnElement(By.id("block-poll-vote-error-1"));
        //get text
        String actualMessage = getTextFromElement(By.className("poll-vote-1"));
        System.out.println("My message : " + actualMessage);
        Assert.assertEquals(actualMessage, expectedCommunityMessage, "registered users can vote");
    }

    @Test
    public static void verifyUserShouldAbleToGetProductsInShoppingCart() {
        //Click on Electronics
        clickOnElement(By.name("Electronics"));
        //Click on camera
        clickOnElement(By.className("Camera & photo "));
        //Click on Leica T Digital Camera
        clickOnElement(By.className("product-item"));
        //Enter Products Quantity
        typeText(By.id("product_enteredQuantity_16"), "nos");
        //Click on Add to cart
        clickOnElement(By.id("add to cart"));
        //Get Text The product has been added to your
        String actualMessage = getTextFromElement(By.className("content"));
        System.out.println("My massage:" + actualMessage);

        Assert.assertEquals("The product has been added to your Cart", "Your products added successfully");}
}