//package org.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.
//        Test;
//import java.sql.Timestamp;
//        import java.util.concurrent.TimeUnit;
//        public class Registration {
//            @BeforeMethod
//
//            public static void openBroser(){
//                driver= new ChromeDriver();
//                driver.get("https://demo.nopcommerce.com/");
//                driver.manage().window().minimize();
//                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); }
//            @AfterMethod
//            public static void classBrowser(){
//                driver.close(); }
//            @Test
//            public static void veryficationUserShouldBeAbleT0RegisterSucseccfully(){
//                //open Chrome browser
//                 driver = new ChromeDriver(); }
//                protected static WebDriver driver;
//            static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//            public static void clickOnElement(By by){
//                //click on register button
//                clickOnElement(By.className("ico-register"));
//                driver.findElement(By.className("ico-register")).click();
//                //click on reg button
//                 driver.findElement(by).click(); }
//            public static void
//            typeText(By by,String text) { driver.findElement(by).sendKeys(text); }
//            public static String getTextFromElement (By by){
//                String actualMessage = driver.findElement(by).getText();
//                return actualMessage; }
//            public static long timestamp () {
//                Timestamp timestamp1 = new Timestamp(System.currentTimeMillis()); return timestamp1.getTime(); } }
