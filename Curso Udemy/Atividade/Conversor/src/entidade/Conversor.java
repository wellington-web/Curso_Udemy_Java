package entidade;

import java.math.BigDecimal;

public class Conversor {

    private BigDecimal dolar;
    private BigDecimal comDolar;

    private final BigDecimal IMPOSTO = BigDecimal.valueOf(0.06);

    public BigDecimal getDolar() {
        return dolar;
    }

    public void setDolar(BigDecimal dolar) {
        this.dolar = dolar;
    }

    public BigDecimal getComDolar() {
        return comDolar;
    }

    public void setComDolar(BigDecimal comDolar) {
        this.comDolar = comDolar;
    }

    public BigDecimal imposto() {
        return comDolar.multiply(IMPOSTO);
    }

    public BigDecimal valorEmReal() {
        return dolar.multiply(comDolar.add(imposto()));
    }

    public String toString() {
        return "Quantidades em reais a pagar: R$" + String.format("%.2f",valorEmReal() );
    }
}