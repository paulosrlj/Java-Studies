package br.com.InterfaceFuncionalConsumer.application;

import br.com.InterfaceFuncionalConsumer.Entities.Product;
import br.com.InterfaceFuncionalConsumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.9));

        list.forEach(new PriceUpdate());

        list.forEach(System.out::println);
    }
}
