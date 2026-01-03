/*Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
 */
import java.util.*;

	class Animal{
		String name;
		int age;
		
		Animal(String name,int age){
			this.name = name;
			this.age = age;
		}
		
		void sound(){
			System.out.println("Animals make sound");
		}
	}
	
	class Dog extends Animal{
		Dog(String name, int age){
			super(name,age);
		}
		
		@Override
		 void sound() {
			System.out.println(name + " barks");
		}
	}
	
	class Cat extends Animal{
		
		Cat(String name, int age){
			super(name,age);
		}
		@Override
		void sound() {
			System.out.println(name + " meows");
		}
	}
	
	class Bird extends Animal{
		Bird(String name, int age){
			super(name,age);
		}
		@Override
		void sound() {
			System.out.println(name + " chirps");
		}
	}
	
	public class AnimalHierarchy{
		 public static void main(String args[]) {
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("Enter animal type (Dog/Cat/Bird) :");
			 
			 String type = sc.nextLine();
			 
			 System.out.println("Enter animal name :");
			 String name = sc.nextLine();
			 
			 
			 System.out.println("Enter animal age : ");
			 int age = sc.nextInt();




			 Animal animal = null;//polymorphism
			 
			 
			 switch(type) {

                case "dog":
                    animal = new Dog(name,age);
                    break;

			 
                case "cat":
                    animal = new Cat(name,age);
                    break;
                case "bird":
                    animal = new Bird(name,age);
                    break;
			 
                default:
                    System.out.println("Invalid type ");
		 
				 
			 }
			 
			 System.out.println("Animal details: ");
			 System.out.println("Name: "+animal.name);
			 System.out.println("Age: "+animal.age);
			 System.out.println("Sound: ");
			 animal.sound();
			 
		}
	}