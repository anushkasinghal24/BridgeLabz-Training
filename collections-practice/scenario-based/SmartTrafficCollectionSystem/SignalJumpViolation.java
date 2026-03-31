package SmartTrafficCollectionSystem;
public class SignalJumpViolation extends Violation{
    public SignalJumpViolation(){
        super("Signal Jump");
    }
    @Override
    public int calculateFine(int previousViolation){
        int fine=700;
        if(previousViolation>0) fine=fine+300;
        return fine;
    }
}