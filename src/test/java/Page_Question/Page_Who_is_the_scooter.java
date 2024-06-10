package Page_Question;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Who_is_the_scooter {
    private WebDriver driver;
    public Page_Who_is_the_scooter(WebDriver driver){
        this.driver = driver;


    }
    private final By FinalWindowOrder = By.xpath("//*[@id='root']/div/div[2]/div[5]/div[1]");
    private final By ButtonYesOrder = By.xpath("//*[@id='root']/div/div[2]/div[5]/div[2]/button[2]");

    public void setFinalWindowOrder (String finalWindowOrder) {
        driver.findElement(FinalWindowOrder).sendKeys(finalWindowOrder);
    }
    public void clickButtonYes() {
        driver.findElement(ButtonYesOrder).click();
    }
}
