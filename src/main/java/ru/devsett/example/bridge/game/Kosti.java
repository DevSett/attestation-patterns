package ru.devsett.example.bridge.game;

import ru.devsett.example.bridge.element.ElementGame;

import java.util.Arrays;
import java.util.Comparator;

public class Kosti {
    private ElementGame[] elementGames;

    public Kosti(ElementGame[] elementGames) {
        this.elementGames = elementGames;
    }

    public ElementGame getMaxElement() {
        return Arrays.stream(elementGames).max(Comparator.comparing(ElementGame::weight)).orElse(null);
    }
}
