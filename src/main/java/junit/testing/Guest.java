package junit.testing;

import java.util.ArrayList;

public class Guest {

    public String viewProducts() {
        String product_details = "";
        for (Products product :
                Admin.product_list) {
            product_details += product.getProduct_name() + " " + product.getProduct_group() + " " + product.getProduct_subgroup() + " " + product.getProduct_price() + "\n";
        }
        return product_details;
    }
    static int customer_id =1;
    public void getRegistered(String name, String address, String phone_no)
    {
        Customer customer = new Customer(customer_id++, name, address, phone_no);
        return;
    }
}
