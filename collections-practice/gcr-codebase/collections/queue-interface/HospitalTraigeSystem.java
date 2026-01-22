/*Hospital Triage System
Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.
Example:
Patients: [("John", 3), ("Alice", 5), ("Bob", 2)] → Order: Alice, John, Bob. */
import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTraigeSystem{

    public static void main(String[] args){
        PriorityQueue<Patient> pq = new PriorityQueue<>((a,b)->b.severity-a.severity);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of patients : ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("Enter patient name : ");
            String name = sc.next();
            System.out.println("Enter patient severity(int values) : ");
            int severity = sc.nextInt();
            pq.add(new Patient(name,severity));
        }

        System.out.println("Treatment order: ");
        while(!pq.isEmpty()){
            Patient patient = pq.remove();
            System.out.println("pateint: " + patient.name+" | severity: " + patient.severity);
        }
    


    }
}
