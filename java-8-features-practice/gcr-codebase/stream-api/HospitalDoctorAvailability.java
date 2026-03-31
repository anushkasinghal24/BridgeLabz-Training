
/*Hospital Doctor Availability
○ Scenario: Find doctors available on weekends and sort by specialty.
○ Task: Use streams with filter() and sorted().*/
import java.util.*;

class Doctor {
    String name;
    String specialty;
    String availability;

    Doctor(String name, String specialty, String availability) {
        this.name = name;
        this.specialty = specialty;
        this.availability = availability;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return name + " | " + specialty + " | " + availability;
    }
}

public class HospitalDoctorAvailability {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Doctor> doctors = new ArrayList<>();

        System.out.print("Enter number of doctors: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of doctor " + (i + 1));

            System.out.print("Doctor Name: ");
            String name = sc.nextLine();

            System.out.print("Specialty: ");
            String specialty = sc.nextLine();

            System.out.print("Availability (Weekday/Weekend): ");
            String availability = sc.nextLine();

            doctors.add(new Doctor(name, specialty, availability));
        }

        System.out.println("\nDoctors Available on Weekends (Sorted by Specialty)");

        doctors.stream()
                .filter(d -> d.getAvailability().equalsIgnoreCase("Weekend")) // filter
                .sorted(Comparator.comparing(Doctor::getSpecialty))            // sort
                .forEach(System.out::println);
    }
}
