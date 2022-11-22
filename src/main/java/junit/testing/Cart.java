package junit.testing;

import java.util.ArrayList;

public class Cart {
    public int cart_id;

    ArrayList<Products> products = new ArrayList<>();

    public Cart(int cart_id)
    {
        this.cart_id=cart_id;
    }

    public int NumberOfProducts()
    {
        return products.size();
    }

    public float totalPrice()
    {
        float total =0;
        for (Products p:
                products ) {
            total+=p.product_price;
        }
        return total;
    }
}
