/*IoT Sensor Readings
○ Scenario: Print all readings above threshold.
○ Task: Use streams with forEach(). */
import java.util.*;
public class IOTSensorReadings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> readings = new ArrayList<>();
        System.out.println("Enter number of sensor readings : ");
        int n =sc.nextInt();

        System.out.println("Enter Sensor Readings : ");
        for(int i = 0; i< n ; i++){
            readings.add(sc.nextDouble());

        }
        System.out.println("Enter Threshold Value : ");

        double threshold = sc.nextDouble();
        System.out.println("\nReadings above threshole : ");

        readings.stream()
                .filter(value -> value > threshold)
                .forEach(value ->
                        System.out.println("Sensor Reading: " + value)
                );

    }
    
}
