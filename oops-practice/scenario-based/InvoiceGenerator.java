/*Invoice Generator for Freelancers
Focus: Strings, Methods
● Scenario: You're building an app for freelancers to generate invoice descriptions.
 Requirements:
● Accept input like: "Logo Design - 3000 INR, Web Page - 4500 INR".
● Split the string to extract task names and amounts.
● Calculate total invoice amount.
● Example Methods:
● ParseInvoice(string input)
● GetTotalAmount(string[] tasks)
 */ 
import java.util.Scanner;

public class InvoiceGenerator{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Ask user to enter invoice details

        System.out.println(" Enter invoice details : ") ;

        System.out.println(" Example: Logo Design - 3000 INR, Web Page - 4500 INR ");

        String invoiceInput = sc.nextLine();

        // Parse invoice into individual tasks
        String[] tasks = parseInvoice(invoiceInput);

        // Calculate total invoice amount
        int totalAmount = getTotalAmount(tasks);

        // Display invoice summary
        
        System.out.println("\n----- Invoice Summary -----");

        for (String task : tasks){

            System.out.println(task.trim());
        }

        System.out.println("\nTotal Invoice Amount: "+ totalAmount +" INR");

        
    }

    // Method to split the invoice string into individual task entries
    public static String[] parseInvoice(String input){
        return input.split(",");
    }

    // Method to calculate total amount from task entries
    public static int getTotalAmount(String[] tasks){

        int total = 0;

        for (String task : tasks){

            // Split task name and price part
            String[] taskDetails = task.split(" - ");

            if (taskDetails.length == 2){

                // Extract price part (remove INR and spaces)
                String priceText = taskDetails[1]
                        .replace("INR", "")
                        .trim();

                int amount = Integer.parseInt(priceText);
                total += amount;
            }
        }return total;

        
    }
}