package br.com.Enumaracoes.application;

import br.com.Enumaracoes.classes.Order;
import br.com.Enumaracoes.classes.OrderStatus;
import java.util.Date;

public class application {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        // String para enum
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1.getClass().getSimpleName());
        System.out.println(os2.getClass().getSimpleName());
    }
}
