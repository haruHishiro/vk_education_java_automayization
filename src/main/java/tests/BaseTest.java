package tests;

import com.codeborne.selenide.Selenide;
import core.pages.LoginPage;
import core.pages.MainPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static tests.enums.BotValues.LOGIN;
import static tests.enums.BotValues.PASSWD;

public class BaseTest {

    public static MainPage mainPage;
    @BeforeAll
    public static void setup(){
        Selenide.open("https://ok.ru/");
        LoginPage lp = new LoginPage();
        lp.writeLogin(LOGIN.getValue()).writePassword(PASSWD.getValue());
        mainPage = new MainPage();
    }

    @AfterAll
    public static void cleanAfterTests(){

    }

}
