import java.util.*;
import java.util.stream.Collectors;

class Movie {
    String title;


    String director;


    String genre;


    int releaseYear;


    double rating;


    double boxOfficeCollection;

    public Movie(String title, String director, String genre, int releaseYear, double rating, double boxOfficeCollection) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.boxOfficeCollection = boxOfficeCollection;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public double getBoxOfficeCollection() {
        return boxOfficeCollection;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                ", boxOfficeCollection=" + boxOfficeCollection +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", "Frank Darabont", "Drama", 2024, 9.2, 300000));
        movies.add(new Movie("The test", "Frank Darabont", "one", 2023, 7.8, 10000));
        movies.add(new Movie("The fine", "New", "one", 2022, 10, 340000.0));
        movies.add(new Movie("Them", "ko", "8", 2012, 10, 340000.0));

        Map<String, List<Movie>> mapped = movies.stream().collect(Collectors.groupingBy(Movie::getDirector));
        System.out.println("By director: " + mapped);

        List<Movie> sortedList = movies.stream().sorted(Comparator.comparing(Movie::getRating, Comparator.reverseOrder())).toList();
        System.out.println("Sorted: " + sortedList);

        Map<String, Double> rated = movies.stream().collect(Collectors.groupingBy(Movie::getGenre, Collectors.averagingDouble(Movie::getRating)));
        System.out.println("Average by genre: " + rated);


//        Filter and list all movies released in the last 3 years.
        List<Movie> sortByYear = movies.stream().filter(e->e.getReleaseYear()>2025-3).toList();
        System.out.println("in last 3yr " + sortByYear);


//                Sort movies by box office collection in descending order.

        List<Movie> sortedByCollection = movies.stream().sorted(Comparator.comparing(Movie::getBoxOfficeCollection, Comparator.reverseOrder())).toList();
        System.out.println("By collection " + sortedByCollection);
    }
}
