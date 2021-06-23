package br.com.Listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.Listas.entities.Employee;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		System.out.println("Enter the employees quantity: ");
		int empNumbers = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < empNumbers; i++) {
			System.out.println("Enter the employee id: ");
			int id = sc.nextInt();
			
			while (hasId(employees, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.println("Enter the name: ");
			String name = sc.nextLine();
			System.out.println("Enter the salary: ");
			float salary = sc.nextFloat();
			sc.nextLine();
			
			Employee emp = new Employee(id, name, salary);
			employees.add(emp);
			
			System.out.println();
		}
		sc.nextLine();


		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		// Find the employee
		Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp == null)
			System.out.println("This employee does not exists");
		else {
			System.out.println("Enter the percentage: " );
			float percentage = sc.nextFloat();
			
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		
		System.out.println("List of employess: ");
		for(Employee e : employees)
			System.out.printf("%d, %s, R$ %.2f%n", e.getId(), e.getName(), e.getSalary());
		
		
		sc.close();
	}
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
