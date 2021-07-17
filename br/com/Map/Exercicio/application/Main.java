package br.com.Map.Exercicio.application;

import br.com.Set.exercicioResolvido.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader((new FileReader(path)))) {
            Map<String, Integer> peopleVotes = new HashMap<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                if(peopleVotes.containsKey(name)) {
                    Integer votesCount = peopleVotes.get(name);
                    peopleVotes.put(name, (votes + votesCount));
                } else
                    peopleVotes.put(name, votes);

                line = br.readLine();
            }

            for(String key : peopleVotes.keySet())
                System.out.println(key + ": " + peopleVotes.get(key));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
