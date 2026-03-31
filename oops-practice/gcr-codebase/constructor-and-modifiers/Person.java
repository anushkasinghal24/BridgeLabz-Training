//Create a Person class with a copy constructor that clones another person's attributes.

import java.util.*;


 class Person {
	
	 String name;
	 int age;
	 
	 
	 Person(String name, int age){
		 this.name = name;
		 this.age = age;
		 
	 }
	 
	 Person(Person p){
		 this.name = p.name;
		 this.age = p.age;
	 }
	 
	 
	 void display() {
		 System.out.println("Name "+name+" Age "+age);
	 }
	
	 
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter name");
		 String n = sc.nextLine();
		 System.out.println("Enter age");
		 int age = sc.nextInt();
		 
		 Person p1 = new Person(n,age);
		 
		 Person p2 = new Person(p1);
		 
		 p1.display();
		 p2.display();
	 }

}