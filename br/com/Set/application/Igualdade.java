package br.com.Set.application;

import br.com.Set.entities.Product;
import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Se hashCode e equals estiverem implementados:
 * Primeiro hashCode, e se der igual usa equals para confirmar
 *
 * Se hashCode e equals não estiverem implementados:
 * Compara as referências de memória
 */

public class Igualdade {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod));

        /// TreeSet
        Set<Product> set2 = new TreeSet<>();

        set2.add(new Product("TV", 900.0));
        set2.add(new Product("Notebook", 1200.0));
        set2.add(new Product("Tablet", 400.0));

        for (Product p : set2)
            System.out.println(p);
    }
}
