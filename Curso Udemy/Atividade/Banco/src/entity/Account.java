package entity;

import java.math.BigDecimal;

public class Account {

    private String holder;
    private final Integer accountNumber;
    private BigDecimal initialDeposit = BigDecimal.valueOf(0);
    private final BigDecimal RATE = BigDecimal.valueOf(5);

    public Account(String holder, Integer accountNumber) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public Account(String holder, Integer accountNumber, BigDecimal initialDeposit) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.initialDeposit = initialDeposit;
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

    public BigDecimal getInitialDeposit() {
        return initialDeposit;
    }

    public void deposit(BigDecimal depositAmount){
        initialDeposit = initialDeposit.add(depositAmount);
    }

    public void withdraw(BigDecimal withdrawalAmount){
        withdrawalAmount = withdrawalAmount.add(RATE);
        initialDeposit = initialDeposit.subtract(withdrawalAmount);
    }

    public String toString(){
        return "Account "
                + accountNumber
                +", Holder: "
                + holder
                +", Balance: $"
                +String.format("%.2f", initialDeposit);
    }
}