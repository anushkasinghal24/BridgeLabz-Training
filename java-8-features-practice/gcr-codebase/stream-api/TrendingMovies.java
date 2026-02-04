
/*Top 5 Trending Movies ○ Scenario: From a huge movie list, find the top 5 based on rating and release year.
 ○ Task: Use filter(), sorted(), limit(). */
import java.util.*;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return name + " | Rating: " + rating + " | Year: " + releaseYear;
    }
}

public class TrendingMovies {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Movie> movies = new ArrayList<>();

        System.out.print("Enter number of movies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of movie " + (i + 1));

            System.out.print("Movie Name: ");
            String name = sc.nextLine();

            System.out.print("Rating: ");
            double rating = sc.nextDouble();

            System.out.print("Release Year: ") ;
            int year = sc.nextInt();
            sc.nextLine(); // consume newline

            movies.add(new Movie(name, rating, year));
        }

        System.out.println("\nTop 5 Trending Movies ");

        movies.stream()
                .filter(m -> m.getRating() >= 7.0)   // filter
                .sorted(
                        Comparator.comparing(Movie::getRating).reversed()
                                .thenComparing(Movie::getReleaseYear).reversed()
                )                                     // sort
                .limit(5)                            // limit
                .forEach(System.out::println);       // output
    }
}
