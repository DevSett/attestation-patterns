package ru.devsett.example.bridge.game;

import ru.devsett.example.bridge.element.ElementGame;

public class Poker implements CardGame {
    private ElementGame[] elementGames;

    public Poker(ElementGame[] elementGames) {
        this.elementGames = elementGames;
    }

    public int getCountCards() {
        return elementGames.length;
    }
}
