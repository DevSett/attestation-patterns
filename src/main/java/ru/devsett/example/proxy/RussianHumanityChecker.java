package ru.devsett.example.proxy;

public class RussianHumanityChecker {
    HumanityService humanityService;

    public RussianHumanityChecker(HumanityService humanityService) {
        this.humanityService = humanityService;
    }

    public void checkIn() {
        if (humanityService.gender().equals("Гетеросексуальный")) {
            System.out.println("Наш парень!");
        } else {
            System.out.println("**** *** ****");
        }
    }
}
