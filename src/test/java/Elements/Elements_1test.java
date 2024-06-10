package Elements;

public class Elements_1test {
    //Заголовок страницы
    ///html/head/title
    //<title>undefined</title>
    //<img src="/assets/scooter.svg" alt="Scooter">
    //Заголовок "Вопросы о важном"
    //*[@id="root"]/div/div[1]/div[5]/div[1]
    //<div class="Home_SubHeader__zwi_E">Вопросы о важном</div>
    //Вопрос:Сколько это стоит? И как оплатить?
    //*[@id="accordion__heading-0"]
    //<div id="accordion__heading-0" aria-disabled="true" aria-expanded="true" aria-controls="accordion__panel-0" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Сколько это стоит? И как оплатить?</div>
    //Ответ:Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    //*[@id="accordion__panel-0"]/p
    //<p>Сутки — 400 рублей. Оплата курьеру — наличными или картой.</p>
    //Вопрос:Хочу сразу несколько самокатов! Так можно?
    //*[@id="accordion__heading-1"]
    //<div id="accordion__heading-1" aria-disabled="false" aria-expanded="false" aria-controls="accordion__panel-1" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Хочу сразу несколько самокатов! Так можно?</div>
    //Ответ:Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.
    //*[@id="accordion__panel-1"]/p
    //<p>Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.</p>
    //Вопрос:Как рассчитывается время аренды?
    //*[@id="accordion__heading-2"]
    //<div id="accordion__heading-2" aria-disabled="false" aria-expanded="false" aria-controls="accordion__panel-2" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Как рассчитывается время аренды?</div>
    //Ответ:Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.
    //*[@id="accordion__panel-2"]/p
    //Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.
    //Вопрос:Можно ли заказать самокат прямо на сегодня?
    //*[@id="accordion__heading-3"]
    //<div id="accordion__heading-3" aria-disabled="true" aria-expanded="true" aria-controls="accordion__panel-3" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Можно ли заказать самокат прямо на сегодня?</div>
    //Ответ:Только начиная с завтрашнего дня. Но скоро станем расторопнее.
    //*[@id="accordion__panel-3"]/p
    //<p>Только начиная с завтрашнего дня. Но скоро станем расторопнее.</p>
    //Вопрос:Можно ли продлить заказ или вернуть самокат раньше?
    //*[@id="accordion__heading-4"]
    //<div id="accordion__heading-4" aria-disabled="true" aria-expanded="true" aria-controls="accordion__panel-4" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Можно ли продлить заказ или вернуть самокат раньше?</div>
    //Ответ:Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.
    //*[@id="accordion__panel-4"]/p
    //<p>Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.</p>
    //Вопрос:Вы привозите зарядку вместе с самокатом?
    //*[@id="accordion__heading-5"]
    //<div id="accordion__heading-5" aria-disabled="true" aria-expanded="true" aria-controls="accordion__panel-5" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Вы привозите зарядку вместе с самокатом?</div>
    //Ответ:Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.
    //*[@id="accordion__panel-5"]/p
    //<p>Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.</p>
    //Вопрос:Можно ли отменить заказ?
    //*[@id="accordion__heading-6"]
    //<div id="accordion__heading-6" aria-disabled="true" aria-expanded="true" aria-controls="accordion__panel-6" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Можно ли отменить заказ?</div>
    //Ответ:Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.
    //*[@id="accordion__panel-6"]/p
    //<p>Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.</p>
    //Вопрос:Я жизу за МКАДом, привезёте?
    //*[@id="accordion__heading-7"]
    //<div id="accordion__heading-7" aria-disabled="true" aria-expanded="true" aria-controls="accordion__panel-7" role="button" tabindex="0" class="accordion__button" data-accordion-component="AccordionItemButton">Я жизу за МКАДом, привезёте?</div>
    //Ответ:Да, обязательно. Всем самокатов! И Москве, и Московской области.
    //*[@id="accordion__panel-7"]/p
    //<p>Да, обязательно. Всем самокатов! И Москве, и Московской области.</p>
    //кнопка "Да все привыкли"
    //*[@id="rcc-confirm-button"]
    //<button class="App_CookieButton__3cvqF" id="rcc-confirm-button" style="background: rgb(255, 212, 45); border: 0px; border-radius: 0px; box-shadow: none; color: black; cursor: pointer; flex: 0 0 auto; padding: 5px 10px; margin: 15px;">да все привыкли</button>

}
