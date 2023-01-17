package ru.devsett.example.composite.beans;


public abstract class HostingElement {
    private Author author;

    public HostingElement(Author author) {
        this.author = author;
    }
}
