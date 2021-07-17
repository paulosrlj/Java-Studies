package br.com.InterfaceFuncionalConsumer.util;

import br.com.InterfaceFuncionalConsumer.Entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
