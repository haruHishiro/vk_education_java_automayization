package pages;

import static com.codeborne.selenide.Selenide.$x;

public class PhotosPage {
    public String getAlbums() {
        return $x("//*[@id=\"tabpanel-all-photos\"]/div[1]/div/h3").getText();
    }
}
