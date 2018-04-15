package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}

public class demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "7535483214";
		
		//Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		

		/*
		// Person - 
		String name = "Joe";
		String email = "Joe@testemail.com";
		String phone = "7523698514";
		
		// Actions, activity, behavior
		walking(name);
		System.out.println(name + " is eating");
		
		//what if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "5871298514";
		
		// Actions, activity, behavior
		walking(name2);
		System.out.println(name2 + " is eating");
		
		//What about binding attributes and properties together?
		
	}

	//Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");	
	}
	*/
	}
}

