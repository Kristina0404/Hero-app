package org.ait.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "frame")
   // @FindBy(xpath = "//frameset[@rows='50%,50%']")
    List<WebElement> frames;
    @FindBy(xpath = "//frame[@src='/frame_top']")
    WebElement frame1;
    @FindBy(xpath = "//frame[@src='/frame_bottom']")
    WebElement frame2;
    @FindBy(tagName = "body")
    WebElement body;

    public NestedFramesPage handleNestedFrames() {

        System.out.println("The total numbers of frames in the frame page: " + frames.size());
        driver.switchTo().frame(frame1);
        System.out.println("The total number of frames in the parent frame1: " + frames.size());

        driver.switchTo().frame(1);
        System.out.println("Frame is " + body.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(frame2);
        System.out.println("The total numbers of frames in the parent frame2: " + frames.size());
        System.out.println("Frame is " + body.getText());
        driver.switchTo().defaultContent();
        return this;
    }
}
