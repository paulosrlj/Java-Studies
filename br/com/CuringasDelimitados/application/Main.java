package br.com.CuringasDelimitados.application;

import br.com.CuringasDelimitados.entities.Circle;
import br.com.CuringasDelimitados.entities.Rectangle;
import br.com.CuringasDelimitados.entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//List<Shape> não é supertipo de List<Circle> ou List<Rectangle>

public class Main {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();

        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: ");


        // Princípio get/put

        // get - OK
        // put - Error
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;
        Number x = list.get(0);
//        list.add(20); // Erro

        // Contravariância
        // get - Error
        // put - OK

        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);
//        Number x = myNums.get(0); // Erro

        // Copiar uma lista
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 5.90, 2.22);
        List<Object> myObjs2 = new ArrayList<>();


    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) destiny.add(number);

        //destiny.addAll(source);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }

    // List<? extends Shape> -> qualquer subtipo de Shape ou próprio Shape
    public static double areaTotal(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) sum += s.area();

        return sum;
    }
}
