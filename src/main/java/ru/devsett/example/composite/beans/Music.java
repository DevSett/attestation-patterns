package ru.devsett.example.composite.beans;


import java.io.File;

public class Music extends HostingElement {
    private File composition;
    private int timeDuration;

    public Music(Author author, File composition, int timeDuration) {
        super(author);
        this.composition = composition;
        this.timeDuration = timeDuration;
    }
}
