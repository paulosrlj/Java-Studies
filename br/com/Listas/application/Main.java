package br.com.Listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		/*
		  Tamanho da lista: size()
		  Inserir: add(obj), add(int, obj)
		  Remover: remove(obj), remove(int), removeIf(Predicate)
		  Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
		  Filtrar lista com base em predicado:
		  	List<Integer> result = list.stream().filter(x -> x > 4).collect(Collector.toList());
		  Encontrar primeira ocorrência com base em predicado:
		  Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		 */

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Anakin");
		list.add("Yoda");
		list.add("Dooku");
		list.add("Donattelo");
		list.add(2, "Paulo");
		
		for(String x: list)
				System.out.println(x);
		
		System.out.println("------------------------");
		
		// Remover todo elemento que comece com 'D'
		list.removeIf(x -> x.charAt(0) == 'D');
		for(String x: list)
				System.out.println(x);
		
		System.out.println("------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
	
		for(String x: result)
			System.out.println(x);
		
		System.out.println("------------------------");

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
