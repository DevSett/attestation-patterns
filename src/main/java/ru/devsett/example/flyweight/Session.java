package ru.devsett.example.flyweight;

public class Session {

    public static boolean isAutorize = false;

    public static boolean autorize(String password) {

        if (isAutorize) {
            return isAutorize;
        }

        for (int i = 0; i < 10000000; i++) {         //hard alg
            if (password.equals("Test")) {
                isAutorize = true;
            }
        }
        return isAutorize;
    }

}
