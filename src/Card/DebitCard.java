package Card;

import javax.naming.InsufficientResourcesException;
import java.math.BigDecimal;

public class DebitCard extends Card{

    public DebitCard(String name) {
        super(name);
    }

    public DebitCard(BigDecimal balance, String name) {
        super(balance, name);
    }
    @Override
    public BigDecimal withdrawalFromAccount(BigDecimal cash) throws ExceptionInsufficientFunds  {
        if(balance.compareTo(cash)>= 0){
            return balance.subtract(cash);
        } else {
         throw new ExceptionInsufficientFunds ("Вы превысили доступную сумму ");
        }
    }
    @Override
    public String toString() {
        return "DebitCard{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
