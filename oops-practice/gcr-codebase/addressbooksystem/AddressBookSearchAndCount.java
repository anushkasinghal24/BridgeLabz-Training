package addressbooksystem;
import java.util.*;
public class AddressBookSearchAndCount {

    private static Map<String, AddressBook> addressBooks = new HashMap<>();

    // UC-6: Multiple Address Books
    public static AddressBook getAddressBook(String name){
        return addressBooks.computeIfAbsent(name , k -> new AddressBook());
    }

    // UC-8 & UC-9: Search by City or State
    public static void searchByCityOrState(String value){
        addressBooks.forEach((bookName, book) -> {
            book.getContacts().stream()
                    .filter(p -> p.getCity().equalsIgnoreCase(value)
                            || p.getState().equalsIgnoreCase(value))
                    .forEach(p ->
                            System.out.println(bookName + " -> " + p));
        });
    }

    // UC-10: Count by City and State
    public static void countByCityAndState(){
        Map<String, Integer> cityCount = new HashMap<>();
        Map<String, Integer> stateCount = new HashMap<>();

        addressBooks.values().forEach( book ->
            book.getContacts().forEach(p -> {
                cityCount.put(p.getCity(),
                        cityCount.getOrDefault( p.getCity(), 0) + 1);
                stateCount.put(p.getState(),
                        stateCount.getOrDefault(p.getState(), 0) + 1 );
            })
        );

        System.out.println("Count By City: " + cityCount );
        System.out.println("Count By State: " + stateCount );
    }
}
