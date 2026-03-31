//Single Inheritance
/*Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
 */
 
import java.util.Scanner;
class Device{
    String deviceId;
    String status;

    //Constructors of Device 
    Device(String deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;

    }
    void displayStatus(){
        System.out.println("Device Id : " + deviceId);
        System.out.println("Device Status : " +  status);

    }
}

class Thermostat extends Device {
    int tempSetting;
    Thermostat(String deviceId, String status , int tempSetting){
        super(deviceId , status);
        this.tempSetting = tempSetting;

    }
    //Overriding displayStatus 
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperarture Setting :" + tempSetting + "celcius");

    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Device ID : ");
        String deviceID = sc.nextLine();
        System.out.println("Enter Device status (On / Off)) : ");
        String status = sc.nextLine();
        System.out.println("Enter Temperature Seetting (in celcius) : ");
        int temperature = sc.nextInt();

        Thermostat thermostat = new Thermostat(deviceID , status , temperature);

        System.out.println("----Device Status--");
        thermostat.displayStatus();


    }
    
}
