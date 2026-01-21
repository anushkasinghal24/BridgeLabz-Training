package airesumescreeningsystem;

public class DataScientist extends JobRole {

    public DataScientist(String name){
        super(name);

    }

    @Override

    public void displayRole(){
        System.out.println(getCandidateName()+" is a data scientist ");
    }
    
}