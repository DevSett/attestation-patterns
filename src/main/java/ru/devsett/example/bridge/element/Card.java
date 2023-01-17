package ru.devsett.example.bridge.element;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.File;

@Data
@AllArgsConstructor
public class Card implements ElementGame {
    private String name;
    private File image;
    private int weight;

    @Override
    public int weight() {
        return weight;
    }
}
