package ru.devsett.example.flyweight;

public class Demo {

    public static void main(String[] args) {
        String password = "Test";

        var timeMills = System.currentTimeMillis();
        if (true /* logic */) {
            if (Session.autorize(password)) {
                // do logic
                System.out.println("1");
            }
        }

        if (true /* logic */) {
            if (Session.autorize(password)) {
                // do logic
                System.out.println("2");
            }
        }

        if (true /* logic */) {
            if (Session.autorize(password)) {
                // do logic
                System.out.println("3");
            }
        }

        System.out.println(System.currentTimeMillis() - timeMills);
    }
}
