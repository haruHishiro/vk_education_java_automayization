package core.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.*;

public class LoginPage extends BasePage {
    public LoginPage(){
        check();
    }

    @Override
    void check() {
        $x(LP_LOGIN_FIELD.getLocator())
                .shouldBe(visible.because("Login input field should be visible on Login Page"));
        $x(LP_PASS_FIELD.getLocator())
                .shouldBe(visible.because("Password input field should be visible on Login Page"));
    }
    public LoginPage writeLogin(String text) {
        $x(LP_LOGIN_FIELD.getLocator())
                .shouldBe(visible.because("Login input field should be visible on Login Page"));

        $x(LP_LOGIN_FIELD.getLocator()).val(text);
        return this;
    }
    public MainPage writePassword(String text) {
        $x(LP_LOGIN_FIELD.getLocator())
                .shouldBe(visible.because("Login input field should be visible on Login Page"));

        $x(LP_PASS_FIELD.getLocator()).val(text).pressEnter();
        return new MainPage();
    }


}
