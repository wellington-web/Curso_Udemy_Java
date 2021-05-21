package entity;

public class Triangle {

    public Double a;
    public Double b;
    public Double c;

    public	Double area() {
        Double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}