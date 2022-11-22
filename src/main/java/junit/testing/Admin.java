package junit.testing;

public class Admin {
    public int admin_id;
    public String admin_name;
    private ProductShop productShop;

    public Admin(int admin_id, String admin_name, ProductShop productShop)
    {
        this.admin_id = admin_id;
        this.admin_name = admin_name;
        this.productShop = productShop;
    }

    public String addProducts(Products p)
    {
        return productShop.addProducts(p);
    }
    public String deleteProduct(Products p)
    {
        return productShop.deleteProducts(p);
    }
    public String modifyProduct(Products p, Products q)
    {
        return productShop.modifyProducts(p,q);
    }
    public String makeShipment()
    {
        return ("Shipment is ready");
    };
    public void confirmDelivery()
    {

    };
}
