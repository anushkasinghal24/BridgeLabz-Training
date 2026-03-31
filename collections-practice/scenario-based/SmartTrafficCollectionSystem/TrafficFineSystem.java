package SmartTrafficCollectionSystem;
import java.util.*;

public class TrafficFineSystem{

    private Map<String, List<Violation>> violationMap=new HashMap<>();

    public void addViolation(String vehicleId, Violation v) throws InvalidVehicleException{
        if(vehicleId ==null || vehicleId.trim().length()<5){
            throw new InvalidVehicleException("Invalid vehicle Id");
        }

        violationMap.putIfAbsent(vehicleId, new ArrayList<>());
        violationMap.get(vehicleId).add(v);

    }

    public int calculateTotalFine(String vehicleId)throws InvalidVehicleException{
        if(!violationMap.containsKey(vehicleId)){ throw new InvalidVehicleException("Vehicle not found");}
        int totalFine=0;

        List<Violation> violations=violationMap.get(vehicleId);

        for(int i=0;i<violations.size();i++){
            totalFine=totalFine+violations.get(i).calculateFine(i);
        }

        return totalFine;

        

    }

    public void generateReportMonthly(){
        System.out.println("----Monthly Traffic System Report----");

        for(String vehicle: violationMap.keySet()){
            List<Violation> list=violationMap.get(vehicle);
            int total=0;

            for(int i=0;i<list.size();i++){
                total=total+list.get(i).calculateFine(i);
            }

            System.out.println("vehicle: "+vehicle+" | violations: "+list.size()+" | total fine: "+total);
        }
    }
}