package junit.testing;

import java.util.ArrayList;

public class ProductShop {
    ArrayList<Products> product_list=new ArrayList<>();
    public ArrayList<Products> viewProducts()
    {
        return product_list;
    };
    public String addProducts(Products p)
    {
        product_list.add(p);
        return (""+p.product_id+" no product added.");
    };
    public String deleteProducts(Products p)
    {
        if(product_list.contains(p))
        {
            product_list.remove(p);
            return ("The product has been removed from the list.");
        }
        else{
            return ("The product is not in the list!");
        }
    };
    public String modifyProducts(Products p, Products q) {
        if (product_list.contains(p))
        {
            product_list.remove(p);
            product_list.add(q);
            return ("The product has been updated!");
        }
        else {
            return ("The product is not in the shop.");
        }
    };
}
