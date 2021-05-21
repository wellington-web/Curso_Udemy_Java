package entity;

import java.math.BigDecimal;

public class Account {

    private String holder;
    private final Integer accountNumber;
    private BigDecimal balance = BigDecimal.valueOf(0);
    private final BigDecimal RATE = BigDecimal.valueOf(5);

    public Account(String holder, Integer accountNumber) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public Account(String holder, Integer accountNumber, BigDecimal balance) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal depositAmount){
        balance = balance.add(depositAmount);
    }

    public void withdraw(BigDecimal withdrawalAmount){
        withdrawalAmount = withdrawalAmount.add(RATE);
        balance = balance.subtract(withdrawalAmount);
    }

    public String toString(){
        return "Account "
                + accountNumber
                +", Holder: "
                + holder
                +", Balance: $"
                +String.format("%.2f", balance);
    }
}