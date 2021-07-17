package br.com.Map.application;

import br.com.Map.entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "05002014007");

        cookies.remove("email");
        cookies.put("phone", "123456789");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        for(String key : cookies.keySet())
            System.out.println(key + ": " + cookies.get(key));

        //////////////////////
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        // Vai comparar usando hashCode e equals, e caso não existam vai usar o endereço de memória
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
