package entity;

import java.math.BigDecimal;

public class Employed {

    private String name;
    private BigDecimal grossSalary;

    public Employed() {
    }

    public Employed(String name, BigDecimal grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    /* public Employed(String name, BigDecimal grossSalary, Double taxPercentage, Double percentageOfIncrease) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.taxPercentage = taxPercentage;
        this.percentageOfIncrease = percentageOfIncrease;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(BigDecimal grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void

   /* public BigDecimal netSalaryWithoutIncrease() {
        return grossSalary.subtract((BigDecimal.valueOf(taxPercentage).divide(BigDecimal.valueOf(100)).multiply(grossSalary)));
    }

    public BigDecimal grossSalaryWithIncrease() {
        return grossSalary.add((BigDecimal.valueOf(percentageOfIncrease).divide(BigDecimal.valueOf(100)).multiply(grossSalary)));
    }

    public BigDecimal netSalaryWithIncrease() {
        return grossSalaryWithIncrease().subtract((BigDecimal.valueOf(taxPercentage).divide(BigDecimal.valueOf(100)).multiply(grossSalaryWithIncrease())));

    }*/

    public String toStringDataSalaryWithIncrease() {
        return "Name: "
                + name
                + ", Net salary: "
                + String.format("%.2f", netSalaryWithIncrease());
    }

    public String toStringDataSalaryWithoutIncrease() {
        return "Name: "
                + name
                + ", Net salary: "
                + String.format("%.2f", netSalaryWithoutIncrease());
    }
}
