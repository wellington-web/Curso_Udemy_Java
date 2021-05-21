package entity;

import java.math.BigDecimal;

public class Converter {

    private BigDecimal dollar;
    private BigDecimal buyDollar;
    private final BigDecimal TAX = BigDecimal.valueOf(0.06);

    public BigDecimal getDollar() {
        return dollar;
    }

    public void setDollar(BigDecimal dollar) {
        this.dollar = dollar;
    }

    public BigDecimal getBuyDollar() {
        return buyDollar;
    }

    public void setBuyDollar(BigDecimal buyDollar) {
        this.buyDollar = buyDollar;
    }

    public BigDecimal tax() {
        return buyDollar.multiply(TAX);
    }

    public BigDecimal valueInReal() {
        return dollar.multiply(buyDollar.add(tax()));
    }

    public String toString() {
        return "Amounts in real payable: R$" + String.format("%.2f", valueInReal() );
    }
}