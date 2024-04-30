package tests;

import core.pages.FriendsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.NAV_USER_MAIN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HaveFriendsTest extends BaseTest {

    FriendsPage friendsPage;
    @BeforeEach
    public void prepareTest() {
        mainPage.clickFriendsBtn();
        friendsPage = new FriendsPage();
    }
    @Test
    @Tag("friends")
    @Tag("text display")
    public void friendsTest(){
        String friendsText = friendsPage.getFriendsText();
        assertEquals("Мои друзья", friendsText);
    }

    @AfterEach
    public void cleanAfterTest() {
        friendsPage.openMainPage();
    }
}
