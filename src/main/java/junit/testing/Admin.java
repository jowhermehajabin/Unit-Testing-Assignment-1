package junit.testing;

import java.util.ArrayList;

public class Admin {

    private int admin_id;
    private String admin_name;
    static int id_count = 1;
    public static ArrayList<Products> product_list = new ArrayList<Products>();

    public Admin(String name) {
        this.admin_id = id_count;
        this.admin_name = name;
        id_count++;
    }

    public String viewProducts() {
        String product_details = "";
        for (Products product :
                product_list) {
            product_details += product.getProduct_name() + " " + product.getProduct_group() + " " + product.getProduct_subgroup() + " " + product.getProduct_price() + "\n";
        }
        return product_details;
    }

    public void addProducts(String name, String group, String subgroup, int price) {
        Products product = new Products(name, group, subgroup, price);
        product_list.add(product);
    }

    public void deleteProducts(int product_id) {
        product_list.remove(product_id);
    }

    public void modifyProducts(int product_id, String name, String group, String subgroup, int price) {
        Products product = product_list.get(product_id);
        product.setProduct_name(name);
        product.setProduct_group(group);
        product.setProduct_subgroup(subgroup);
        product.setProduct_price(price);
    }

}