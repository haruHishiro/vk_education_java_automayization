package tests;

import core.pages.FriendsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
    public void friendsTest(){
        String friendsText = friendsPage.getFriendsText();
        assertEquals("��� ������", friendsText);
    }

    @AfterEach
    public void cleanAfterTest() {
        $x(NAV_USER_MAIN.getLocator()).click();
    }
}
