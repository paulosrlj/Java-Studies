package br.com.Polimorfismo.exercicios.fixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products : ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d data: ", i + 1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            switch (type) {
                case 'i':
                    System.out.print("Customs fee: ");
                    Double cf = sc.nextDouble();

                    Product prod = new ImportedProduct(name, price, cf);
                    products.add(prod);
                    break;

                case 'u':
                    System.out.print("Manufacture date: ");
                    Date mf = sdf.parse(sc.next());

                    prod = new UsedProduct(name, price, mf);
                    products.add(prod);
                    break;

                default:
                    prod = new Product(name, price);
                    products.add(prod);
            }
        }

        System.out.println("PRICE TAGS: ");
        for(Product p : products)
            System.out.println(p.priceTag());
    }
}
