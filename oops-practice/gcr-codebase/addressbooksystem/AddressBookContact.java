package addressbooksystem;

/*UC-1: Create a Contacts in Address
Book with first and last names, address,
city, state, zip, phone number and
email...*/
public class AddressBookContact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public AddressBookContact(String firstName, String lastName, String address,
                         String city, String state, String zip,
                         String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void updateContact(String address, String city, String state,
                              String zip, String phoneNumber, String email) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nName: " + firstName + " " + lastName +
               "\nAddress: " + address +
               "\nCity: " + city +
               "\nState: " + state +
               "\nZip: " + zip +
               "\nPhone: " + phoneNumber +
               "\nEmail: " + email;
    }
}
