package core.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.*;

public class PhotosPage extends BasePage{

    public PhotosPage(){
        check();
    }
    @Override
    void check() {
        $x(NAVIGATION_MENU.getLocator())
                .shouldBe(visible.because("Navigation menu should be visible on Photos Page"));
        $x(AP_PHOTOS_AREA.getLocator())
                .shouldBe(visible.because("Photos area should be visible on Photos Page"));
    }
    public String getAlbumsText() {
        $x(AP_ALBUMS_TEXT.getLocator())
                .shouldBe(visible.because("Albums label should be visible on Photos Page"));

        return $x(AP_ALBUMS_TEXT.getLocator()).getText();
    }
}
