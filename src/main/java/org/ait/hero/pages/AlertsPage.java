package org.ait.hero.pages;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[onclick='jsAlert()']")
    WebElement jsAlert;

    public AlertsPage clickOnAlertButton() {
        click(jsAlert);
        return this;
    }

    public AlertsPage acceptAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent()).accept();
        } catch (NoAlertPresentException ex) {
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement result;

    public AlertsPage verifyResult(String message) {
        Assert.assertTrue(shouldHaveText(result, message, 5));

        return this;
    }

    @FindBy(css = "[onclick='jsConfirm()']")
    WebElement jsConfirm;

    public AlertsPage clickOnConfirmButton() {
        click(jsConfirm);
        return this;
    }

    public AlertsPage selectConfirm(String confirm) {
        if(confirm!= null && confirm.equalsIgnoreCase("ok")){
            driver.switchTo().alert().accept();
        }else if (confirm!=null && confirm.equalsIgnoreCase("cancel")){
            driver.switchTo().alert().dismiss();
        }
        return this;
    }
@FindBy(css = "[onclick='jsPrompt()']")
WebElement jsPrompt;
    public AlertsPage clickOnPromptButton() {
        click(jsPrompt);
        return this;
    }

    public AlertsPage enterMessageToAlert(String message) {
        if(message!= null){
            driver.switchTo().alert().sendKeys(message);
        }
        return this;
    }
}
