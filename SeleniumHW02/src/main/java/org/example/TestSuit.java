package org.example;

//import java.sql.Timestamp;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//import java.sql.Timestamp;
//import java.util.concurrent.TimeUnit;
//
//public class TestSuit {
//
//    protected static WebDriver driver;
//
//        private static String expectedRegisterCompleteMessage;
//
//        public static void clickOnElement(By by){driver.findElement(by).click();}
//        public static void typeText(By by,String text){driver.findElement(by).sendKeys(text);}
//        public static String getTextFromElement(By by){return driver.findElement(by).getText();}
//        public static long timestamp(){
//            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//            return timestamp.getTime();
//        }
//        @BeforeMethod
//        public static void openBrowser(){
//            //open chrome browser
//            driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            //open url
//            driver.get("https://demo.nopcommerce.com/");
//            driver.manage().window().maximize();
//        }
//        @AfterMethod
//        public static void teardown(){
//            driver.close();
//        }
//        @Test
//        public static void verifyUserAbleToRegisterSuccessfully(){
//            //click on register button
//            clickOnElement(By.className("ico-register"));
//            //enter first name
//            typeText(By.id("firstname"),"tim");
//            //enter last name
//            typeText(By.id("lastname"),"bean");
//            //enter email
//            typeText(By.id("email"), "xyz+"+timestamp() + "@gmail.com");
//            //enter password
//            typeText(By.id("password"),"text1234");
//            //confirm password
//            typeText(By.id("confirmpassword"),"text12345");
//            //click on register submit button
//            clickOnElement(By.id("register-button"));
//            //gettingtext from result page
//            String actualMassage = getTextFromElement(By.className("result"));
//            System.out.println("my actual result is:"+ actualMassage);
//            Assert.assertEquals(actualMassage,expectedRegisterCompleteMessage,"registration failed");}
//
//        @Test
//         public static void VerifyUserAbleToPoleSuccessfully(){
//        //click on good button
//        clickOnElement(By.id("pollanswers-2"));
//        //click on vote button
//        clickOnElement(By.id("block-poll-vote-error-1"));
//        //get text
//        String actualMessage = getTestFromElement(By.className("poll-vote-1"));
//        System.out.println("My message : "+actualMessage);
//        Assert.assertEquals(actualMessage,expectedPolMessage,"registered users can vote");}
//
//        @Test
//
//        public static void verifyUserShouldBeAbleToSendEmailToFriendSuccessfully() {
//        //Click on Products
//        clickOnElement(By.className("Apple MacBook Pro 13-inch"));
//        //Click on Email a friend button
//        clickOnElement(By.className("email-a-friend-button)"));
//        //Type your email
//        typetext((By.name("Email")), "test1email" + timestamp() + "@gmail.com");
//        //Type friend's email
//        typetext((By.name("Email")), "test2email" + timestamp() + "@gmail.com");
//        //Type msg for friend
//        typetext((By.id("PersonalMessage")), "Hello");
//        //Click on Send email button
//        clickOnElement(By.name("send-email"));
//        //GetText from webelement
//        String actualMessage = getTextFromElement(By.linkText("Only registered customers can use email a friend feature"));
//
//        //show error
//        System.out.println("My massage:" + actualMessage);
//        String expectedmessage = null;
//        Assert.assertEquals(actualMessage, expectedmessage, "you have sent succesfully");}
//
//    @Test
//    public static void verifyUsershouldAbleToGetProductsInShoppingCart(){
//        //Click on Electronics
//        clickOnElements(By.name("Electronis"));
//        //Click on camera
//        clickOnElements(By.className("Camera & photo "));
//        //Click on Leica T Digital Camera
//        clickOnElements(By.className("product-item"));
//        //Enter Products Quantity
//        typetext(By.id("product_enteredQuantity_16"), "nos");
//        //Click on Add to cart
//        clickOnElements(By.id("add to cart"));
//        //Get Text The product has been added to your
//        String actualMessage =  getTextFromElement(By.className("content"));
//        System.out.println("My massage:"+ actualMessage);
//
//        Assert.assertEquals("The product has been added to your Cart", "Your products added successfully");}
//
//          @Test
//          public static void verifyUserAbleToCompareProducts(){
//          //click on product htc one m8 android comparison button
//           clickOnElement(By.xpath("//button[contains(@fdprocessedid,\"7m36z5\")]"));
//           //click on product £25 virtual gift card comparison button
//           clickOnElement(By.xpath("//button[contains(@fdprocessedid,\"3890gh\")]"));
//           //typeText(By.id("firstname"),"tim");
//           // use implicity wait for pop up bar leading to product comparision page
//            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//           //click on green pop up bar showing product comparison tab
//           clickOnElement(By.xpath("//a[contains(@href,'/compareproducts',product comparison)]"));
//           // what is next step? action? findout requirment
//           String actualMassage = getTextFromElement(By.className("result"));
//           Assert.assertEquals(actualMassage,expectedmessage,"comparison done");
//
//    }
//
//}
