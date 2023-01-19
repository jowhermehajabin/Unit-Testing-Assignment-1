package junit.testing;

public class Customer {
    private int customer_id;
    private String customer_name;
    private String customer_address;
    private String customer_phoneno;
    private Cart cart;
    public Customer(int id, String name, String address, String phone_no)
    {
        this.customer_id = id;
        this.customer_name = name;
        this.customer_address = address;
        this.customer_phoneno = phone_no;
        this.cart = new Cart(customer_id);
    }

    public String viewProducts() {
        String product_details = "";
        for (Products product :
                Admin.product_list) {
            product_details += product.getProduct_name() + " " + product.getProduct_group() + " " + product.getProduct_subgroup() + " " + product.getProduct_price() + "\n";
        }
        return product_details;
    }

    public void addToCart(Products product)
    {
      cart.addItem(product);
    }
    public void DeleteFromCart(int id)
    {
        cart.removeItem(id);
    }
    public void buyProducts()
    {
       Payment payment = new Payment(cart.getTotal_price());
       payment.makePayment();
    }
}
