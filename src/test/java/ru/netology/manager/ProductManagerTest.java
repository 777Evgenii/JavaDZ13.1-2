package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {
    Product product1 = new Product(1, "Product1", 10);
    Product product2 = new Product(2, "Product2", 20);
    Book book1 = new Book(3, "Book1", 30, "John Doe");
    Smartphone smartphone1 = new Smartphone(4, "SmartPhone1", 40, "Xiaomi");

    private final ProductManager productManager = new ProductManager(new ProductRepository());

    public ProductManagerTest() {
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(book1);
        productManager.add(smartphone1);
    }

    @Test
    public void shouldFindFindNothing() {
        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy("ProductNothing");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindOneProduct() {
        Product[] expected = new Product[]{book1};
        Product[] actual = productManager.searchBy("Book1");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTwoProducts() {
        Product[] expected = new Product[]{product1, product2};
        Product[] actual = productManager.searchBy("Product");
        assertArrayEquals(expected, actual);
    }
}
