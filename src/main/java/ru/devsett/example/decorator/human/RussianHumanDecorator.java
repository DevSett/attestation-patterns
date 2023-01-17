package ru.devsett.example.decorator.human;

import lombok.Getter;

public class RussianHumanDecorator implements Human {
    @Getter
    private int countRights;

    public RussianHumanDecorator(int countRights) {
    this.countRights = countRights;
    }

    @Override
    public int rights() {
        return countRights / 10;
    }
}
