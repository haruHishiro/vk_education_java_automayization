package core.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.*;

public class MainPage extends BasePage{

    public MainPage(){
        check();
    }
    @Override
    void check() {
        $x(MP_USER_NAME.getLocator())
                .shouldBe(visible.because("User name should be visible on Main Page"));
        $x(NAVIGATION_MENU.getLocator())
                .shouldBe(visible.because("Navigation menu should be visible on Main Page"));
        $x(MP_LAYOUT_CONTENT.getLocator())
                .shouldBe(visible.because("Layout content should be visible on Main Page"));
    }
    public String getFullName() {
        $x(MP_USER_NAME.getLocator())
                .shouldBe(visible.because("User name should be visible on Main Page"));

        return $x(MP_USER_NAME.getLocator()).getText();
    }

    public FriendsPage clickFriendsBtn() {
        $x(NAV_FRIENDS_BTN.getLocator())
                .shouldBe(visible.because("Buttons in navigation menu should be visible on Main Page"));

        $x(NAV_FRIENDS_BTN.getLocator()).click();
        return new FriendsPage();
    }

    public PhotosPage clickPhotoBtn() {
        $x(NAV_PHOTOS_BTN.getLocator()).click();
        return new PhotosPage();
    }
}
