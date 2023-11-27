package org.example.task1;

public class MyFacebookUser implements MyUser{
    private FacebookUser facebookUser;
    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public String getLastActiveTime() {
//        return facebookUser.getUserActiveTime();
        return "1";
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }
}
