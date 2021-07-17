package br.com.InterfaceFuncionalFunction.application;

import br.com.InterfaceFuncionalFunction.Entities.Product;
import br.com.InterfaceFuncionalFunction.services.ProductService;
import br.com.InterfaceFuncionalFunction.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.9));

//        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
//
//        names.forEach(System.out::println);


        // Criar uma função que recebe outra função como parâmetro

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
