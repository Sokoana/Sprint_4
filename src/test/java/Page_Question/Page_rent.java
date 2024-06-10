package Page_Question;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_rent {
    private WebDriver driver;
    public Page_rent(WebDriver driver){
        this.driver = driver;
    }
    private By ButtonDate = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div[1]/div/input");
    private By ButtonDateOrder_1 = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[6]");
    private By ButtonDateOrder_2 = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[6]");
    private By ButtonTermRent = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[1]/div[1]");
    private By ButtonListTerm_1 = By.xpath(".//div[text()='сутки']");
    private By ButtonListTerm_2 = By.xpath(".//div[text()='сутки']");
    private By CheckBoxBlackColor=By.xpath("//*[@id='root']/div/div[2]/div[2]/div[3]/label[1]");
    private By CheckBoxGreyColor=By.xpath("//*[@id='grey']");
    private By ButtonTakeOrder = By.xpath("//*[@id='root']/div/div[2]/div[3]/button[2]");
    private By Comment = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/input");

    public void setButtonDate() {
        driver.findElement(ButtonDate).click();
    }
    public void setButtonDateOrder_1() {
        driver.findElement(ButtonDateOrder_1).click();
    }
    public void setButtonDateOrder_2() {
        driver.findElement(ButtonDateOrder_2).click();
    }
    public void setButtonTermRent() {
        driver.findElement(ButtonTermRent).click();
    }
    public void setButtonListTerm_1() {
        driver.findElement(ButtonListTerm_1).click();
    }
    public void setButtonListTerm_2() {
        driver.findElement(ButtonListTerm_2).click();
    }
    public void setCheckBoxBlackColor() {
        driver.findElement(CheckBoxBlackColor).click();
    }
    public void setCheckBoxGreyColor() {
        driver.findElement(CheckBoxGreyColor).click();


    }
    public void setComment(String usercomment) {
        driver.findElement(Comment).sendKeys(usercomment);
    }
    public void setButtonTakeOrder() {
        driver.findElement(ButtonTakeOrder).click();
    }

    public void OrderInfo_2(){
        setButtonDate();
        setButtonDateOrder_1();
        setButtonTermRent();
        setButtonListTerm_1();
        setCheckBoxBlackColor();
        setButtonTakeOrder();
    }
    public void OrderInfo_2_1(String usercomment){
        setButtonDate();
        setButtonDateOrder_2();
        setButtonTermRent();
        setButtonListTerm_2();
        setCheckBoxGreyColor();
        setComment(usercomment);
        setButtonTakeOrder();
    }



}
