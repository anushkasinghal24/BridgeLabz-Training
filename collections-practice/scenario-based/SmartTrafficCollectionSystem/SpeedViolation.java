package SmartTrafficCollectionSystem;

public class SpeedViolation extends Violation{

    public SpeedViolation(){
        super("Speed Violation");
    }

    @Override 
    public int calculateFine(int previousViolation){
        int fine=500;
        if(previousViolation>0) fine=fine+200;
        return fine;
    }
}
