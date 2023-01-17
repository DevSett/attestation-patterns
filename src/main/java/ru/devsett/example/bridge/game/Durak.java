package ru.devsett.example.bridge.game;

import ru.devsett.example.bridge.element.ElementGame;

public class Durak implements CardGame {

    private ElementGame[] elementGames;

    public Durak(ElementGame[] elementGames) {
        this.elementGames = elementGames;
    }

    public int getCountCards() {
        return elementGames.length;
    }
}
