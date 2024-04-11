package core.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.*;

public class MainPage {
    // изменить xpath на норм локатор
    // сделать конструктор и сделать метод-проверку, что мы находимся на той ли странице
    // вызвать метод-проверку внутри конструктора
    public MainPage(){
        $x("//div[@class='tico ellip']")
                .shouldBe(visible.because("User name should be visible on Main Page"));
        $x("//div/a[@data-l='t,userFriend']")
                .shouldBe(visible.because("Friends button should be visible on Main Page with default settings"));
        $x("//div/a[@data-l='t,userAltGroup']")
                .shouldBe(visible.because("Groups button should be visible on Main Page with default settings"));
    }
    public String getFullName() {
        return $x(MP_USER_NAME.getLocator()).getText();
    }

    public FriendsPage clickFriendsBtn() {
        $x(NAV_FRIENDS_BTN.getLocator()).click();
        return new FriendsPage();
    }

    public PhotosPage clickPhotoBtn() {
        $x(NAV_PHOTOS_BTN.getLocator()).click();
        return new PhotosPage();
    }
}
