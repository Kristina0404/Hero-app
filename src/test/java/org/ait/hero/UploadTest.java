package org.ait.hero;

import org.ait.hero.pages.FileUploadPage;
import org.ait.hero.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.ait.hero.pages.FileUploadPage.photoPath;

public class UploadTest extends TestBase{
    @BeforeMethod

    public void precondition() {
        new HomePage(driver).getFileUpload();
    }

    @Test

    public void fileUploadTest() {
        new FileUploadPage(driver).uploadFile(photoPath)
                .submit();

    }
}
