package io.github.raeperd.realworld.domain.user;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Profile {

    @Embedded
    private UserName userName;

    @Column(name = "bio")
    private String bio;

    @Embedded
    private Image image;

    public Profile(UserName userName) {
        this(userName, null, null);
    }

    private Profile(UserName userName, String bio, Image image) {
        this.userName = userName;
        this.bio = bio;
        this.image = image;
    }

    protected Profile() {
    }

    void changeUserName(UserName userName) {
        this.userName = userName;
    }

    void changeBio(String bio) {
        this.bio = bio;
    }

    void changeImage(Image image) {
        this.image = image;
    }

    UserName getUserName() {
        return userName;
    }

    String getBio() {
        return bio;
    }

    Image getImage() {
        return image;
    }
}