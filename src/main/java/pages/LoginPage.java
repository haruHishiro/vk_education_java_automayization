package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    public LoginPage open() {
        Selenide.open("https://ok.ru/");
        return this;
    }
    public LoginPage writeLogin(String text) {
        $x("//*[@id=\"field_email\"]").val(text);
        return this;
    }
    public MainPage writePassword(String text) {
        $x("//*[@id=\"field_password\"]").val(text).pressEnter();
        return new MainPage();
    }

}
