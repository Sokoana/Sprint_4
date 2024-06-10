package Page_Question;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Page_Checkout {

    private WebDriver driver;
    public Page_Checkout(WebDriver driver){
        this.driver = driver;
    }

    private By name = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/input");
    private By surname = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/input");
    private By adress = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[3]/input");
    private By ListMetro = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/div/div/input");
    private By stationMetro_1=By.xpath(".//div[text()='Черкизовская']");
    private By stationMetro_2=By.xpath(".//div[text()='Сокольники']");
    private By number = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[5]/input");
    private By ButtonNext = By.xpath(".//button[text()='Далее']");


    public void setUsername(String username) {
        driver.findElement(name).sendKeys(username);
    }
    public void setSurname(String surnameuser) {
        driver.findElement(surname).sendKeys(surnameuser);
    }
    public void setAdress(String adressuser) {
        driver.findElement(adress).sendKeys(adressuser);
    }
    public void setNumber (String usernumber) {
        driver.findElement(number).sendKeys(usernumber);
    }
    public void setStationMetro_1() {
        driver.findElement(stationMetro_1).click();
    }
    public void setStationMetro_2() {
        driver.findElement(stationMetro_2).click();
    }
    public void clickButton() {
        driver.findElement(ButtonNext).click();
    }
    public void clickStation() {
        driver.findElement(ListMetro).click();
    }
    public void OrderInfo_1(String username, String surnameuser,String adressuser,String usernumber){
        setUsername(username);
        setSurname(surnameuser);
        setAdress(adressuser);
        clickStation();
        setStationMetro_1();
        setNumber(usernumber);
        clickButton();
    }
    public void OrderInfo_2(String username, String surnameuser,String adressuser,String usernumber){
        setUsername(username);
        setSurname(surnameuser);
        setAdress(adressuser);
        clickStation();
        setStationMetro_2();
        setNumber(usernumber);
        clickButton();

    }
    private By headerOrder = By.xpath("//*[@id='root']/div/div[2]/div[1]");

    // метод ожидания загрузки страницы
    public void waitForLoadHeader(){
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div[2]/div[1]")));
    }
    // метод для получения текста элемента в заголовке
    public String headerInOrder(){
        return driver.findElement(headerOrder).getText();
    }

}
