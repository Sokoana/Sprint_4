import Page_Question.Page_Checkout;
import Page_Question.Page_Home;
import Page_Question.Page_Who_is_the_scooter;
import Page_Question.Page_rent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Test_3 {
    public WebDriver driver;


    @Test
    public void oderPage_1() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        Page_Home pageHome = new Page_Home(driver);
        pageHome.CookieButtonClick();
        // Найди футер
        WebElement element = driver.findElement(By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[5]/button"));
        // Прокрути страницу до футера
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        pageHome.order_2();
        Page_Checkout pageCheckout = new Page_Checkout(driver);

        pageCheckout.OrderInfo_1("Настяяя", "Соколовааа", "Москвааа", "+78225556265");
        Page_rent pageRent = new Page_rent(driver);
        pageRent.OrderInfo_2_1("тест");
        Page_Who_is_the_scooter pageWhoIsTheScooter = new Page_Who_is_the_scooter(driver);
        pageWhoIsTheScooter.clickButtonYes();
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[5]/div[1]/text()"));
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}




