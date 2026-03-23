package softlab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //локаторы
    public final By logoHeader = By.className("header__logotype");
    public final By topButtonContactUs = By.className("top__button");
    public final By txtFromForm = By.className("form__description");


    @Step("ожидание загрузки страницы")
    public void waitLoadHomePage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(logoHeader));
    }

    @Step("нажать на кнопку Связаться с нами")
    public void clickButtonContactUs() {
        driver.findElement(topButtonContactUs).click();
    }

    @Step("Изъять текст из формы")
    public String getTextLogin() {
        String text = driver.findElement(txtFromForm).getText();
        return text;
    }


}
