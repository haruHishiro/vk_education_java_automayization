package core.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.*;

public class FriendsPage extends BasePage {

    public FriendsPage(){
        check();
    }

    @Override
    void check() {
        $x(FP_LABEL_INPUT.getLocator())
                .shouldBe(visible.because("Friends search input should be visible on Friends Page"));
        $x(NAVIGATION_MENU.getLocator())
                .shouldBe(visible.because("Navigation menu should be visible on Friends Page"));
        $x(FP_FRIENDS_BLOCK.getLocator())
                .shouldBe(visible.because("Friends area should be visible on Friends Page"));
    }

    public String getFriendsText() {
        $x(FP_FRIENDS_TEXT.getLocator())
                .shouldBe(visible.because("Text should be visible if you want to read it"));

        return $x(FP_FRIENDS_TEXT.getLocator()).getText();
    }
}
