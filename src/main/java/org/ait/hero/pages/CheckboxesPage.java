package org.ait.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckboxesPage extends BasePage{
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }
@FindBy(css = "[type='checkbox']")
    WebElement checkbox;
    public CheckboxesPage selectCheckbox() {
    click(checkbox);
        return this;
    }
}

