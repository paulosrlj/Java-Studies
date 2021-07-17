package br.com.Streams.application.exercicioResolvido;

import br.com.Streams.application.exercicioResolvido.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "/home/paulo/Documentos/repos/Java-Studies/br/com/Streams/application/exercicioResolvido/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            // Média dos preços dos produtos
            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (n1, n2) -> n1 + n2) / list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            // Ordenar os produtos que estão abaixo da média em ordem decrescente
            Comparator<String> comp = (s1, s2) -> -s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp)
                    .collect(Collectors.toList());

            names.forEach(System.out::println);
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
