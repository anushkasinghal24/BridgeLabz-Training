/*Hospital Patient ID Printing
○ Scenario: Need to print all patient IDs from a list for admin verification.
○ Task: Use method references instead of lambdas. */
import java.util.*;

public class PatientIdPrinting{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        List<Integer> patientIds=new ArrayList<>();


        System.out.println("Enter number of patients: ");

        if(!sc.hasNextInt()){
            System.out.println("Invalid Input! Please enter a number");
            return;
        }

        int n=sc.nextInt();

        System.out.println("Enter patient ids: ");
        for(int i=0;i<n;i++){
            if(sc.hasNextInt()){
            patientIds.add(sc.nextInt());
            }
            else{
                System.out.println("Invalid Input! Please enter a number");
                return;
            }
        }

        System.out.println("\nPatient Ids for Admin Verification: ");
        patientIds.forEach(System.out::println);


    }
}