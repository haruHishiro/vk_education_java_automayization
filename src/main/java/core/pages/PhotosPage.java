package core.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.*;

public class PhotosPage {
    // изменить xpath на норм локатор
    // сделать конструктор и сделать метод-проверку, что мы находимся на той ли странице
    // вызвать метод-проверку внутри конструктора
    public PhotosPage(){
        $x(AP_ALBUMS_TEXT.getLocator())
                .shouldBe(visible.because("Albums label should be visible on Friends Page"));
        $x(NAVIGATION_MENU.getLocator())
                .shouldBe(visible.because("Navigation menu should be visible on Friends Page with default settings"));
    }
    public String getAlbumsText() {
        return $x(AP_ALBUMS_TEXT.getLocator()).getText();
    }
}
