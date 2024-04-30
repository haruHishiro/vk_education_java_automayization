package tests;

import core.pages.PhotosPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.NAV_USER_MAIN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumsTest extends BaseTest {

    PhotosPage photosPage;
    @BeforeEach
    public void prepareTest(){
        mainPage.clickPhotoBtn();
        photosPage = new PhotosPage();
    }

    @Test
    public void albumsTest() {
        String albumsText = photosPage.getAlbumsText();
        assertEquals("Альбомы", albumsText);
    }

    @AfterEach
    public void cleanAfterTest() {
        $x(NAV_USER_MAIN.getLocator()).click();
    }
}
