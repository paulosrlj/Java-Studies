package br.com.Map.Exercicio.entities;

import java.util.Objects;

public class Person {
    private String name;
    private Double votes;

    public Person(String name, Double votes) {
        this.name = name;
        this.votes = votes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(votes, person.votes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(votes);
    }
}
