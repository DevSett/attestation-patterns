package ru.devsett.example.proxy;

public class USAHumanityService implements HumanityService {
    @Override
    public String gender() {
        return "Бинарная личность";
    }
}
