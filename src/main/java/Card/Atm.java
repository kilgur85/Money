package Card;

import javax.naming.InsufficientResourcesException;
import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Atm {
    Card card;

    public Atm(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public BigDecimal topUpYourAccount(BigDecimal money) {
        return card.topUpYourAccount(money);
    }

    public BigDecimal withdrawalFromAccount(BigDecimal money) {
        try {
            return card.withdrawalFromAccount(money);
        } catch (ExceptionInsufficientFunds z) {
            z.printStackTrace();
        }
        return card.balance;
    }
}



