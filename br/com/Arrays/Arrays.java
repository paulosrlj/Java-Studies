package br.com.Arrays;


public class Arrays {
    public static void main(String[] args) {
        // Maneiras de declarar um array
        int[] arrInt = { 1, 2, 3 };
        int[] arrInt2 = new int[3];
        int[] arrInt3 = new int[] { 1, 2, 3 };

        int[][] dias = new int[3][];

        // Inicializa com 0
        dias[0] = new int[2];
        dias[1] = new int[] { 1, 2, 3 };
        dias[2] = new int[4];

        for (int[] arr : dias)
            for (int num : arr) System.out.println(num);

        System.out.println();
        // array multidimensional
        // cada posição contém a referencia para outro array
        int[][] multiDim = new int[2][2];

        for (int i = 0; i < multiDim[0].length; i++)
            for (int j = 0; j < multiDim[1].length; j++)
                multiDim[i][j] = j;

        for (int[] arr : multiDim)
            for (int num : arr)
                System.out.println(num);
    }
}