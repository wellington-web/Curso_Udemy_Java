package application;

import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        Order order = new Order(1000, new Date(), OrderStatus.PROCESSING);

        System.out.println(order);

    //  Conversão de String para enum

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);

        System.out.println(os2);

    }
}
