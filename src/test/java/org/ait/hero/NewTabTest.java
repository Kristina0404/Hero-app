package org.ait.hero;

import org.ait.hero.pages.HomePage;
import org.ait.hero.pages.WindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTabTest extends TestBase {
    //click on Multiple Windows link
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getMultipleWindows();
    }

    @Test
    public void switchToNewTabTest(){
        // click on Click here link and switch to new tab
        // assert New tab
        new WindowPage(driver).switchToNewTab(1)
                .verifyNeTabTitle("New Window");
    }

}
