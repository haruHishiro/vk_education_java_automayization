package tests;

import core.pages.AlbumsPage;
import core.pages.MainPage;
import core.pages.PhotoPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.NAV_USER_MAIN;
import static core.pages.enums.Locators.PP_CLOSE_BTN;
import static org.junit.jupiter.api.Assertions.*;

public class SetPhotoDescriptionTest extends BaseTest{
    PhotoPage photoPage;
    String oldDescriptionText = null;
    @BeforeEach
    public void prepareTest(){
        mainPage.clickPhotoBtn();
        AlbumsPage albumsPage = new AlbumsPage();
        albumsPage.openFirstPhoto();
        photoPage = new PhotoPage();
    }

    @ParameterizedTest
    @ValueSource(strings = {"описание", "description"})
    @Tag("photos")
    @Tag("photo description")
    public void setPhotoDescriptionTest(String description){
        oldDescriptionText = photoPage.getDescriptionText();
        photoPage.setDescription(description);
        String descriptionText = photoPage.getDescriptionText();
        assertEquals(description, descriptionText);
    }

    @AfterEach
    public void cleanAfterTest() {
        photoPage.setDescription(oldDescriptionText);
        photoPage.closePhotoPage();
        AlbumsPage albumsPage = new AlbumsPage();
        albumsPage.openMainPage();
    }
}
