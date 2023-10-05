package org.ait.hero;

import org.ait.hero.pages.FramesPage;
import org.ait.hero.pages.HomePage;
import org.ait.hero.pages.NestedFramesPage;
import org.ait.hero.pages.IFramePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getFrames();
    }

    @Test
    public void nestedFrameTest() {

        new FramesPage(driver).selectNestedFrames();
        new NestedFramesPage(driver).handleNestedFrames();
    }

    @Test
    public void iFrameTest() {
        new FramesPage(driver).selectIFrame();
        new IFramePage(driver).handleIFrame().switchToIFrameByIndex(0);

    }

    @Test

    public void switchToIFrameByIdTest() {
        new FramesPage(driver).selectIFrame();
        new IFramePage(driver).switchToIFrameById();
    }
}
