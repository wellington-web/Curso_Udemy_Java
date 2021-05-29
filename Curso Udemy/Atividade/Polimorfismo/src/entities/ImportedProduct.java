package entities;

import java.math.BigDecimal;

public class ImportedProduct extends Product{

    private BigDecimal customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, BigDecimal price, BigDecimal customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public BigDecimal getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(BigDecimal customsFee) {
        this.customsFee = customsFee;
    }

    public BigDecimal totalPrice() {
        return getPrice().add(customsFee);
    }

    @Override
    public String tag() {
        return "Product: " + getName() + " Price: $ " + String.format("%.2f",totalPrice()) + " Customs fee: $ " + String.format("%.2f",customsFee);
    }
}
