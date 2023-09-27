package org.ait.hero;

import org.ait.hero.pages.HomePage;
import org.ait.hero.pages.ImagesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImagesTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBrokenImages();
    }
    @Test
    public void checkBrokenImages(){
    new ImagesPage(driver).checkBrokenImages();
    }
}
