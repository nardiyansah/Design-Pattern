package pattern.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void payStatusAccountInactive() {
        Pay pay = new Pay();
        CreditAccount andi = new CreditAccount("Andi", false);
        CreditCard creditCard = new CreditCard(pay, andi);

        assertFalse(creditCard.pay(8000));
    }

    @Test
    void payStatusAccountActive() {
        Pay pay = new Pay();
        CreditAccount andi = new CreditAccount("Andi", true);
        CreditCard creditCard = new CreditCard(pay, andi);

        assertTrue(creditCard.pay(8000));
    }
}