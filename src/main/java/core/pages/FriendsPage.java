package core.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.*;

public class FriendsPage {
    // изменить xpath на локатор
    // сделать конструктор и сделать метод-проверку, что мы находимся на той ли странице
    // вызвать метод-проверку внутри конструктора
    public FriendsPage(){
        $x(FP_LABEL_INPUT.getLocator())
                .shouldBe(visible.because("Friends search input should be visible on Friends Page"));
        $x(NAVIGATION_MENU.getLocator())
                .shouldBe(visible.because("Navigation menu should be visible on Friends Page with default settings"));
        $x(FP_FRIENDS_BLOCK.getLocator())
                .shouldBe(visible.because("Friends area should be visible on Main Page with default settings"));
    }
    public String getFriendsText() {
        return $x(FP_FRIENDS_TEXT.getLocator()).getText();
    }
}
