package br.com.Classes.introducaoMetodos.testesClasses;

import br.com.Classes.introducaoMetodos.classes.Calculadora;

public class calculadoraTeste {
    public static void main (String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaNumeros();
        
        int n = 3;
        calc.multiplica(200, n++);
        System.out.println(n);

        // Alterando valores de uma variavel

        int num1 = 5;
        int num2 = 10;

        calc.alteraDoisNumeros(num1, num2);
        // Não alterou, pois apenas uma cópia foi passada para a função
        System.out.println(num1);
        System.out.println(num2);

        //  varargs
        int[] nums = new int[] {1, 5, 20, 90};

        calc.somaArray(nums);
    }
}
