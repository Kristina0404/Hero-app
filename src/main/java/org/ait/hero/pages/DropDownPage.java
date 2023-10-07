package org.ait.hero.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.image.Kernel;

public class DropDownPage extends BasePage {
    public DropDownPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id="dropdown")
    WebElement inputSelect;
    @FindBy(css= "html")
    WebElement space ;
    public DropDownPage selectOption(String[] options) {
    for (int i = 0; i < options.length; i++) {
        if(options[i] != null){
            inputSelect.sendKeys(options[i]);
            inputSelect.sendKeys(Keys.ENTER);
        }
    }
        click(space);
        return this;
    }
}
