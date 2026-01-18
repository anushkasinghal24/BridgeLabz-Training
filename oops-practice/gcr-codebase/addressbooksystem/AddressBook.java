package addressbooksystem;
import java.util.ArrayList;
import java.util.Scanner;

// UC-2 add a new Contact to Address Book

public class AddressBook {

    private ArrayList<AddressBookContact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // UC-2 & UC-5: Add Contact
    public void addContact() {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        AddressBookContact person = new AddressBookContact(
                firstName, lastName, address, city, state, zip, phone, email);

        contacts.add(person);
        System.out.println("Contact added successfully!");
    }

    // UC-3: Ability to edit existing contact person using their name

    public void editContact(String name) {
        for (AddressBookContact person : contacts) {
            if (person.getFirstName().equalsIgnoreCase(name)) {

                System.out.print("Enter New Address: ");
                String address = scanner.nextLine();

                System.out.print("Enter New City: ");
                String city = scanner.nextLine();

                System.out.print("Enter New State: ");
                String state = scanner.nextLine();

                System.out.print("Enter New Zip: ");
                String zip = scanner.nextLine();

                System.out.print("Enter New Phone Number: ");
                String phone = scanner.nextLine();

                System.out.print("Enter New Email: ");
                String email = scanner.nextLine();

                person.updateContact(address, city, state, zip, phone, email);
                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    // UC-4: Delete a person using person's name - Use Console to delete a person
    
    
    public void deleteContact(String name) {
        for (AddressBookContact person : contacts) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                contacts.remove(person);
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (AddressBookContact person : contacts) {
            System.out.println(person);
            System.out.println("------------------------");
        }
    }
}
