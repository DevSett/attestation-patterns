package ru.devsett.example.adapter.poker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PokerOmahaGame {
    private int countCards;

    public int getCountCardInHands(){
        return 4;
    }
}
