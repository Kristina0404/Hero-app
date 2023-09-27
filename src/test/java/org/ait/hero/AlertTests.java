package org.ait.hero;

import org.ait.hero.pages.AlertsPage;
import org.ait.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase{

    @BeforeMethod
    // click on link JavaScript Alerts
    public void preconditions(){

        new HomePage(driver).getAlerts();
    }
    @Test
    public void acceptAlert(){
        // click on the button Click for JS Alert
        // click on ok
        // assert result text

        new AlertsPage(driver).clickOnAlertButton()
                .acceptAlert()
                .verifyResult("You successfully clicked an alert");
    }

@Test
    public void confirmAlertTest(){
    // click on the button Click for JS Confirm
    // click on ok or cancel
    // assert result text ok or cancel
    new AlertsPage(driver).clickOnConfirmButton()
            .selectConfirm("cancel")
            .verifyResult("Cancel");

}

@Test
    public void sendMessageToAlertTest(){
    // click on the button Click for JS Prompt
    // enter hello world
    // click on ok
    // assert text result 'hello world'
        new AlertsPage(driver).clickOnPromptButton()
                .enterMessageToAlert("Hello World!")
                .acceptAlert()
                .verifyResult("Hello World!");
}

}
