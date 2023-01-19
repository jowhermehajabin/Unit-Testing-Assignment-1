package junit.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    static Products product1, product2;
    @BeforeAll
    static void init()
    {
       product1 = new Products("Kitkat","Chocolate", "Dark", 70) ;
    }

    @Test
    void getProduct_name() {
        assertEquals("Kitkat",product1.getProduct_name());
    }

    @Test
    void setProduct_name() {
        product1.setProduct_name("Dairy milk");
        assertEquals("Dairy milk", product1.getProduct_name());
    }

    @Test
    void getProduct_group() {
    }

    @Test
    void setProduct_group() {
    }

    @Test
    void getProduct_subgroup() {
    }

    @Test
    void setProduct_subgroup() {
    }

    @Test
    void getProduct_price() {
    }

    @Test
    void setProduct_price() {
    }
}