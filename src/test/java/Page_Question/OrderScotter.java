package Page_Question;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;



public class OrderScotter {
    WebDriver driver;
  public  OrderScotter (WebDriver driver) {
        this.driver = driver;
    }


    //локаторы станицы Для кого самокат
    private By сookieConfirm = By.xpath("//*[@id='rcc-confirm-button']");


    private By topButtunOrder = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");
    private By LowerButtunOrder = By.className("Button_Middle__1CSJM");;

    private By nameField = By.xpath(".//input[@placeholder='* Имя']");

    private By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    private By adressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    private By numberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By buttonNext = By.className("Button_Middle__1CSJM");
    //локаторы страницы Про аренду
   private By date = By.xpath(".//div/div[@class = 'react-datepicker__input-container']/input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");
    //клик на выбор к-л даты
    private By choiceDate = By.xpath(".//div[@class = 'react-datepicker__day react-datepicker__day--018']");
    //локатор черного цвета самоката
    private By checkboxColorScooter = By.xpath(".//div/div/label/input[@class = 'Checkbox_Input__14A2w']");
    //путь до окна с выбором срока аренды
    private By listRentPeriod = By.xpath(".//div/span[@class = 'Dropdown-arrow']");
    //путь до выбора срока аренды - элемент с текстом трое суток
    private By choiceRentPeriod = By.xpath(".//div/div[text() = 'трое суток']");


    //локатор поля "Комментарий для курьера"
    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    private By buttonOrder = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

     //локатор для поиска поля подтверждения заказа
     private final By confirmWindow = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    //локатор для кнопка Да
    private final By buttonYes = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    private final By station = By.xpath(".//div/input[@class = 'select-search__input']");//для клика по полю
    //локатор для выбора станции в выпавшем списке с метро
    private final By inputStation = By.xpath(".//div[text() = 'Бульвар Рокоссовского']");





    public void CookieButtonClick() {
        driver.findElement(сookieConfirm).click();
    }

    public void clickPageTopButtonOrder() {
        driver.findElement(topButtunOrder).click();
    }

    //метод клика на кнопку "Заказать" внизу экрана
    public void clickPagelowerButtonOrder() {
        driver.findElement(LowerButtunOrder).click();

    }

    public void setnameField(String username) {
        driver.findElement(nameField).sendKeys(username);
    }

    public void setSurnameField(String surnameuser) {
        driver.findElement(surnameField).sendKeys(surnameuser);
    }

    public void setAdressField(String adressuser) {
        driver.findElement(adressField).sendKeys(adressuser);
    }

    public void setNumberField(String usernumber) {
        driver.findElement(numberField).sendKeys(usernumber);
    }

    //метод заполнения полей формы Для кого самокат
    public void setOrderFields(String username, String surnameuser, String adressuser,String usernumber) {
        setnameField(username);
        setSurnameField(surnameuser);
        setAdressField(adressuser);
        setNumberField(usernumber);
        clickButtonStationUserDataWindow();
        waitForLoadListOfMetroUserDataWindow();
        clickChoiceToStationUserDataWindow();
        clickButtonNextUserDataWindow();

    }



    //метод заполнения полей формы аренды
    public void setOrderFieldsAboutRent (String comment) {

        clickDateRentWindow();
        clickChoiceDateRentWindow();
        clickListRentPeriodWindow();
        clickChoiceRentPeriodWindow();
        selectBlackColorOrderAboutRent();
        setCommentField(comment);
        clickButtonOrderRentWindow();
    }

    public void clickListRentPeriodWindow(){
        driver.findElement(listRentPeriod).click();
    }

    //выбор варианта аренды в окне аренды
    public void clickChoiceRentPeriodWindow(){
        driver.findElement(choiceRentPeriod).click();
    }

    public void setCommentField(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }
    //кликнули на поле Метро для выбора станции
    public void clickButtonStationUserDataWindow() {
        driver.findElement(station).click();
    }

    //ждем подгрузки списка после клика
    public void waitForLoadListOfMetroUserDataWindow() {
        new WebDriverWait(driver, 5).until(driver -> (driver.findElement(inputStation).getText() != null));
    }

    //выбор из выпавшего списка станции
    public void clickChoiceToStationUserDataWindow(){
        driver.findElement(inputStation).click();
    }


    public void clickButtonNextUserDataWindow() {
        driver.findElement(buttonNext).click();
    }


    public void clickDateRentWindow(){
        driver.findElement(date).click();
    }

    //клик на выбор даты
    public void clickChoiceDateRentWindow(){
        driver.findElement(choiceDate).click();
    }
//    }
        //метод выбора черного цвета самоката
        public void selectBlackColorOrderAboutRent () {
            driver.findElement(checkboxColorScooter).click();
        }


        public void clickButtonOrderRentWindow(){
            driver.findElement(buttonOrder).click();
        }

        //метод проверки заголовка "Заказ оформлен"
        public void setConfirmWindowOrder(){
            driver.findElement(confirmWindow).isEnabled();
            driver.findElement(buttonYes).click();
        }
    }







