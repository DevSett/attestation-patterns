package ru.devsett.example.composite.beans;


import java.io.File;

public class Video extends HostingElement {
    private File file;
    private int timeDuration;

    public Video(Author author, File file, int timeDuration) {
        super(author);
        this.file = file;
        this.timeDuration = timeDuration;
    }
}
