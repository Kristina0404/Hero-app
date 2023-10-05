package org.ait.hero;

import org.ait.hero.TestBase;
import org.ait.hero.pages.HomePage;
import org.ait.hero.pages.SliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends TestBase {

    @BeforeMethod

    public void precondition() {
        new HomePage(driver).getHorizontalSlider();
    }
    @Test
    public void horizontalSliderTest() {
        new SliderPage(driver).moveSliderInHorizontalDirection()
                .assertSliderValue("5");
    }
}
