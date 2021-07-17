package br.com.InterfaceFuncionalPredicate.application;

import br.com.InterfaceFuncionalPredicate.Entities.Product;
import br.com.InterfaceFuncionalPredicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 9000.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.9));

//        list.removeIf(new ProductPredicate());

        // reference method com método estático
//        list.removeIf(Product::staticProductPredicate);

        // reference method sem método estático
//        list.removeIf(Product::nonStaticProductPredicate);


        Predicate<Product> pred = p -> p.getPrice() >= 100;
        list.removeIf(pred);


        for(Product p : list) System.out.println(p);
    }
}
