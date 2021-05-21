package entidade;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private BigDecimal salarioBruto;
    private Double impostoPorc;
    private Double aumentarPorc;

    public Funcionario(String nome, BigDecimal salarioBruto, Double impostoPorc, Double aumentarPorc) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.impostoPorc = impostoPorc;
        this.aumentarPorc = aumentarPorc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(BigDecimal salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getImpostoPorc() {
        return impostoPorc;
    }

    public void setImpostoPorc(Double impostoPorc) {
        this.impostoPorc = impostoPorc;
    }

    public Double getAumentarPorc() {
        return aumentarPorc;
    }

    public void setAumentarPorc(Double aumentarPorc) {
        this.aumentarPorc = aumentarPorc;
    }

    public BigDecimal salarioLiquidoSemAumento() {
        return salarioBruto.subtract((BigDecimal.valueOf(impostoPorc).divide(BigDecimal.valueOf(100)).multiply(salarioBruto)));
    }

    public BigDecimal salarioBrutoAumento() {
        return salarioBruto.add((BigDecimal.valueOf(aumentarPorc).divide(BigDecimal.valueOf(100)).multiply(salarioBruto)));
    }

    public BigDecimal salarioLiquidoComAumento() {
        return salarioBrutoAumento().subtract((BigDecimal.valueOf(impostoPorc).divide(BigDecimal.valueOf(100)).multiply(salarioBrutoAumento())));

    }

    public String toStringDadoComAumento() {
        return "Nome: "
                + nome
                + ", Salário liquido: "
                + String.format("%.2f", salarioLiquidoComAumento());
    }

    public String toStringDadoSemAumento() {
        return "Nome: "
                + nome
                + ", Salário liquido: "
                + String.format("%.2f", salarioLiquidoSemAumento());
    }
}
