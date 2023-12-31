package org.ait.hero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='JavaScript Alerts']")
    WebElement alertsLink;

    public AlertsPage getAlerts() {
        click(alertsLink);
        return new AlertsPage(driver);
    }
    @FindBy(xpath = "//a[.='Multiple Windows']")
    WebElement windowsLink;
    public WindowPage getMultipleWindows() {
        click(windowsLink);
        return new WindowPage(driver);
    }

    @FindBy(xpath = "//a[.='Form Authentication']")
    WebElement formLink;
    public JSExecutor getFormAuthentication() {
        click(formLink);
        return new JSExecutor(driver);
    }
@FindBy(xpath = "//a[.='Broken Images']")
WebElement brokenImages;
    public ImagesPage getBrokenImages() {
        click(brokenImages);
        return new ImagesPage(driver);

    }
@FindBy(xpath = "//a[.='Frames']")
WebElement frames;
    public FramesPage getFrames() {
        click(frames);
        return new FramesPage(driver);
    }
@FindBy(css = "[href='/horizontal_slider']")
WebElement slider;
    public SliderPage getHorizontalSlider() {
        click(slider);
        return new SliderPage(driver);
    }
@FindBy(css = "[href='/checkboxes']")
WebElement checkboxes;
    public CheckboxesPage getCheckboxes() {
        click(checkboxes);
        return new CheckboxesPage(driver);

    }
@FindBy(css = "[href='/upload']")
WebElement upload;
    public FileUploadPage getFileUpload() {
        click(upload);
        return new FileUploadPage(driver);
    }
@FindBy(css = "[href='/dropdown']")
WebElement dropdown;
    public DropDownPage getDropdown() {
        click(dropdown);
        return new DropDownPage(driver);
    }
}
