//Calculate the perimeter of rectangle

import java.util.*;
public class rectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int perimeter = 2 *(length + breadth);
        System.out.println("Perimeter of reactangle is : " + perimeter);
    }
}