package tests;

import core.pages.LoginPage;
import core.pages.MainPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static tests.enums.BotValues.LOGIN;
import static tests.enums.BotValues.PASSWD;

public class BaseTest {
    public String login = "technopol67";
    public String password;

    public static MainPage mainPage;
    @BeforeAll
    public static void prepareTests(){
        LoginPage lp = new LoginPage();
        lp.open().writeLogin(LOGIN.getValue()).writePassword(PASSWD.getValue());
        mainPage = new MainPage();
    }

    @AfterAll
    public static void cleanAfterTests(){

    }

}
