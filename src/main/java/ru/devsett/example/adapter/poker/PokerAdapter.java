package ru.devsett.example.adapter.poker;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PokerAdapter extends PokerOmahaGame {

    private PokerOtherGame game;

    @Override
    public int getCountCardInHands() {
        return game.getCountCardsInHand();
    }
}
