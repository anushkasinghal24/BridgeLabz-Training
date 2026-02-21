package SmartTrafficCollectionSystem;

public abstract class Violation{

    protected String type;

    public Violation(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }

    public abstract int calculateFine(int previousViolation);
}
