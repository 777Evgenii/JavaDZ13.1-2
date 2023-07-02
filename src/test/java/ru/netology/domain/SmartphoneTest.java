package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartphoneTest {
    Smartphone smartphone = new Smartphone(1, "SmartPhone1", 40, "Xiaomi");

    @Test
    public void shouldMatchByName() {
        boolean actual = smartphone.matches("SmartPhone1");
        assertTrue(actual);
    }

    @Test
    public void shouldMatchByManufacturer() {
        boolean actual = smartphone.matches("Xiaomi");
        assertTrue(actual);
    }
}
