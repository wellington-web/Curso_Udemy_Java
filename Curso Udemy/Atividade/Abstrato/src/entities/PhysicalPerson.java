package entities;

import java.math.BigDecimal;

public class PhysicalPerson extends People {

    private BigDecimal healthExpenditures;

    public PhysicalPerson() {
        super();
    }

    public PhysicalPerson(String name, BigDecimal anualIncome, BigDecimal healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public BigDecimal getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(BigDecimal healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Number taxe() {
        BigDecimal basicTax;
        if (getAnualIncome().compareTo(getAnualIncome()) >= 20000) {
            basicTax = getAnualIncome().multiply(BigDecimal.valueOf(0.15));
        } else {
            basicTax = getAnualIncome().multiply(BigDecimal.valueOf(0.25));
        }
        basicTax = basicTax.subtract((getHealthExpenditures().multiply(BigDecimal.valueOf(0.5))));
        if (basicTax.compareTo(basicTax) < 0.0) {
            return BigDecimal.valueOf(0.0);
        }
        else {
            return basicTax;
        }
    }
}
