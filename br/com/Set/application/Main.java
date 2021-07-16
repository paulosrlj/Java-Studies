package br.com.Set.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Não aceita valores repetidos -> conjunto matemático
        Set<String> set = new HashSet<>();
//        Set<String> tree = new TreeSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        set.remove("Tablet");
        set.removeIf(x -> x.length() == 2);

        for(String p : set) System.out.println(p);

        // Operações de conjunto
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 7, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // Union
        Set<Integer> c = new TreeSet<>(a);
        // união com b
        c.addAll(b);
        System.out.println(c);

        // Intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // Difference
        Set<Integer> e = new TreeSet<>(a);
        // remove do conjunto e tudo que está em b
        e.removeAll(b);
        System.out.println(e);
    }
}
