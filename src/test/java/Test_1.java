
import Page_Question.Page_Object_Questions;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;



import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Test_1 {

    public WebDriver driver;
      int pointText;
    String resultText;


    public Test_1(int pointText, String resultText) {
        this.pointText = pointText;
        this.resultText = resultText;


       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");



    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getTextListQuestions() {
        return new Object[][]{
                {0, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {1, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {2, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {3, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {4, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {5, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {6, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {7, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},


        };

    }

    @Test
    public void testOpenQuestions() {


        // Найди футер
        WebElement element = driver.findElement(By.id("accordion__heading-0"));
        // Прокрути страницу до футера
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);


        Page_Object_Questions pageObjectQuestions = new Page_Object_Questions(driver);
             pageObjectQuestions.CookieButtonClick();

        pageObjectQuestions.checkButton(pointText);
        String actualText = pageObjectQuestions.getPoint(pointText);
        assertEquals(resultText, actualText);

    }

    @After
    public void tearDown() {
        driver.quit();


    }
}

