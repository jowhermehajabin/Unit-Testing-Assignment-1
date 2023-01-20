package junit.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    static Products product1, product2, product3, product4;
    static Admin admin;

    @BeforeAll
    static void init() {

        admin = new Admin("Jowher");

        product1 = new Products("Kitkat", "Chocolate", "Dark", 150);
        product2 = new Products("Potato", "Vegetable", "Carbohydrate", 50);
        product3 = new Products("Maggi", "Noodles", "Soupy", 40);
        product4 = new Products("Orgin", "Cheese", "Mozzarella", 250);
        Admin.product_list.add(product1);
        Admin.product_list.add(product2);
    }

    @Test
    void viewProducts() {
        String product_list = product1.getProduct_name() + " " + product1.getProduct_group() + " " + product1.getProduct_subgroup() + " " + product1.getProduct_price() + "\n" +
                product2.getProduct_name() + " " + product2.getProduct_group() + " " + product2.getProduct_subgroup() + " " + product2.getProduct_price() + "\n";
        assertEquals(product_list, admin.viewProducts());
    }

    @Test
    void addProducts() {
        admin.addProducts(product3);
        admin.addProducts(product4);
        String product_list = product1.getProduct_name() + " " + product1.getProduct_group() + " " + product1.getProduct_subgroup() + " " + product1.getProduct_price() + "\n" +
                product2.getProduct_name() + " " + product2.getProduct_group() + " " + product2.getProduct_subgroup() + " " + product2.getProduct_price() + "\n" +
                product3.getProduct_name() + " " + product3.getProduct_group() + " " + product3.getProduct_subgroup() + " " + product3.getProduct_price() + "\n" +
                product4.getProduct_name() + " " + product4.getProduct_group() + " " + product4.getProduct_subgroup() + " " + product4.getProduct_price() + "\n";
        assertEquals(product_list, admin.viewProducts());
    }

    @Test
    void deleteProducts() {
        admin.deleteProducts(1);
        String product_list = product1.getProduct_name() + " " + product1.getProduct_group() + " " + product1.getProduct_subgroup() + " " + product1.getProduct_price() + "\n" ;
        assertEquals(product_list, admin.viewProducts());
    }

    @Test
    void modifyProducts() {
        admin.modifyProducts(0,"Kitkat", "Chocolate", "Dark", 60);
        assertEquals(60, Admin.product_list.get(0).getProduct_price());
    }
}