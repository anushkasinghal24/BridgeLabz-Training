/*Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
 */
import java.util.*;
interface Reservable{
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem implements Reservable{

    private int itemId;
    private String title;
    private String author;

    private boolean isReserved = false;

    private String borrowerName;


    public LibraryItem(int itemId ,String title , String author){
        this.itemId = itemId;
        this.title = title;
        this.author = author;

    }


    public abstract int getLoanDuration();

    public void getItemDetails(){
        System.out.println("Item id: "+ itemId);
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Is available: "+(isReserved ? "No":"Yes"));
    }


    @Override
    public void reserveItem(String borrowerName){
        if(!isReserved){
            isReserved = true;
            this.borrowerName=borrowerName;
            System.out.println("Item reserved by " + borrowerName);
        }
        else{
            System.out.println("Item already reserved");
        }
    }

    @Override
    public boolean checkAvailability(){
        return !isReserved;
    }
}

    class Book extends LibraryItem{
        public Book(int itemId, String title, String author) {
            super(itemId, title, author);
           
        }

        @Override
        public int getLoanDuration() {
            return 10;
        }
    }



    class Magazine extends LibraryItem{
        public Magazine(int itemId,String title,String author){
            super(itemId ,title, author);
        }

        @Override
        public int getLoanDuration(){
            return 10;
        }
    }


    class DVD extends LibraryItem{
        public DVD(int itemId,String title,String author){
            super(itemId,title,author);
        }

        @Override
        public int getLoanDuration(){
            return 5;
        }
    }



    public class LibraryManagementSystem{




        public static void processItem(LibraryItem item){

            item.getItemDetails();
            System.out.println("Loan duration : "+ item.getLoanDuration());
            System.out.println();

        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            List<LibraryItem> items=new ArrayList<>();
            System.out.println("Enter number of items : ");
            int n = sc.nextInt();
            sc.nextLine();

            for(int i=0;i<n;i++){
                System.out.println("Enter details for the item : "+(i+1));

                System.out.println("Item id : ");

                int itemId=sc.nextInt();
                sc.nextLine();

                System.out.println("Title : ");

                String title = sc.nextLine();

                System.out.println("Author : ");
                String author = sc.nextLine();

                System.out.println("Enter type(1-book, 2-magazine,3-dvd) : ");
                int type = sc.nextInt();
                sc.nextLine();

                LibraryItem lib;

                if(type == 1){
                    lib = new Book(itemId,title,author);
            }

            else if(type==2){
                lib = new Magazine(itemId,title,author);
            }

            else if(type == 3){
               lib = new DVD(itemId,title,author);
            }
            else{
                System.out.println("Invalid type");
                continue;
            }


            System.out.println("Do you want to reserve this item?(yes/no) : ");
            String choice = sc.nextLine();

            if(choice.equalsIgnoreCase("Yes")){
                System.out.println("Enter borrower name : ");
                String borrowerName=sc.nextLine();
                lib.reserveItem(borrowerName);
            }
             
            
            items.add(lib);

        }
            System.out.println("----Library items summary----");
            for(LibraryItem item: items){
                processItem(item);
                System.out.println();
            
            }

        
            }

        }