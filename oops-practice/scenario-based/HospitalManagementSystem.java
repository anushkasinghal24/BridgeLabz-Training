/*Hospital Patient Management System (CRUD)
● Concepts: Patient, Doctor, Bill classes.
● OOP: Encapsulation (Properties), Abstraction (Interface IPayable), Inheritance
(InPatient, OutPatient : Patient), Polymorphism (DisplayInfo).
 */
import java.util.*;
interface IPayable{
    double calculateBill();

}

abstract class Patient implements IPayable{
    protected int pateintId;

    protected String name;
    protected int age;
    
    public Patient(int pateintId,String name,int age){
        this.pateintId = pateintId;
        this.name = name;
        this.age = age;
    }


    abstract void displayInfo();
}


class InPatient extends Patient{

    private int daysAdmitted;
    private double chargePerDay;
    public InPatient(int id,String name,int age,int days, double charge){
        super(id,name,age);
        this.daysAdmitted = days;
        this.chargePerDay = charge;
    }



    @Override


    public double calculateBill(){
        return daysAdmitted*chargePerDay;
    }


    @Override 
    void displayInfo(){
        System.out.println("Patient id: "+ pateintId);
        System.out.println("Patient name: "+name);
        System.out.println("Patient age: " + age);
        System.out.println("Total bill: "+ calculateBill());
    }


}



class OutPatient extends Patient{

    private double consultationFee;
    public OutPatient(int id,String name,int age,double fee){
        super(id,name,age);
        this.consultationFee=fee;
    }

    @Override

    public double calculateBill(){
        return consultationFee;
    }

    @Override 

      void displayInfo(){
         
        System.out.println("Patient id: "+pateintId);
        System.out.println("Patient name: "+ name);
        System.out.println("Patient age: "+ age);
        System.out.println("Total bill: "+calculateBill());
    }

}


class Doctor{
    private int docId;
    private String name;
    private String specialization;


    public Doctor(int id, String name, String specialization ){
        this.docId = id;
        this.name = name;
        this.specialization = specialization;
    }

    public void displayDoctor(){

        System.out.println("Doctor name: " + name);
        System.out.println("Doctor id: "+docId);
        System.out.println("Doctor specialization: "+ specialization);
    }






}





public class HospitalManagementSystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter doctor id: ");
        int docId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter doctor name: ");
        String docName = sc.nextLine();
        
        System.out.print("Enter specialization: ");
        String special = sc.nextLine();



        Doctor doctor=new Doctor(docId,docName,special);


        System.out.print("Enter patient type(1-InPatient, 2-OutPatient)");
        int choice = sc.nextInt();

        System.out.print("Enter patient id: ");
        int pid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age =sc.nextInt();


        Patient patient;

        if(choice == 1){
            System.out.print("Enter days admitted: ");
            int days = sc.nextInt();

            System.out.print("Enter charge per day: ");
            double charge = sc.nextDouble();


            patient = new InPatient(pid, name, age, days, charge);
        }
        else{
            System.out.print("Enter consultation fee: ");
            double fee = sc.nextDouble(); 

            patient = new OutPatient(pid, name, age, fee);
        }

        System.out.println("====Details====");
        doctor.displayDoctor();
        patient.displayInfo();


        }



    }