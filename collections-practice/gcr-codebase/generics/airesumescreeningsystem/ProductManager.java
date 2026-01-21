package airesumescreeningsystem;

public class ProductManager extends JobRole {

    public ProductManager(String name){
        super(name);

    }

    @Override

    public void displayRole(){
        System.out.println(getCandidateName()+" is a product manager ");
    }
    
}