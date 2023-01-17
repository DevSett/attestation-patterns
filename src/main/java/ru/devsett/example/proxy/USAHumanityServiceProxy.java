package ru.devsett.example.proxy;

public class USAHumanityServiceProxy implements HumanityService {

    private USAHumanityService usaHumanityService;
    private String gender;

    public USAHumanityServiceProxy(USAHumanityService usaHumanityService) {
        this.usaHumanityService = usaHumanityService;
    }

    public void countryGender(String country) {
        if (country.equals("RU")) {
            gender = "Гетеросексуальный";
        } else {
            gender = usaHumanityService.gender();
        }
    }

    @Override
    public String gender() {
        return gender == null ? usaHumanityService.gender() : gender;
    }
}
