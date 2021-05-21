package entidade;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;
    private Integer stock;

    public Product(String name, BigDecimal price, Integer stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer setStock(Integer stock) {
        this.stock = stock;
        return stock;
    }

    public BigDecimal stockPrice() {
        return price.multiply(BigDecimal.valueOf(stock));
    }

    public Integer stockAdd(Integer stockAdd) {
        return setStock(stock + stockAdd);
    }

    public Integer withdrawStock(Integer quantityWithdraw) {
        return setStock(stock - quantityWithdraw);
    }

    public String toString() {
        return name
                + ", R$ "
                + String.format("%.2f", price)
                + ", "
                + stock
                + " Units, Value: R$ "
                + String.format("%.2f",stockPrice());
    }
}