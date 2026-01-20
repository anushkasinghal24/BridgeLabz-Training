package airesumescreeningsystem;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String name){
        super(name);

    }

    @Override

    public void displayRole(){
        System.out.println(getCandidateName()+" is a software engineer ");
    }
    
}