package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		// instantiating an object
		Person person1 = new Person();
		
		// define some properties
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "3214469568";
		
		// Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		
		
		/*
		// Person-
		
		// Attributes, variables, adjectives, despriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "3214469568";
		
		
		// Action, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);		
		System.out.println(name + " is eating");
		
		// what if we wanted to do this for another person?
		String name2 = "John";
		String email2 = "John@testemail.com";
		String phone2 = "3214469568";
		
		// Action, activity, behavior
		// System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// what about binding attributes and properties together?
	}
	
	// Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
	*/
	}
}
