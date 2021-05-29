package entities;

import java.math.BigDecimal;

public class LegalEntity extends People {

    private Integer employees;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, BigDecimal anualIncome, Integer employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public Number taxe() {
        if (employees > 10) {
            return getAnualIncome().multiply(BigDecimal.valueOf(0.14));
        } else {
            return getAnualIncome().multiply(BigDecimal.valueOf(0.16));
        }
    }
}