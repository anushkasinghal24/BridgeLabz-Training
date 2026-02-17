package SmartEnergyConsumptionMonitor;


import java.util.Date;

public class EnergyReading {

    private Date date;
    private double units;

    public EnergyReading(Date date, double units) {
        this.date = date;
        this.units = units;
    }

    public Date getDate() {
        return date;
    }

    public double getUnits() {
        return units;
    }
}

