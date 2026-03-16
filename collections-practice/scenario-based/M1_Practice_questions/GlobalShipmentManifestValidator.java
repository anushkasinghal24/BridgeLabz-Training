import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GlobalShipmentManifestValidator {

    static Set<String> validModes = new HashSet<>(Arrays.asList(
            "AIR", "SEA", "ROAD", "RAIL", "EXPRESS", "FREIGHT"));

    static Set<String> validStatus = new HashSet<>(Arrays.asList(
            "DELIVERED", "CANCELLED", "IN_TRANSIT"));

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String record = sc.nextLine() ;

            if (isValidRecord(record)) {
                System.out.println("COMPLIANT RECORD ") ;
            } else {
                System.out.println("NON-COMPLIANT RECORD ");
            }
        }
    }
    static boolean isValidRecord(String record) {

        String[] parts = record.split("\\|");
        if (parts.length != 5) return false;

        String code  = parts[0];
        String date = parts[1];
        String mode  = parts[2];
        String weight = parts[3];
        String status = parts[4];

        return validCode(code) &&
               validDate(date) &&
               validModes.contains(mode)  &&
               validWeight(weight) &&
               validStatus.contains(status);
    }

    static boolean validCode(String code) {

        if (!code.matches("SHIP-\\d{6}") ) return false;

        String digits = code.substring(5);

        if (digits.charAt(0) == '0') return false;

        int count = 1;
        for (int i = 1; i < digits.length();  i++) {
            if (digits.charAt(i) == digits.charAt(i - 1)) {
                count++;
                if (count > 3) return false;
            } else {
                count = 1;
            }
        }
        return true;
    }

    static boolean validDate(String date) {

        if (!date.matches("20\\d{2}-\\d{2}-\\d{2}")) return false;

        try {
            LocalDate.parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    static boolean validWeight(String weight) {

        if (!weight.matches("(0|[1-9]\\d*)(\\.\\d{1,2})?")) return false;

        try {
            double w = Double.parseDouble(weight);
            return w >= 0 && w <= 999999.99;
        } catch (Exception e) {
            return false;
        }
    }
}