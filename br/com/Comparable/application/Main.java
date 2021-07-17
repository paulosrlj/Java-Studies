package br.com.Comparable.application;

import br.com.Comparable.entities.MyComparator;
import br.com.Comparable.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // Classe anônima
//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };

//        Comparator<Product> comp = (p1, p2) -> {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        };

        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());


        list.sort(comp);

        for (Product p : list)
            System.out.println(p);


    }
}
