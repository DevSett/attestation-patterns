package ru.devsett.example.composite;

import ru.devsett.example.composite.beans.*;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        var hosting = new Hosting();
        var author = new Author("Serega");
        hosting.loadElement(
                new Video(author, new File("/"), 245),
                new Music(author, new File("/"), 65),
                new Article(author, "Статься")
        );

        System.out.println(hosting.size());
    }
}
