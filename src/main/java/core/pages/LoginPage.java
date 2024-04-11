package core.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.LP_LOGIN_FIELD;
import static core.pages.enums.Locators.LP_PASS_FIELD;

public class LoginPage {
    // изменить xpath на норм локатор
    // сделать конструктор и сделать метод-проверку, что мы находимся на той ли странице
    // вызвать метод-проверку внутри конструктора
    public LoginPage(){

    }
    public LoginPage open() {
        Selenide.open("https://ok.ru/");
        return this;
    }
    public LoginPage writeLogin(String text) {
        $x(LP_LOGIN_FIELD.getLocator()).val(text);
        return this;
    }
    public MainPage writePassword(String text) {
        $x(LP_PASS_FIELD.getLocator()).val(text).pressEnter();
        return new MainPage();
    }

}
