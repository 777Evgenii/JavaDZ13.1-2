package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {
    Book book = new Book(1, "Book1", 30, "John Doe");

    @Test
    public void shouldMatchByName() {
        boolean actual = book.matches("Book1");
        assertTrue(actual);
    }

    @Test
    public void shouldMatchByAuthor() {
        boolean actual = book.matches("John Doe");
        assertTrue(actual);
    }
}
