//Linear search Algo

/*
You are given an array of sentences (strings). 
Write a program that performs Linear Search to find the first sentence containing a specific word.
If the word is found, return the sentence. If no sentence contains the word, return "Not Found". */
import java.util.*;

public class FindSpecificWord{
    public static String findSentence(String[] sentence,String word){
        for(String s:sentence){
            if(s.toLowerCase().contains(word.toLowerCase())){
            return s;
        }

        }
        return "Not Found";
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] sentence = new String[n];

        
        System.out.println("Enter sentences : ");
        for(int i = 0 ; i<n ; i++){
            sentence[i] = sc.nextLine();
        }

        System.out.println("Enter the target word");
        String target = sc.nextLine();

        

        System.out.println("The sentence is: " + findSentence(sentence,target));

    }
}