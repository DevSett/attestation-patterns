package ru.devsett.example.bridge;

import ru.devsett.example.bridge.element.Card;
import ru.devsett.example.bridge.element.Dice;
import ru.devsett.example.bridge.element.ElementGame;
import ru.devsett.example.bridge.game.Durak;
import ru.devsett.example.bridge.game.Kosti;
import ru.devsett.example.bridge.game.Poker;

import java.io.File;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //elements
        var pokerCards = new ArrayList<Card>();
        var durakCards = new ArrayList<Card>();
        var diceList = new ArrayList<Dice>();
        for (int i = 0; i < 52; i++) {
            pokerCards.add(new Card(String.valueOf(i), new File("/"), i + 1));
            if (i < 36) {
                durakCards.add(new Card(String.valueOf(i), new File("/"), i + 1));
            }
            if (i < 6) {
                diceList.add(new Dice(i + 1));
            }
        }

        var durak = new Durak(durakCards.toArray(new ElementGame[0]));
        var poker = new Poker(pokerCards.toArray(new ElementGame[0]));
        var kosti = new Kosti(diceList.toArray(new ElementGame[0]));

        System.out.println(durak.getCountCards());
        System.out.println(poker.getCountCards());
        System.out.println(kosti.getMaxElement().weight());
    }
}
