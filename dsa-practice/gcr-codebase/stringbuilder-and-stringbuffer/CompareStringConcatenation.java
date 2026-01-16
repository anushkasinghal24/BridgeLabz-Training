/*Write a program that compares the performance of StringBuffer and StringBuilder for concatenating strings. 
For large datasets (e.g., concatenating 1 million strings), 
compare the execution time of both classes. */
import java.util.*;
public class CompareStringConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 1_000_000; //Number of Strings to concatenate
        String arr = "Hello";
        
        /////////StringBuffer////////////////
        long startTime1 = System.nanoTime();
        StringBuffer  sbf = new StringBuffer();
        for(int i = 0 ; i< length; i++){
            sbf.append(arr);
        }

        long endTime1 =  System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime1 - startTime1)/ 1_000_000 + " ms");


        /////////StringBuilderr////////////////
        long startTime2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< length; i++){
            sb.append(arr);
        }

        long endTime2 =  System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime2 - startTime2)/ 1_000_000 + " ms");
         
    }
    
}
