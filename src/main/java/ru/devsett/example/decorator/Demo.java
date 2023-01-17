package ru.devsett.example.decorator;

import ru.devsett.example.decorator.human.HumanData;
import ru.devsett.example.decorator.human.JailHumanDecorator;
import ru.devsett.example.decorator.human.RussianHumanDecorator;

public class Demo {
    public static void main(String[] args) {
        var human = new HumanData(100);

        var russianDecorator = new RussianHumanDecorator(human.rights());
        var jailDecorator = new JailHumanDecorator(russianDecorator.rights());

        System.out.println(jailDecorator.rights());
    }
}
