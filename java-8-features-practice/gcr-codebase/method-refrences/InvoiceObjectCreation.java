/*Invoice Object Creation
○ Scenario: Generate invoice objects from transaction IDs.
○ Task: Use a constructor reference. */
import java.util.*;
import java.util.stream.Collectors;
class Invoice{

    int transactionId;

    Invoice(int transactionId){
        this.transactionId = transactionId;
    
    }

    void display(){
        System.out.println("Invoice created for transaction id: " + transactionId);
    }
}

public class InvoiceObjectCreation{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        List <Integer> transactionIds=new ArrayList<>();

        System.out.println("Enter number of transactions : ");
        int n = sc.nextInt();

        System.out.println("Enter transaction ids : ");
        for(int i = 0; i<n; i++){
            transactionIds.add(sc.nextInt());
        }

        List<Invoice> invoices=transactionIds.stream().map(Invoice::new).collect(Collectors.toList());
        invoices.forEach(Invoice::display);
    




    }
}