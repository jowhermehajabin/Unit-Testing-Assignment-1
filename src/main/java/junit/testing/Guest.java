package junit.testing;

import java.util.ArrayList;

public class Guest {
    public ProductShop productShop;

    public Guest(ProductShop productShop)
    {
        this.productShop = productShop;
    }

    public ArrayList<Products> viewProducts()
    {
        return productShop.viewProducts();
    }
    public String getRegistered()
    {
        return ("Guest registered.");
    }
}
