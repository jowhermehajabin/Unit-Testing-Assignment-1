package junit.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    static Products product1, product2, product3, product4;
    static Customer customer;

    @BeforeAll
    static void init() {

        customer = new Customer(0, "Nihal", "Uganda", "01000..");

        product1 = new Products("Kitkat", "Chocolate", "Dark", 150);
        product2 = new Products("Potato", "Vegetable", "Carbohydrate", 50);
        product3 = new Products("Maggi", "Noodles", "Soupy", 40);
        product4 = new Products("Orgin", "Cheese", "Mozzarella", 250);
        Admin.product_list.add(product1);
        Admin.product_list.add(product2);
        Admin.product_list.add(product3);
        Admin.product_list.add(product4);
    }

    @Test
    void getCustomer_name() {
        assertEquals("Nihal",customer.getCustomer_name());
    }

    @Test
    void viewProducts() {
        String product_list = product1.getProduct_name() + " " + product1.getProduct_group() + " " + product1.getProduct_subgroup() + " " + product1.getProduct_price() + "\n" +
                product2.getProduct_name() + " " + product2.getProduct_group() + " " + product2.getProduct_subgroup() + " " + product2.getProduct_price() + "\n" +
                product3.getProduct_name() + " " + product3.getProduct_group() + " " + product3.getProduct_subgroup() + " " + product3.getProduct_price() + "\n" +
                product4.getProduct_name() + " " + product4.getProduct_group() + " " + product4.getProduct_subgroup() + " " + product4.getProduct_price() + "\n";
        assertEquals(product_list, customer.viewProducts());
    }

    @Test
    void addToCart() {
        customer.addToCart(product1);
    }

    @Test
    void deleteFromCart() {
        customer.addToCart(product1);
        customer.DeleteFromCart(0);
    }

    @Test
    void buyProducts() {
        customer.addToCart(product1);
        assertEquals("Payment successful for 150.0 tk",customer.buyProducts());
    }
}