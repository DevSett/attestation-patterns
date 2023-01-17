package ru.devsett.example.facade.hh;

import java.util.Random;

public class WitchHunters implements Hunters {

    @Override
    public boolean catchInTrap() {
        //Do logic
        return new Random().nextBoolean();
    }

    @Override
    public boolean investigate() {
        //Do logic
        return new Random().nextBoolean();
    }
}
