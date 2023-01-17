package ru.devsett.example.proxy;

public class Demo {
    public static void main(String[] args) {
        var proxy = new USAHumanityServiceProxy(new USAHumanityService());
        var checker = new RussianHumanityChecker(proxy);
        checker.checkIn();

        proxy.countryGender("RU");
        var checker2 = new RussianHumanityChecker(proxy);
        checker2.checkIn();
    }
}
