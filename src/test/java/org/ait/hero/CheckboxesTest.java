package org.ait.hero;

import org.ait.hero.pages.CheckboxesPage;
import org.ait.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getCheckboxes();

    }
    @Test
public void CheckboxesTest(){
        new CheckboxesPage(driver).selectCheckbox();
    }
}
