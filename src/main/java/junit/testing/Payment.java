package junit.testing;

public class Payment {
    public float total_price;
    public Payment(float price)
    {
       this.total_price = price;
    }
    public String makePayment()
    {
        return ("Payment successful for "+total_price+" tk");
    }
}
