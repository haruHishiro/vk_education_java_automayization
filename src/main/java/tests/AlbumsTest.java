package tests;

import core.pages.AlbumsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.NAV_USER_MAIN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumsTest extends BaseTest {

    AlbumsPage albumsPage;
    @BeforeEach
    public void prepareTest(){
        mainPage.clickPhotoBtn();
        albumsPage = new AlbumsPage();
    }


    @Test
    @Tag("albums")
    @Tag("text display")
    public void albumsTest() {
        String albumsText = albumsPage.getAlbumsText();
        assertEquals("Альбомы", albumsText);
    }

    @AfterEach
    public void cleanAfterTest() {
        albumsPage.openMainPage();
    }
}
