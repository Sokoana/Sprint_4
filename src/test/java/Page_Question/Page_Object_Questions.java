package Page_Question;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;




public class Page_Object_Questions {
    WebDriver driver;


    public Page_Object_Questions(WebDriver driver) {
        this.driver = driver;
    }

    private  By CookieConfirm = By.xpath("//*[@id='rcc-confirm-button']");
    public String buttonNum = "//*[@id='accordion__heading-%d']";
    public String pointText = ".//div[@id='accordion__panel-%d']/p";

    public String getPoint(int ItemIndex) {
        return driver.findElement(By.xpath(String.format(pointText, ItemIndex))).getText();
    }

    public void checkButton(int ItemIndex) {
        driver.findElement(By.xpath(String.format(buttonNum, ItemIndex))).click();
    }




    public void CookieButtonClick() {
        driver.findElement(CookieConfirm).click();
    }
}














