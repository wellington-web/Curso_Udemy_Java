package  entities;

import java.math.BigDecimal;

public abstract class People {

    private String name;
    private BigDecimal anualIncome;

    public People() {
    }

    public People(String name, BigDecimal anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(BigDecimal anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract Number taxe();
}