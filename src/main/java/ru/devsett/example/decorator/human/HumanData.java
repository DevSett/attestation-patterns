package ru.devsett.example.decorator.human;

import lombok.Getter;

public class HumanData implements Human {

    @Getter
    private int countRights;

    public HumanData(int countRights) {
        this.countRights = countRights;
    }

    @Override
    public int rights() {
        return countRights;
    }
}
