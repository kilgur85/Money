package Card;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CardTest {
    private Card card;

    @Before
    public void setUp() throws Exception {
        card = new DebitCard(new BigDecimal(2000),"Sergey");

    }

    @After
    public void tearDown() throws Exception {
        card = null;
    }

    @Test
    public void topUpYourAccount() {
        BigDecimal res = card.balance.add(new BigDecimal(1000));
        assertEquals(res,new BigDecimal(3000));
    }



    @Test
    public void withdrawalFromAccount() throws ExceptionInsufficientFunds {
        BigDecimal res = card.balance.subtract(new BigDecimal(1000));
        assertEquals(res,new BigDecimal(1000));
    }

    @Test
    public void currencyExchange() {
        BigDecimal res = card.balance.multiply(new BigDecimal(1000));
        assertEquals(res,new BigDecimal(2000000));
    }
}