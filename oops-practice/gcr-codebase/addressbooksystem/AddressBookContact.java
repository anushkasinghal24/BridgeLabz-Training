package addressbooksystem;
import java.util.*;

/*UC-1: Create a Contacts in Address
Book with first and last names, address,
city, state, zip, phone number and
email...*/
public class AddressBookContact{

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

    public String getFirstName(){
        return firstName;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }

    public void updateContact(String address, String city, String state,
                              String zip, String phoneNumber, String email) {
        this.address = address ;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //UC-7 Override equals to prevent duplicate 

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof AddressBookContact)) return false;
        AddressBookContact that = (AddressBookContact) o;
        return firstName.equalsIgnoreCase (that.firstName)
                && lastName.equalsIgnoreCase (that.lastName);
    }

    @Override
    public int hashCode(){
        return Objects.hash( firstName.toLowerCase(), lastName.toLowerCase());
    }

    public String toString(){
        return "\nName: " + firstName + " " + lastName +
               "\nAddress: " + address +
               "\nCity: " + city +
               "\nState: "  + state +
               "\nZip: "  + zip +
               "\nPhone: " + phoneNumber +
               "\nEmail: "  + email;
    }
}
