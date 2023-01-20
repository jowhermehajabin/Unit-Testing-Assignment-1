package junit.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    static Products product1, product2, product3, product4;
    static Cart cart;

    @BeforeAll
    static void init() {

        cart = new Cart(1);

        product1 = new Products("Kitkat", "Chocolate", "Dark", 150);
        product2 = new Products("Potato", "Vegetable", "Carbohydrate", 50);
        product3 = new Products("Maggi", "Noodles", "Soupy", 40);
        product4 = new Products("Orgin", "Cheese", "Mozzarella", 250);

        cart.addItem(product1);
        cart.addItem(product3);
    }

    @Test
    void viewCart()
    {
        String product_list = product1.getProduct_name() + " " + product1.getProduct_group() + " " + product1.getProduct_subgroup() + " " + product1.getProduct_price() + "\n" +
                product3.getProduct_name() + " " + product3.getProduct_group() + " " + product3.getProduct_subgroup() + " " + product3.getProduct_price() + "\n" ;
        assertEquals(product_list, cart.viewCart());

    }

    @Test
    void getTotal_price() {
        assertEquals(190,cart.getTotal_price());
    }

    @Test
    void addItem() {
        cart.addItem(product4);
        String product_list = product1.getProduct_name() + " " + product1.getProduct_group() + " " + product1.getProduct_subgroup() + " " + product1.getProduct_price() + "\n" +
                product3.getProduct_name() + " " + product3.getProduct_group() + " " + product3.getProduct_subgroup() + " " + product3.getProduct_price() + "\n" +
                product4.getProduct_name() + " " + product4.getProduct_group() + " " + product4.getProduct_subgroup() + " " + product4.getProduct_price() + "\n";
        assertEquals(product_list, cart.viewCart());

    }

    @Test
    void removeItem() {
        cart.removeItem(1);
        String product_list = product1.getProduct_name() + " " + product1.getProduct_group() + " " + product1.getProduct_subgroup() + " " + product1.getProduct_price() + "\n" ;
        assertEquals(product_list, cart.viewCart());

    }
}