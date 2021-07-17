package br.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(32, 2, 90, 1));

        List<Product> list2 = new ArrayList<>();

        Collections.sort(list);
        Collections.sort(list2);

        for(Integer i : list)
            System.out.println(i);
    }
}

class Product implements Comparable<Product> {
    private String nome;

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}