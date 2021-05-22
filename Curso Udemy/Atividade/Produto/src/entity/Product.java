package entity;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;
    private BigDecimal stock;

    public Product() {
    }

    public Product(String name, BigDecimal price, BigDecimal stock) {
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

    public BigDecimal getStock() {
        return stock;
    }

    public BigDecimal setStock(BigDecimal stock) {
        this.stock = stock;
        return stock;
    }

    public BigDecimal stockPrice() {
        return price.multiply(stock);
    }

    public BigDecimal stockAdd(BigDecimal stockAdd) {
        return setStock(stock.add(stockAdd));
    }

    public BigDecimal withdrawStock(BigDecimal quantityWithdraw) {
        return setStock(stock.subtract(quantityWithdraw));
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