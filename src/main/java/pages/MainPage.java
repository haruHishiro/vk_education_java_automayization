package pages;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public String getFullName() {
        return $x("//*[@id=\"hook_Block_Navigation\"]/div/div/div[1]/a/div").getText();
    }

    public FriendsPage clickFriendsBtn() {
        $x("//*[@id=\"hook_Block_Navigation\"]/div/div/div[4]/a").click();
        return new FriendsPage();
    }

    public PhotosPage clickPhotoBtn() {
        $x("//*[@id=\"hook_Block_Navigation\"]/div/div/div[5]/a").click();
        return new PhotosPage();
    }
}
