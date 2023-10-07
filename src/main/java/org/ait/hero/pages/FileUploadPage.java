package org.ait.hero.pages;

import org.ait.hero.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {
public static final String photoPath = "C:/Users/AIT TR Student/OneDrive/Изображения/DesktopIMage.png";
    public FileUploadPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "file-upload")
    WebElement choice;
    public FileUploadPage uploadFile(String photoPath) {
        pause(500);
        choice.sendKeys(photoPath);
        return this;
    }

    @FindBy(xpath = "//input[@id='file-submit']")
    WebElement file_submit;
    public FileUploadPage submit() {
        click(file_submit);
        return this;
    }

}