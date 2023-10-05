package org.ait.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='Nested Frames']")
    WebElement nestedFrames;

    public FramesPage selectNestedFrames() {
        click(nestedFrames);
        return this;

    }

    @FindBy(css = "[href='/iframe']")
    WebElement iFrame;

    public FramesPage selectIFrame() {
        click(iFrame);
        return this;
    }
}
