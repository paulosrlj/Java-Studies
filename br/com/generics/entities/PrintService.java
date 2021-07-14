package br.com.generics.entities;

import java.util.ArrayList;
import java.util.List;

// aceita qualquer tipo - tipo genercis
public class PrintService<T> {
    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T first() throws IllegalAccessException {
        if (list.isEmpty()) {
            throw new IllegalAccessException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) System.out.print(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
