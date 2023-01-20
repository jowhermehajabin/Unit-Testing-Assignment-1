package junit.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    static  Payment payment;

    @BeforeAll
    static void init()
    {
        payment = new Payment(250);
    }

    @Test
    void makePayment() {
        assertEquals("Payment successful for 250.0 tk",payment.makePayment());
    }
}