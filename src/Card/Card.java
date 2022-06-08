package Card;

import javax.naming.InsufficientResourcesException;
import java.math.BigDecimal;


public abstract class Card {
    protected String name;
    protected BigDecimal balance;


    public Card(String name) {
        this.name = name;
    }

    public Card(BigDecimal balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal topUpYourAccount(BigDecimal cash) {
        return balance.add(cash);
    }

    public abstract BigDecimal withdrawalFromAccount(BigDecimal cash) throws ExceptionInsufficientFunds;

    public BigDecimal currencyExchange(BigDecimal currency) {
        return balance.multiply(currency);
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}


