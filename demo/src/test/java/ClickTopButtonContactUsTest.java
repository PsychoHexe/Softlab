import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import io.qameta.allure.junit4.DisplayName;
import softlab.HomePage;

@DisplayName("Автотест нажатия на кнопку Войти")
public class ClickTopButtonContactUsTest extends BaseTest {

    @Test
    @DisplayName("Проверка открытия формы службы сервиса")
    public void serviceFormTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.waitLoadHomePage();
        homePage.clickButtonContactUs();
        TimeUnit.SECONDS.sleep(2);
        
                
        assertEquals("Перезвоним в течение рабочего дня и ответим на ваши вопросы.",  homePage.getTextLogin());
    }


}
