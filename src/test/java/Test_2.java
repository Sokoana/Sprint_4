import Page_Question.Page_Home;
import Page_Question.Page_Checkout;
import Page_Question.Page_Who_is_the_scooter;
import Page_Question.Page_rent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;




public class Test_2 {
    public WebDriver driver;


    @Test
    public void oderPage_1() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        Page_Home pageHome = new Page_Home(driver);
        pageHome.CookieButtonClick();
        pageHome.oder();
        Page_Checkout pageCheckout = new Page_Checkout(driver);


        pageCheckout.OrderInfo_1("Настя", "Соколова", "Москва", "+78885556265");
        new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[3]/button[1]")));
        Page_rent pageRent = new Page_rent(driver);
        pageRent.OrderInfo_2();
      Page_Who_is_the_scooter pageWhoIsTheScooter = new Page_Who_is_the_scooter(driver);
        pageWhoIsTheScooter.clickButtonYes();
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[5]/div[1]/text()"));

    }

    @After
    public void tearDown() {
        driver.quit();
  }
}




