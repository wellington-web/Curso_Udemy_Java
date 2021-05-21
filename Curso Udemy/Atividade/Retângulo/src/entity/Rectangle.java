package entity;

public class Rectangle {

    public Double height;
    public Double base;

    public Double area() {
        return (height * base);
    }
    public Double perimeter() {
        return (height * 2) + (base * 2);
    }
    public Double diagonal() {
        return Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
    }
}