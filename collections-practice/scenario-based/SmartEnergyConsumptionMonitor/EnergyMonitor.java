package SmartEnergyConsumptionMonitor;
import java.util.*;
public class EnergyMonitor {
    private Map<Date, List<Double>> energyData;
    public EnergyMonitor() {
        energyData = new HashMap<>();
    }
    public void addReading(Date date, double units)
            throws InvalidEnergyReadingException {
        if (units < 0) {
            throw new InvalidEnergyReadingException(
                    "Energy reading cannot be negative!");
        }

        energyData.putIfAbsent(date, new ArrayList<>());
        energyData.get(date).add(units);

        System.out.println("Reading added successfully.");
    }
    // Daily Average
    public double calculateDailyAverage(Date date) {

        List<Double> readings = energyData.get(date);

        if (readings == null || readings.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (double unit : readings) {
            sum += unit;
        }
        return sum / readings.size();
    }

    // Monthly Average
    public double calculateMonthlyAverage(int month) {

        double total = 0;
        int count = 0;

        Calendar cal = Calendar.getInstance();

        for (Date date : energyData.keySet()) {

            cal.setTime(date);
            int dataMonth = cal.get(Calendar.MONTH);

            if (dataMonth == month) {
                for (double unit : energyData.get(date)) {
                    total += unit;
                    count++;
                }
            }
        }

        if (count == 0)
            return 0;

        return total / count;
    }

    public void generateReport() {
        System.out.println("\n--- Energy Report ---");
        for (Date date : energyData.keySet()) {
            System.out.println(date + " -> " +
                    calculateDailyAverage(date) + " units (Avg)");
        }
    }
}
