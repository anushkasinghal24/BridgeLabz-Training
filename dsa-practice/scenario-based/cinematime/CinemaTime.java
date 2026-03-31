/*CinemaTime – Movie Schedule Manager"
Story: A cinema manager wants a tool to store and update a list of movie showtimes and titles.
Users should be able to add, view, and search movies. */
package cinematime;
import java.util.*;
public class CinemaTime {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        CinemaTimeManager manager = new CinemaTimeManager();

        while (true) {
            System.out.println("\n--- Cinema Time Menu ---");
            System.out.println("1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Display All Movies");
            System.out.println("4. Print Movie by Index");
            System.out.println("5. Generate Report");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    try {
                        System.out.println("Enter movie title:");
                        String title = sc.nextLine();

                        System.out.println("Enter show time  (HH:mm):");
                        String time = sc.nextLine() ;

                        manager.addMovie(title, time) ;
                    } catch (InvalidTimeFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Enter keyword to search:");
                    String keyword =  sc.nextLine();
                    manager.searchMovie(keyword);
                    break;

                case 3:
                    manager.displayAllMovies();
                    break;

                case 4:
                    System.out.println("Enter index :");
                    int index = sc.nextInt();
                    manager.printMovieByIndex(index);
                    break;

                case 5:
                    String[] report = manager.generateReportArray();
                    System.out.println("Printable Report :");
                    System.out.println(Arrays.toString(report));
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice !");
            }
        }
    }
}
