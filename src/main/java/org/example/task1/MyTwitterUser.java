package org.example.task1;

public class MyTwitterUser implements MyUser{
    private TwitterUser twitterUser;
    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getCountry() {
        return null;
    }

    @Override
    public String getLastActiveTime() {
        return null;
    }
}
