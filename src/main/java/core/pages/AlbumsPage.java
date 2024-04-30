package core.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.*;

public class AlbumsPage extends BasePage{

    public AlbumsPage(){
        check();
    }
    @Override
    void check() {
        $x(NAVIGATION_MENU.getLocator())
                .shouldBe(visible.because("Navigation menu should be visible on Albums Page"));
        $x(AP_PHOTOS_AREA.getLocator())
                .shouldBe(visible.because("Photos area should be visible on Albums Page"));
        $x(AP_GRID_ELEMENTS.getLocator())
                .shouldBe(visible.because("Grid should be visible on Albums Page"));
    }
    public String getAlbumsText() {
        $x(AP_ALBUMS_TEXT.getLocator())
                .shouldBe(visible.because("Albums label should be visible on Albums Page"));

        return $x(AP_ALBUMS_TEXT.getLocator()).getText();
    }

    public PhotoPage openFirstPhoto(){
        $x(AP_GRID_ITEM.getLocator())
                .shouldBe(visible.because("Grid item should be visible on Albums Page"));

        $x(AP_GRID_ITEM.getLocator()).click();

        return new PhotoPage();
    }

    public MainPage openMainPage(){
        $x(NAV_USER_MAIN.getLocator())
                .shouldBe(visible.because("Main menu button should be visible"));

        $x(NAV_USER_MAIN.getLocator()).click();
        return new MainPage();
    }
}
