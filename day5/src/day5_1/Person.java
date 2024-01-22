package day5_1;

import java.util.Scanner;

public class Person {
	int id;
	String name;
	protected Scanner sc = new Scanner(System.in);
	
	public Person() {
		
	}
	public Person(int id , String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void getData() {
		System.out.println("ID :"+ id + " Name :"+ name);
	}
	
}
