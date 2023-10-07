package org.ait.hero;

import org.ait.hero.pages.DropDownPage;
import org.ait.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDropdown();

    }
    @Test
    public void dropDownTest(){
        new DropDownPage(driver).selectOption(new String[]{"Option 1","Option 2"});
    }
}
