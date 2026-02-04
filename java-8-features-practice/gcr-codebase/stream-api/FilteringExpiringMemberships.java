
/*Filtering Expiring Memberships
Given a list of gym members with their membership expiry dates, use Stream API to filter
out members whose membership expires within the next 30 days. */

import java.time.LocalDate;
import java.util.*;

class GymMember {
    String name;
    LocalDate expiryDate;

    GymMember(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return name + " | Expiry Date: " + expiryDate;
    }
}

public class FilteringExpiringMemberships {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<GymMember> members = new ArrayList<>();

        System.out.print("Enter number of gym members: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of member " + (i + 1));

            System.out.print("Member Name: ");
            String name = sc.nextLine();

            System.out.print("Expiry Date (yyyy-MM-dd): ");
            String date = sc.nextLine();

            members.add(new GymMember(name, LocalDate.parse(date)));
        }

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        System.out.println("\nMembers Expiring Within Next 30 Days");

        members.stream()
                .filter(m ->
                        !m.getExpiryDate().isBefore(today) &&
                        !m.getExpiryDate().isAfter(next30Days)
                )
                .forEach(System.out::println);
    }
}

