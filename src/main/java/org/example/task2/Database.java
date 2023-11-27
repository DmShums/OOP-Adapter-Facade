package org.example.task2;

public class Database extends БазаДаних {
    public String receiveUserData() {
        return отриматиДаніКористувача();
    }

    public String receiveStaticData() {
        return отриматиСтатистичніДані();
    }
}
