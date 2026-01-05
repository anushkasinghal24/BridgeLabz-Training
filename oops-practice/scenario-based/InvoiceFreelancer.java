/*
Invoice Generator for Freelancers
Focus: Strings, Methods, Exception Handling
Scenario:
You're building an app for freelancers to generate invoice descriptions.
 Requirements:
Accept input like: "Logo Design - 3000 INR, Web Page - 4500 INR"
lo
Split the string to extract task names and amounts
Calculate total invoice amount
If the input format is invalid (missing dash or amount), throw
InvalidInvoiceFormatException.

Example Methods:
● parseInvoice(String input)
● getTotalAmount(String[] tasks) */
import java.util.Scanner;

// Custom exception for invalid invoice format
class InvalidInvoiceFormatException extends Exception{

    public InvalidInvoiceFormatException(String message){

        super(message);
    }
}

public class InvoiceFreelancer{

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        try {
            // Ask user to enter invoice description
            System.out.println("Enter invoice details:");
            System.out.println("Example: Logo Design - 3000 INR, Web Page - 4500 INR");

            String invoiceInput = userInput.nextLine();

            // Parse invoice into tasks
            String[] tasks = parseInvoice(invoiceInput);

            // Calculate total amount
            int totalAmount = getTotalAmount(tasks);

            
            System.out.println("\n-------Invoice Details--------");
            for (String task : tasks){
                System.out.println( task.trim() );
            }

            System.out.println("\nTotal Invoice Amount: " + totalAmount + " INR");

        } catch (InvalidInvoiceFormatException exception){
            System.out.println( " Error : " + exception.getMessage());

        } catch (Exception exception){
            System.out.println(" Unexpected error occurred. Please check the input.");

        } finally{
            userInput.close();
        }
    }

    // Method to split invoice string into individual task entries
    public static String[] parseInvoice(String input)
            throws InvalidInvoiceFormatException{

        if (input == null || input.trim().isEmpty()){
            throw new InvalidInvoiceFormatException("Invoice input cannot be empty.");
        }

        return input.split(",");
    }

    // Method to calculate total invoice amount
    public static int getTotalAmount(String[] tasks)
            throws InvalidInvoiceFormatException{

        int totalAmount =0;

        for (String task : tasks){

            // Check for dash separator
            if (!task.contains("-")){
                throw new InvalidInvoiceFormatException(
                        "Invalid task format. Missing '-' in: " + task
                );
            }

            String[] taskParts = task.split("-");

            if (taskParts.length != 2){
                throw new InvalidInvoiceFormatException(
                        " Invalid task format in : " + task
                );
            }

            // Extract amount part and remove INR
            String amountText = taskParts[1]
                    .replace("INR", "")
                    .trim();

            try {
                int amount = Integer.parseInt(amountText);
                totalAmount += amount;

            } catch (NumberFormatException exception){
                throw new InvalidInvoiceFormatException(
                        " Invalid amount value in: " + task
                );
            }
        }

        return totalAmount;
    }
}