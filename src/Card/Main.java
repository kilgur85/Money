package Card;

import javax.naming.InsufficientResourcesException;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args)  {
        Card credit = new CreditCard(new BigDecimal(1000.258),"Petia");
        Card debit = new DebitCard(new BigDecimal(6168.236),"Masha");

        Atm atm1 = new Atm(credit);
        Atm atm2 = new Atm(debit);

        System.out.println(atm1.topUpYourAccount(new BigDecimal(1000)));
        System.out.println(atm2.withdrawalFromAccount(new BigDecimal(7000)));
    }
}
