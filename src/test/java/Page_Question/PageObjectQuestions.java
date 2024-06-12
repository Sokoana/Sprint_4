package Page_Question;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageObjectQuestions {
    WebDriver driver;


    public PageObjectQuestions(WebDriver driver) {
        this.driver = driver;
    }
    //локатор до окна с выпадающим списком вопросов
    private final By scrollToThePoint = By.xpath(".//div[@class= 'accordion']");
    private  By CookieConfirm = By.xpath("//*[@id='rcc-confirm-button']");
    public String buttonNum = "//*[@id='accordion__heading-%d']";
    public String pointText = ".//div[@id='accordion__panel-%d']/p";

    public String getPoint(int ItemIndex) {
        return driver.findElement(By.xpath(String.format(pointText, ItemIndex))).getText();
    }

    public void checkButton(int ItemIndex) {
        driver.findElement(By.xpath(String.format(buttonNum, ItemIndex))).click();
    }

    public void scrollOfListQuestions() {
        WebElement element = driver.findElement(scrollToThePoint);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(scrollToThePoint));
    }


    public void CookieButtonClick() {
        driver.findElement(CookieConfirm).click();
    }
}














