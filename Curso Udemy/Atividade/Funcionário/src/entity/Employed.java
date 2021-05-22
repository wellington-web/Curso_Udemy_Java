package entity;

import java.math.BigDecimal;

public class Employed {

    private String name;
    private BigDecimal salary;
    private BigDecimal taxPercentage;
    private BigDecimal increasePercentage;

    public Employed() {
    }

    public Employed(String name, BigDecimal salary, BigDecimal taxPercentage, BigDecimal increasePercentage) {
        this.name = name;
        this.salary = salary;
        this.taxPercentage = taxPercentage;
        this.increasePercentage = increasePercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(BigDecimal taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public BigDecimal getIncreasePercentage() {
        return increasePercentage;
    }

    public void setIncreasePercentage(BigDecimal increasePercentage) {
        this.increasePercentage = increasePercentage;
    }

    public BigDecimal netSalary () {
        return salary.subtract((taxPercentage.divide(BigDecimal.valueOf(100)).multiply(salary)));
    }

    public void netSalaryIncrease() {
        setSalary(salary.add((increasePercentage.divide(BigDecimal.valueOf(100)).multiply(salary))));
    }

    public String toStringDataSalaryWithIncrease() {
        return "Name: "
                + name
                + ", Net salary: "
                + String.format("%.2f", netSalary());
    }

    public String toStringDataSalaryWithoutIncrease() {
        return "Name: "
                + name
                + ", Net salary: "
                + String.format("%.2f", netSalary());
    }
}
