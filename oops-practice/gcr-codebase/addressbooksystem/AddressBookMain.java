package addressbooksystem;
import java.util.Scanner;

public class AddressBookMain{

    public static void main(String[] args){

        System.out.println(" Welcome to Address Book Program ") ;

        //AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        //boolean running = true;

        while (true) {

            System.out.println("\n1.Add AddressBook\n2.Add Contact\n3.Edit Contact\n4.Delete Contact") ;
            System.out.println("5.Display Contacts\n6.Search City/State\n7.Count City/State\n8.Exit") ;

            //System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice){
                case 1:
                    System.out.print("AddressBook Name: ") ;
                    AddressBookSearchAndCount.getAddressBook(sc.nextLine());
                    break;
            

                case 2:
                    System.out.print("AddressBook Name: ") ;
                    AddressBook book =
                            AddressBookSearchAndCount.getAddressBook(sc.nextLine());

                    System.out.print("First Name : ");
                    String fn = sc.nextLine();
                    System.out.print("Last Name : ");
                    String ln = sc.nextLine();
                    System.out.print("Address: ");
                    String addr = sc.nextLine();
                    System.out.print("City : ");
                    String city = sc.nextLine();
                    System.out.print("State : ");
                    String state = sc.nextLine();
                    System.out.print("Zip : ");
                    String zip = sc.nextLine();
                    System.out.print("Phone : ");
                    String phone = sc.nextLine();
                    System.out.print("Email : ");
                    String email = sc.nextLine();

                    book.addContact(new AddressBookContact(
                            fn, ln, addr, city, state, zip, phone, email));
                    break;

                case 3:
                    System.out.print("AddressBook Name : ");
                    AddressBook editBook =
                            AddressBookSearchAndCount.getAddressBook(sc.nextLine());

                    System.out.print("Enter First Name to Edit : ");
                    String nameToEdit = sc.nextLine();

                    editBook.editContact(nameToEdit, sc);
                    break;

                case 4:
                    System.out.print("AddressBook Name : ");
                    AddressBookSearchAndCount.getAddressBook(sc.nextLine())
                            .deleteContact(sc.nextLine());
                    break;

                case 5:
                    System.out.print("AddressBook Name : ");
                    AddressBookSearchAndCount.getAddressBook(sc.nextLine())
                            .displayContacts();
                    break;

                case 6:
                    System.out.print("Enter City or State : ");
                    AddressBookSearchAndCount.searchByCityOrState(sc.nextLine());
                    break;

                case 7:
                    AddressBookSearchAndCount.countByCityAndState();
                    break;

                case 8:
                    System.exit(0);
            }
        }
        
    }
}
