package ru.devsett.example.facade;

import ru.devsett.example.facade.hh.DemonHunters;
import ru.devsett.example.facade.hh.GhostBusters;
import ru.devsett.example.facade.hh.Hunters;
import ru.devsett.example.facade.hh.WitchHunters;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Hunters hunters = null;
        System.out.println("Выберите:\n0 - Призрак\n1 - Ведьма\n2 - Демон");
        var read = new Scanner(System.in).nextLine();
        if (read.equals("0")) {
            hunters = new GhostBusters();
        } else if (read.equals("1")){
            hunters = new WitchHunters();
        } else if (read.equals("2")) {
            hunters = new DemonHunters();
        }
        if (hunters == null) {
            System.out.println("Ух ты что-то новенькое!");
            return;
        }

        System.out.print("Расследования дела => ");
        if (hunters.investigate()) {
            System.out.print("Дело расследовано  => ");
            if (hunters.catchInTrap()) {
                System.out.print("Монстр пойман!");
            } else {
                System.out.print("Монстр сбежал!");
            }
        } else {
            System.out.print("Монстр не найден!");
        }
    }
}
