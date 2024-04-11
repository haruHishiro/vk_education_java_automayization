package tests;

import core.pages.LoginPage;
import core.pages.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static tests.enums.BotValues.FULL_NAME;

public class LoginTest extends BaseTest {


    @BeforeEach
    public void prepareTest() {

    }

    @Test
    public void loginTest(){
        String fullName = mainPage.getFullName();
        assertEquals(FULL_NAME.getValue(), fullName);
    }
    @AfterEach
    public void cleanAfterTest() {

    }
}
