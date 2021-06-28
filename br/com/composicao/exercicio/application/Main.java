package br.com.composicao.exercicio.application;

import br.com.composicao.exercicio.classes.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date: ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.println("How many items to this order? ");
        int qty = sc.nextInt();
        sc.nextLine();

       Order order = new Order(new Date(), status, client);

        for(int i = 0; i < qty; i++) {
            System.out.printf("Enter #%d item data:%n", i + 1);
            System.out.println("Product name: ");
            String prodName = sc.nextLine();
            System.out.println("Product price: ");
            float price = sc.nextFloat();
            sc.nextLine();
            System.out.println("Quantity: ");
            int prodQty = sc.nextInt();
            sc.nextLine();

            Product product = new Product(prodName, price);
            OrderItem orderItem = new OrderItem(prodQty, price, product);
            order.addItem(orderItem);
        }

        System.out.println(order);
    }
}
