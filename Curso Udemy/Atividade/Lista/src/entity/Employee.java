package entity;

import java.math.BigDecimal;

public class Employee {

    private Integer id;
    private String name;
    private BigDecimal salary;

    public Employee() {
    }

    public Employee(Integer id, String name, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void increaseSalary(BigDecimal percentage) {
        setSalary(salary.add(salary.multiply((percentage)).divide(BigDecimal.valueOf(100))));
    }

    public  String toString() {
        return  "ID: " + id + ", Name: " + name + ", Salary: R$" + String.format("%.2f",salary);
    }
}
