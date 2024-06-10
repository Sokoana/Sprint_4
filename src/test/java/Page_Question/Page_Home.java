package Page_Question;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Home {
    private WebDriver driver;
    public Page_Home(WebDriver driver){
        this.driver = driver;
    }

    private By CookieConfirm = By.xpath("//*[@id='rcc-confirm-button']");
    private By topButtunOrder = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");
    private By LowerButtunOrder = By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[5]/button ");

    public void oder () {
        driver.findElement(topButtunOrder).click();

    }
    public void CookieButtonClick(){
        driver.findElement(CookieConfirm).click();
    }

    public void order_2(){
        driver.findElement(LowerButtunOrder).click();
    }
}
