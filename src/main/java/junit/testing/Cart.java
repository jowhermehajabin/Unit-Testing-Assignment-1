package junit.testing;

import java.util.ArrayList;

public class Cart {

    private int cart_id;
    private float total_price;
    private ArrayList<Products>cart_items = new ArrayList<Products>();

    public Cart(int cart_id)
    {
        this.cart_id = cart_id;
        this.total_price = 0;
    }

    public float getTotal_price() {
        return total_price;
    }

    public String viewCart() {
        String product_details = "";
        for (Products product :
                cart_items) {
            product_details += product.getProduct_name() + " " + product.getProduct_group() + " " + product.getProduct_subgroup() + " " + product.getProduct_price() + "\n";
        }
        return product_details;
    }

    public void addItem(Products product)
    {

        cart_items.add(product);
        total_price+=product.getProduct_price();
    }

    public void removeItem(int product_id)
    {
        total_price-=cart_items.get(product_id).getProduct_price();
        cart_items.remove(product_id);
    }
}
