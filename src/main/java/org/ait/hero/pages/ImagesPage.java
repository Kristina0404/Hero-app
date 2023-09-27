package org.ait.hero.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ImagesPage extends BasePage{
    public ImagesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(tagName = "img")
    List<WebElement> images;

    public ImagesPage checkBrokenImages() {
        System.out.println("Total number images of the page: " + images.size());
        for (int i = 0; i < images.size(); i++) {
            WebElement image = images.get(i);
            String imageUrl = image.getAttribute("src");
            System.out.println("URL of image " + (i + 1) + " is " + imageUrl);
            verifyImage(imageUrl);
            try{
                boolean imageDisplayed =(Boolean)((JavascriptExecutor)driver)
                        .executeScript("return (typeof arguments[0].naturalWidth!=undefined + " +
                                "&& arguments[0].naturalWidth >0);",image);
                if(imageDisplayed) {
                    System.out.println("DISPLAY -OK");
                    System.out.println("****************");
                } else {
                    System.out.println("DISPLAY -BROKEN");
                    System.out.println("****************");
                }
            }catch (Exception ex) {
                System.out.println("Error OCCURRED");
                System.out.println("**************");
            }

        }
        return this;
    }

    public void verifyImage(String imageUrl) {
        try{
            URL url = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            if(connection.getResponseCode()>=400){
                System.out.println(imageUrl + " - " + connection.getResponseMessage() + " is a broken image");

            }else {
                System.out.println(imageUrl + " - " + connection.getResponseMessage());
            }
        }catch (Exception ex){
            System.out.println(imageUrl + " - " + ex.getMessage() + " is a broken image");
        }
    }
}
