package br.com.InterfaceFuncionalFunction.util;


import br.com.InterfaceFuncionalFunction.Entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
