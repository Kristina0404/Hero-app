package org.ait.hero;

import org.ait.hero.pages.HomePage;
import org.ait.hero.pages.JSExecutor;
import org.ait.hero.pages.data.UserData;
import org.testng.annotations.Test;

public class JSExecutorTests extends TestBase{

    @Test
    public void jsExecutorTest(){
        new HomePage(driver).getFormAuthentication();
        new JSExecutor(driver).enterDataWithJSE(UserData.USER_NAME,
                UserData.USER_PASSWORD)
        .clickOnLoginButtonWithJSE()
                .checkURLWithJSE();
    }
}
