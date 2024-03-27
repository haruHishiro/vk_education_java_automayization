package org.example;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    @Test
    public void loginTest() {
        LoginPage lp = new LoginPage();
        lp.open();
        String fullName = lp.writeLogin("technopol67").writePassword("technopolisPassword").getFullName();
        assertEquals(fullName, "technopol67 technopol67");
    }

    @Test
    public void noFriendsTest() {
        LoginPage lp = new LoginPage();
        lp.open();
        String noFriendsText = lp.writeLogin("technopol67").writePassword("technopolisPassword")
                .clickFriendsBtn().getNoFriends();
        assertEquals(noFriendsText, "Пока нет друзей");
    }

    @Test
    public void albumsTest() {
        LoginPage lp = new LoginPage();
        lp.open();
        String noFriendsText = lp.writeLogin("technopol67").writePassword("technopolisPassword")
                .clickPhotoBtn().getAlbums();
        assertEquals(noFriendsText, "Альбомы");
    }
}