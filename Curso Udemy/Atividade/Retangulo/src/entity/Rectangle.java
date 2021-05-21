package entity;

public class Rectangle {

    public Double height;
    public Double Base;

    public Double area() {
        return (height * Base);
    }
    public Double perimeter() {
        return (height * 2) + (Base * 2);
    }
    public Double diagonal() {
        return Math.sqrt(Math.pow(height, 2) + Math.pow(Base, 2));
    }
}