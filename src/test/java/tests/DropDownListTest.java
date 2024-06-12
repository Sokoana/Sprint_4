package tests;


import Page_Question.Browsers;
import Page_Question.PageObjectQuestions;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DropDownListTest {

    Browsers browser = new Browsers();
    WebDriver driver = browser.webDriverFromChrome();


    int pointText;
    String resultText;


    public DropDownListTest(int pointText, String resultText) {
        this.pointText = pointText;
        this.resultText = resultText;





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



        // перешли на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

        PageObjectQuestions pageObjectQuestions = new PageObjectQuestions(driver);
        pageObjectQuestions.CookieButtonClick();
        pageObjectQuestions.scrollOfListQuestions();
        pageObjectQuestions.checkButton(pointText);
        String actualText = pageObjectQuestions.getPoint(pointText);
        assertEquals(resultText, actualText);

    }

    @After
    public void tearDown() {
        driver.quit();


    }
}