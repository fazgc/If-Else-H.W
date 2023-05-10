//package org.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.sql.Driver;
//import java.util.concurrent.TimeUnit;
//
//public class MavenPractice {
//    protected static WebDriver driver;
//    private static String timestamp;
//    //private static final simpleDateFormate timestamp = new simpleDateFormate();
//
//    //private static class simpleDateFormate {}
//    public static void main(String[] args) {
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
//        driver.get("https://demo.nopcommerce.com/");
//        //click on register button
//        driver.findElement(By.className("ico-register")).click();
//        //type firstname
//        driver.findElement(By.id("firstname")).sendKeys("testfirstname");
//        //type lastname
//        driver.findElement(By.id("lastname")).sendKeys("testlastname");
//        //type email adress
//        driver.findElement(By.name("email")).sendKeys("rajpatel+" + timestamp + "@gmail.com");
//        //type password
//        driver.findElement(By.id("Password")).sendKeys("Test1234");
//        //type confirm password
//        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test1234");
//        //click on register button
//        driver.findElement(By.id("regster-button")).click();
//        //get text from webelements
//        String actualMessage = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
//        System.out.println("+actualMessage");
//        driver.close();
//    }
//}
