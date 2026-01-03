//Single Inheritance
/*Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
 */
import java.util.Scanner;

class Books {
    String title;
    int publicationYear;

    //Constructor of book
    Books(String title, int publicationYear){
        this.title  = title;
        this.publicationYear = publicationYear;

    }

    //Methd to display book information 
    void displayInfo(){
        System.out.println("Book Title : " +title);
        System.out.println("Publictaion Year : " +publicationYear);

    }
    
}

class Author extends Books{
    String authorName;
    String authorBio;

    //Consturctor of Author 
    Author(String title, int publicationYear , String authorName , String authorBio){
        super(title , publicationYear);
        this.authorName = authorName ; 
        this.authorBio = authorBio;
    }


    //method to display complete information 
    void displayInfo(){
        super.displayInfo();
        System.out.println("Authir NAme : " + authorName);
        System.out.println("Author Bio " + authorBio);
    }
}

public class BooksAndAuthors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book Title : ");
        String bookTitle = sc.nextLine();
        System.out.println("Enter Publication year: ");
        int year = sc.nextInt(); 
        sc.nextLine();       
        System.out.println("Enter author Name  : ");
        String authorName = sc.nextLine();
        System.out.println("Enter author Bio : ");
        String authorBio = sc.nextLine();
        
        Author bookDetails = new Author(bookTitle , year , authorName , authorBio);
        System.out.println("Book and Authir Details ---");
        bookDetails.displayInfo();
        sc.close();
    }   
}
