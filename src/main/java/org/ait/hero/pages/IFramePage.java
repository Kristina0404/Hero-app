package org.ait.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IFramePage extends BasePage {

    public IFramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "content")
    List<WebElement> iframes;
    public IFramePage handleIFrame() {
        System.out.println("The total numners of iframes: " + iframes.size());
        return this;
    }
@FindBy(xpath = "//p[text()='Your content goes here.']")
WebElement iFrameText;
    public IFramePage switchToIFrameByIndex(int index) {
        driver.switchTo().frame(index);
        System.out.println("Text of the iframe: " + iFrameText.getText());
        return this;
    }

    @FindBy(id = "mce_0_ifr")
    WebElement iFrameById;
    @FindBy(css = "h3")
    WebElement text;

    public IFramePage switchToIFrameById() {
        driver.switchTo().frame(iFrameById);
        System.out.println("Text of the iframe: " + iFrameText.getText());
        driver.switchTo().defaultContent();
        System.out.println("Text of the iframe: " + text.getText());
        return this;
    }
}
