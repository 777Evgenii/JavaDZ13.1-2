package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductTest {
    Product product = new Product(1, "Product", 10);

    @Test
    public void shouldMatchByName() {
        boolean actual = product.matches("Product");
        assertTrue(actual);
    }
}
