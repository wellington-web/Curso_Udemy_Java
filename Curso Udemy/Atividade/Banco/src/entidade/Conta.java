package entidade;

import java.math.BigDecimal;

public class Conta {

    private String titular;
    private Integer numero;
    private BigDecimal depositoInit = BigDecimal.valueOf(0);
    private final BigDecimal TAXA = BigDecimal.valueOf(5);

    public Conta(String titular, Integer numero) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(String titular, Integer numero, BigDecimal depositoInit) {
        this.titular = titular;
        this.numero = numero;
        this.depositoInit = depositoInit;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public BigDecimal getDepositoInit() {
        return depositoInit;
    }

    public void deposito(BigDecimal valorDeposito){
        depositoInit = depositoInit.add(valorDeposito);

    }

    public void saque(BigDecimal saque){
        saque = saque.add(TAXA);
        depositoInit = depositoInit.subtract(saque);

    }
    public String toString(){
        return "Conta "
                + numero
                +", Titular: "
                +titular
                +", Balanço: $"
                +String.format("%.2f",depositoInit);
    }
}