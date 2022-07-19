package Card;

import java.math.BigDecimal;

     public class CreditCard extends Card{

    public CreditCard (String name) {
        super(name);
    }

    public CreditCard (BigDecimal balance, String name) {
        super(balance, name);
    }

    @Override
    public BigDecimal withdrawalFromAccount(BigDecimal cash) {

        return balance.subtract(cash);
    }

         @Override
         public String toString() {
             return "CreditCard{" +
                     "name='" + name + '\'' +
                     ", balance=" + balance +
                     '}';
         }
     }