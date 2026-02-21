package SmartTrafficCollectionSystem;
public class NoHelmetViolation extends Violation{
    public NoHelmetViolation(){
        super("No Helmet");


    }

    @Override
    public int calculateFine(int previousViolation){
        int fine=400;
        if(previousViolation>=3) fine=fine+2;
        return fine;
    }
}