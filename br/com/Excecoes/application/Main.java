package br.com.Excecoes.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Method 2 START ***");
        method2();
    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        System.out.println("Fim do programa");
        sc.close();
    }
}
