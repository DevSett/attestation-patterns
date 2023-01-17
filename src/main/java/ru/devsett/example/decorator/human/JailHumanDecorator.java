package ru.devsett.example.decorator.human;

import lombok.Getter;

public class JailHumanDecorator implements Human {
    @Getter
    private int countRights;

    public JailHumanDecorator(int countRights) {
    this.countRights = countRights;
    }

    @Override
    public int rights() {
        return countRights - 10;
    }
}
