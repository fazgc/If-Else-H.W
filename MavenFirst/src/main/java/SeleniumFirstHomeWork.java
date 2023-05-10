import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

//import static java.lang.System.*;

public class SeleniumFirstHomeWork {
        protected static WebDriver driver;
        public static clickOnElement()
        static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        public static void main(String[] args) {

            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://demo.nopcommerce.com");

            //click on register button
            driver.findElement(By.className("ico-register")).click();
            //clickOnElement(By.SeleniumFirstHomeWork("ico-register"));
            //type first name
            driver.findElement(By.id("First name")).sendKeys("TestFirstName");
            //typetaxt(By.id("Firstname"), "testfirst");
            //type last name
            driver.findElement(By.id("Last name")).sendKeys("TestLastName");
            //typetaxt(By.id("lastname"),"testlastname");
            //type email address
            driver.findElement(By.name("Email")).sendKeys("testemail+"+timestamp.getTime()+"@gmail.com");
            //typetaxt(By.name("email"),"testmail+" + timestamp() + "@gmail.com");
            //type password
            driver.findElement(By.id("password")).sendKeys("test1234");
            //typetaxt(By.id("password"), "test1234");
            //type confirm password
            driver.findElement(By.id("Confirm Password")).sendKeys("test1234");
            //typetaxt(By.id("confirmpassword"), "test1234");
            //click on register submit button
            driver.findElement(By.id("register-button")).click();
            //clickOnElement(By.id("register-button"));
            String actualMessage = getTextFormElement(By.xpath("//div@class=\"));
                    System.out.println("My Message : "+ actualMessage);
            Assert.assertEquals(actualMessage,expectedRegistrationCompleteMSG,"registration" + "is not working");
            driver.close();

        }

    }