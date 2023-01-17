package ru.devsett.example.decorator.human;

public interface Human {

    int rights();

    default boolean isExistsRights() {
        return rights() > 0;
    }
}
