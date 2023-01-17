package ru.devsett.example.adapter;


import ru.devsett.example.adapter.poker.PokerAdapter;
import ru.devsett.example.adapter.poker.PokerOmahaGame;
import ru.devsett.example.adapter.poker.PokerOtherGame;

public class Demo {
    public static void main(String[] args) {
        var holdem = new PokerOmahaGame(52);
        var pokerAdapter = new PokerAdapter(new PokerOtherGame(52, 2));
        System.out.println(pokerAdapter.getCountCardInHands());
        System.out.println(holdem.getCountCardInHands());

    }
}
