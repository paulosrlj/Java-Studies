package br.com.InterfaceFuncionalPredicate.util;

import br.com.InterfaceFuncionalPredicate.Entities.Product;

import java.util.function.Predicate;

/**
 * Interface funcional -> Interface que tem apenas 1 método abstrato para ser implementado
 */
public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
