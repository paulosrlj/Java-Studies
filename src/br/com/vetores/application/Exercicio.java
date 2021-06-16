package br.com.vetores.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.vetores.entities.Person;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Person[] arr = new Person[10];

		System.out.println("How many rooms will be rented?");
		short rooms = sc.nextShort();
		sc.nextLine();
		
		for (short i = 0; i < rooms; i++) {
			System.out.printf("Rent #%d:%n", i + 1);

			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			short room = sc.nextShort();
			sc.nextLine();

			Person p = new Person(name, email, room);
			arr[room] = p;
		}
		
		System.out.println("\nBusy rooms:");
		for (short i = 0; i < arr.length; i++)
			if (arr[i] != null)
				System.out.printf("%d: %s, %s%n",
				arr[i].getRoom(), arr[i].getName(), 
				arr[i].getEmail());

		sc.close();
	}

}
