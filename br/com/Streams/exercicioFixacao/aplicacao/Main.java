package br.com.Streams.exercicioFixacao.aplicacao;

import br.com.Streams.application.exercicioResolvido.entities.Product;
import br.com.Streams.exercicioFixacao.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "/home/paulo/Documentos/repos/Java-Studies/br/com/Streams/exercicioFixacao/aplicacao/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> employees = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            // Esse comparator é Redundante
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> emails = employees.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(x -> x.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            double sum = employees.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (n1, n2) -> n1 + n2);

            System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
