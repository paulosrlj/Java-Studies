package br.com.Classes.introducaoMetodos.testesClasses;

import br.com.Classes.introducaoMetodos.classes.Estudante;

public class estudanteTeste {
    public static void main(String[] args){
        Estudante e1 = new Estudante("Paulo", 19,new float[] {3.9f, 5.7f, 7.0f});
        
        e1.imprimir();
        System.out.println(e1.getNome());
        System.out.println(e1.getidade());
        System.out.println(e1.getNotas());
    
        System.out.printf("%.2f", e1.calcNota());
    }
}
