package ru.devsett.example.composite.beans;

public class Article extends HostingElement {
    String text;

    public Article(Author author, String text) {
        super(author);
        this.text = text;
    }
}
