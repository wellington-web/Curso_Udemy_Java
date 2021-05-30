package model.entities;

import model.exception.DomainException;

import java.math.BigDecimal;

public class Account {

    private static BigDecimal balance;
    private static BigDecimal withdrawLimit;
    private Integer number;
    private String name;

    public Account() {
    }

    public Account(Integer number, String name, BigDecimal balance, BigDecimal withdrawLimit) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static BigDecimal getBalance() {
        return balance;
    }

    public static BigDecimal getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(BigDecimal withdrawLimit) {
        this.withdrawLimit = withdrawLimit;

    }

    public void deposit (BigDecimal amount) {
        balance = balance.add(amount);
    }

    public static void withdraw(BigDecimal amount) {
        validateWithdraw(amount);
        balance = balance.subtract(amount);
    }

    private static void validateWithdraw(BigDecimal amount) {
        if (amount.compareTo(getWithdrawLimit()) > 0) {
            throw new DomainException("Withdrawal error: The amount exceeds the withdrawal limit");
        }
        if (amount.compareTo(getBalance()) > 0) {
            throw new DomainException("Withdrawal error: Insufficient balance");
        }
    }
}
