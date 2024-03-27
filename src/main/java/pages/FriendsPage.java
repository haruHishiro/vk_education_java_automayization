package pages;

import static com.codeborne.selenide.Selenide.$x;

public class FriendsPage {
    public String getNoFriends() {
        return $x("//*[@id=\"hook_Block_MyFriendsSquareCardsPagingB\"]/div/div[1]").getText();
    }
}
