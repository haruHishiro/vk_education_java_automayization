package core.pages.enums;

public enum Locators {
    //Login Page
    LP_LOGIN_FIELD("//input[@name='st.email']"),
    LP_PASS_FIELD("//input[@name='st.password']"),
    //Main Page
    MP_USER_NAME("//a[@data-l='t,userPage']/div"),

    //Friends Page
    FP_LABEL_INPUT("//label/input[@type='search']"),
    FP_FRIENDS_BLOCK("//div[@id='hook_Block_MyFriendsSquareCardsPagingB']"),
    FP_FRIENDS_TEXT("//div/div[@role='heading' and @class='invis-el' ]"),
    //Albums Page
    AP_ALBUMS_TEXT("//div/h3[@class='portlet_h_name_t']"),

    //Navigation Bar
    NAVIGATION_MENU("//nav[@role='navigation']"),
    NAV_USER_MAIN("//a[@data-l='t,userMain']"),
    NAV_FRIENDS_BTN("//a[@data-l='t,userFriend']"),
    NAV_PHOTOS_BTN("//a[@data-l='t,userPhotos']"),

    ;
    private final String locator;

    Locators(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }
}
