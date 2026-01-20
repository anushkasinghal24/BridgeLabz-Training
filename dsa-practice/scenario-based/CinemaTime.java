/*CinemaTime – Movie Schedule Manager"
Story: A cinema manager wants a tool to store and update a list of movie showtimes and titles.
Users should be able to add, view, and search movies. */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class InvalidTimeFormatException extends Exception {

    public InvalidTimeFormatException(String message) {
        super(message);
    }
}

class CinemaTimeManager {

    private List<String> movieTitles = new ArrayList<>();
    private List<String> movieTimes = new ArrayList<>();

    // HH:mm, 00–23 and 00–59
    private boolean isValidTime(String time) {
        String regex = "^(?:[01]\\d|2[0-3]):[0-5]\\d$"; //Time format HH:mm
        return time != null && time.matches(regex);
    }

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        movieTitles.add(title);
        movieTimes.add(time);
    }

    // keyword search using contains()
    public void searchMovie(String keyword) {
        boolean found = false;
        for (int i = 0; i < movieTitles.size() ; i++){
            String title = movieTitles.get(i) ;
            if ( title.toLowerCase().contains(keyword.toLowerCase()) ){
                String time = movieTimes.get(i);
                String formatted = String.format("%s - %s", title, time);
                System.out.println("[" + i + "] " + formatted);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found for keyword: " + keyword);
        }
    }

    public void displayAllMovies() {
        if (movieTitles.isEmpty()) {
            System.out.println("No movies scheduled.");
            return;
        }
        System.out.println("All Movies:");
        for (int i = 0; i < movieTitles.size(); i++){
            String formatted = movieTitles.get(i) + " - " + movieTimes.get(i);
            System.out.println("[" + i + "] " + formatted);
        }
    }

    // Example of handling invalid index with IndexOutOfBoundsException
    public void printMovieByIndex(int index){
        try {
            String title = movieTitles.get(index); // can throw IndexOutOfBoundsException
            String time = movieTimes.get(index);
            System.out.println("Movie at index " + index + ": " + title + " - " + time);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + index + ". Please enter a valid movie index.");
        }
    }

    // Convert to array for printable report
    public String[] generateReportArray(){
        String[] report = new String[movieTitles.size()];
        for (int i = 0; i < movieTitles.size(); i++) {
            report[i] = String.format("%s - %s", movieTitles.get(i), movieTimes.get(i));
        }
        return report;
    }
}

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