package entities;

import java.math.BigDecimal;
import java.util.Date;

public class UsedProduct extends Product {

    private Date manufactere;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, BigDecimal price, Date manufactere) {
        super(name,price);
        this.manufactere = manufactere;
    }

    public Date getManufactere() {
        return manufactere;
    }

    public void setManufactere(Date manufactere) {
        this.manufactere = manufactere;
    }

    @Override
    public String tag() {
        return "Product used: " + getName() + " Price: $ " + String.format("%.2f",getPrice()) + " Manufactere date: " + getManufactere();
    }
}
