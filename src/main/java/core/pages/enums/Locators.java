package core.pages.enums;

public enum Locators {
    //Login Page
    LP_LOGIN_FIELD("//input[@name='st.email']"),
    LP_PASS_FIELD("//input[@name='st.password']"),
    //Main Page
    MP_USER_NAME("//a[@data-l='t,userPage']/div"),
    MP_LAYOUT_CONTENT("//div[@class='layout-content']"),

    //Friends Page
    FP_LABEL_INPUT("//label/input[@type='search']"),
    FP_FRIENDS_BLOCK("//div[@id='hook_Block_MyFriendsSquareCardsPagingB']"),
    FP_FRIENDS_TEXT("//div/div[@role='heading' and @class='invis-el' ]"),
    //Albums Page
    AP_ALBUMS_TEXT("//div/h3[@class='portlet_h_name_t']"),
    AP_PHOTOS_AREA("//div[@data-tsid='photo_stream_block']"),
    AP_GRID_ELEMENTS("//div[@class='grid__1ewbi']"),
    AP_GRID_ITEM("//div[@class='grid-item__1ewbi']"),
    //Photo Page
    PP_COMMENTS_BLOCK("//div[@id='hook_Block_InlineCommentPLB']"),
    PP_IMAGE_BLOCK("//div[@class='image-container__ugpyu']"),
    PP_SET_DESCRIPTION_BTN("//div[@class='text-field_cnt']"),
    PP_SAFE_DESCRIPTION_BTN("//button[@data-l='t,textField-save']"),
    PP_DESCRIPTION_TEXTAREA("//textarea[@name='desc']"),
    PP_DESCRIPTION_TEXT("//div[@class='text-field_text']"),
    PP_CLOSE_BTN("//button[@class='panel_close__ugpyu close__ugpyu']"),

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
