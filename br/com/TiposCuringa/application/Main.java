package br.com.TiposCuringa.application;

import java.util.ArrayList;
import java.util.List;

// Diferença entre Generics <T> e o tipo curinga <?>

/**
 * <T> -> é usado quando se quer criar uma classe onde suas
 * variáveis são de um tipo que não é definido no momento em que
 * ela é escrita, mas sim no momento que ela é usada
 *
 * <?> ->Já o ?, no contexto de genéricos, basicamente serve como um
 * wildcard, pois ele representa "qualquer tipo". Sua função é permitir
 * o uso do polimorfismo junto com genéricos.
 *
 * Quando seguido pelo palavra reservada super, por exemplo
 * <? super Number> ele aceita que qualquer objeto cujo supertipo
 * é Number seja lido ou escrito a uma variável, pois é seguro tratar
 * como Number qualquer subtipo dele.
 */

public class Main {
    public static void main(String[] args) {
        List<?> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();

        myObjs = myNumbers;


    }
}
