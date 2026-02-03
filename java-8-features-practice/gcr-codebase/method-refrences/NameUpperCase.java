/*Name Uppercasing
○ Scenario: Convert all employee names in uppercase for an HR letter.
○ Task: Use String::toUpperCase in a stream. */
import java.util.*;
import java.util.stream.Collectors;

public class NameUpperCase{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        List<String> employeename=new ArrayList<>();

        System.out.println("Enter number of employees: ");
        int n=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter employee names: ");
        for(int i=0;i<n;i++){
            employeename.add(sc.nextLine());
        }

        List<String> upperCaseNames=employeename.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("\nEmployee Names in UpperCase: ");
        upperCaseNames.forEach(System.out::println);






    }
}