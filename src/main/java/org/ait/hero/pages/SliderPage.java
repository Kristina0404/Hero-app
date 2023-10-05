package org.ait.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SliderPage extends BasePage {
    public SliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[type='range']")
    WebElement sliderContainer;

    public SliderPage moveSliderInHorizontalDirection() {
        new Actions(driver).dragAndDropBy(sliderContainer, -65, 0).perform();
        return this;
    }
@FindBy(id = "range")
WebElement range;
    public SliderPage assertSliderValue(String number) {
        Assert.assertTrue(range.isDisplayed());
        return this;
    }

}
