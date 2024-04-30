package core.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static core.pages.enums.Locators.*;

public class PhotoPage extends BasePage{
    public PhotoPage(){
        check();
    }
    @Override
    void check() {
        $x(PP_COMMENTS_BLOCK.getLocator())
                .shouldBe(visible.because("Comments should be visible"));
        $x(PP_IMAGE_BLOCK.getLocator())
                .shouldBe(visible.because("Image should be visible"));
    }

    public void setDescription(String text){
        $x(PP_SET_DESCRIPTION_BTN.getLocator())
                .shouldBe(visible.because("Description change button should be visible"));

        $x(PP_SET_DESCRIPTION_BTN.getLocator()).click();

        $x(PP_DESCRIPTION_TEXTAREA.getLocator())
                .shouldBe(visible.because("Description text area should be visible"));

        $x(PP_DESCRIPTION_TEXTAREA.getLocator()).setValue(text);

        $x(PP_SAFE_DESCRIPTION_BTN.getLocator())
                .shouldBe(visible.because("Save description text button should be visible"));

        $x(PP_SAFE_DESCRIPTION_BTN.getLocator()).click();
    }

    public void refreshPage(){
        Selenide.refresh();
    }

    public String getDescriptionText(){
        $x(PP_DESCRIPTION_TEXT.getLocator())
                .shouldBe(visible.because("Text should be visible"));

        return $x(PP_DESCRIPTION_TEXT.getLocator()).getText();
    }
    public AlbumsPage closePhotoPage(){
        $x(PP_CLOSE_BTN.getLocator())
                .shouldBe(visible.because("Close button should be visible"));

        $x(PP_CLOSE_BTN.getLocator()).click();
        return new AlbumsPage();
    }

    public MainPage openMainPage(){
        $x(NAV_USER_MAIN.getLocator())
                .shouldBe(visible.because("Main menu button should be visible"));

        $x(NAV_USER_MAIN.getLocator()).click();
        return new MainPage();
    }
}
