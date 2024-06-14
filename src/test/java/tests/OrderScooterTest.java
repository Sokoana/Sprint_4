package tests;

import org.hamcrest.MatcherAssert;
import pagesfortest.Browsers;
import static org.hamcrest.CoreMatchers.is;

import org.junit.After;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import pagesfortest.OrderScotter;




@RunWith(Parameterized.class)
    public class OrderScooterTest {

        //выбор браузера для теста
        Browsers browser = new Browsers();
        WebDriver driver = browser.webDriverFromChrome();

        private final String firstName;
        private final String lastName;
        private final String address;
         private final String phoneNumber;
         private final String comment;


        // Конструктор для параметризованного теста
        public OrderScooterTest(String firstName, String lastName, String address, String phoneNumber, String comment) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.comment = comment;



        }
        // Параметры для теста
        @Parameterized.Parameters
        public static Object[][] getTextList() {
            return new Object[][]{
                    {"Вася", "Петров", "Тверь","+79152042561", "Тест"},
                    {"Катя", "Смирноова", "Москва", "+79152042561", "тест"}
        };
        }



        // Тестовый метод для верхней кнопки
        @Test


        public void testPassedScooterOrderByPageTopButton() {
            driver.get("https://qa-scooter.praktikum-services.ru/");

            OrderScotter pageOrderByPageTopButton = new OrderScotter(driver);
             pageOrderByPageTopButton.cookieButtonClick();
            pageOrderByPageTopButton.clickPageTopButtonOrder();
            pageOrderByPageTopButton.setOrderFields(firstName, lastName, address, phoneNumber);
            pageOrderByPageTopButton.setOrderFieldsAboutRent(comment);
            pageOrderByPageTopButton.setConfirmWindowOrder();
            pageOrderByPageTopButton.orderTitleIsDisplayed();

        }

        // Тестовый метод для нижней кнопки
        @Test

        public void testPassedScooterOrderByPageMiddleButton() {
            driver.get("https://qa-scooter.praktikum-services.ru/");
            OrderScotter pageOrderByPageTopButton = new OrderScotter(driver);
            pageOrderByPageTopButton.cookieButtonClick();
            pageOrderByPageTopButton.clickPagelowerButtonOrder();
            pageOrderByPageTopButton.setOrderFields(firstName, lastName, address, phoneNumber);
            pageOrderByPageTopButton.setOrderFieldsAboutRent(comment);
            pageOrderByPageTopButton.setConfirmWindowOrder();
            pageOrderByPageTopButton.orderTitleIsDisplayed();

        }
        @After
        public void tearDown() {

            if (driver != null) {
                driver.quit();
            }
        }
    }




