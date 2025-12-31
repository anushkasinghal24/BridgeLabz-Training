/*Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
 */
import java.util.*;

class Circle {
	
	double radius;
	
	Circle(){
		this(1.0);
	}
	
	Circle (double radius){
		this.radius = radius;
	}
	
	void display() {
		System.out.println("Radius: "+radius);
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius : ");
		double rad = sc.nextDouble();
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(rad);
		
		c1.display();
		c2.display();
	}
	
	

}