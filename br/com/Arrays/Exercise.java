package br.com.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[][] array;

        System.out.println("Informe a primeira dimensão da matriz: ");
        int x = sc.nextInt();
        System.out.println("Informe a segunda dimensão da matriz: ");
        int y = sc.nextInt();
        System.out.println();

        array = new int[x][y];

        for(int i = 0; i < x; i++)
            for(int j = 0; j < y; j++) {
                array[i][j] = sc.nextInt();
            }

        System.out.println("Informe um número: ");
        int n = sc.nextInt();

        for(int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (array[i][j] == n) {
                    System.out.printf("Position %d,%d:%n", i, j);

                    if (!(i == 0))
                        System.out.printf("Up: %d%n", array[i - 1][j]);

                    if (!(i == x - 1))
                        System.out.printf("Down: %d%n", array[i + 1][j]);

                    if (!(j == 0))
                        System.out.printf("Left: %d%n", array[i][j - 1]);

                    if (!(j == y - 1))
                        System.out.printf("Right: %d%n%n", array[i][j + 1]);
                }
            }
        }
    }
}
