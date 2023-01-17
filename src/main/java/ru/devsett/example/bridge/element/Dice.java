package ru.devsett.example.bridge.element;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dice implements ElementGame{
    private int weight;

    @Override
    public int weight() {
        return weight;
    }
}
