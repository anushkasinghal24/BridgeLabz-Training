//package classesandobjects;

import java.util.*;

public class AreaOfCircle {
	
	double radius;
	
	public AreaOfCircle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {		
		return Math.PI * radius * radius;	
		
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public void display() {
		System.out.println( "Radius: " + radius);
		System.out.println ("Area : " + getArea());
		System.out.println("Circumference: " + getCircumference());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		AreaOfCircle circ = new AreaOfCircle(radius);
		circ.display ();
	}
}