package br.com.Set.exercicioFixacao.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> aCourse = new HashSet<>();
        Set<Integer> bCourse = new HashSet<>();
        Set<Integer> cCourse = new HashSet<>();

        // Course A
        System.out.print("How many students for course A? ");
        int amount = sc.nextInt();

        for (int i = 0; i < amount; i++)
            aCourse.add(sc.nextInt());

        // Course B
        System.out.print("How many students for course B? ");
        amount = sc.nextInt();

        for (int i = 0; i < amount; i++)
            bCourse.add(sc.nextInt());

        // Course C
        System.out.print("How many students for course C? ");
        amount = sc.nextInt();

        for (int i = 0; i < amount; i++)
            cCourse.add(sc.nextInt());


        aCourse.addAll(bCourse);
        aCourse.addAll(cCourse);

        for(Integer i : aCourse)
            System.out.print(i + " ");

        System.out.println();
        System.out.println("Total students: " + aCourse.size());
    }
}
