package br.com.Listas.entities;

public class Employee {
	private int id;
	private String name;
	private float salary;

	public int getId() {
		return id;
	}

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void increaseSalary(float percentage) {
		this.salary += (this.salary * percentage) / 100;
	}
}
