package br.com.genericosDelimitados.application;

import br.com.genericosDelimitados.entities.Product;
import br.com.genericosDelimitados.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Product> list = new ArrayList<>();

        String path = "/home/paulo/Documentos/repos/Java-Studies/br/com/genericosDelimitados/products.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
