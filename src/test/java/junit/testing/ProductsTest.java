package junit.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    static Products product1, product2;

    @BeforeAll
    static void init() {
        product1 = new Products("Kitkat", "Chocolate", "Dark", 70);
        product2 = new Products("Potato", "Veg","Carb",50);
    }

    @Test
    void getProduct_name() {
        assertEquals("Kitkat", product1.getProduct_name());
    }

    @Test
    void setProduct_name() {
        product1.setProduct_name("Dairy milk");
        assertEquals("Dairy milk", product1.getProduct_name());
    }

    @Test
    void getProduct_group() {
        assertEquals("Veg",product2.getProduct_group());
    }

    @Test
    void setProduct_group() {
        product2.setProduct_group("Vegetable");
        assertEquals("Vegetable",product2.getProduct_group());
    }

    @Test
    void getProduct_subgroup() {
        assertEquals("Carb",product2.getProduct_subgroup());
    }

    @Test
    void setProduct_subgroup() {
        product2.setProduct_subgroup("Carbohydrate");
        assertEquals("Carbohydrate",product2.getProduct_subgroup());
    }

    @Test
    void getProduct_price() {
        assertEquals(70,product1.getProduct_price());
    }

    @Test
    void setProduct_price() {
        product1.setProduct_price(150);
        assertEquals(150,product1.getProduct_price());
    }
}