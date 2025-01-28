package doublylinkedlist.moviemanagementsystem;

public class MovieManagementSystem {
    public static void main(String[] args) {
        MoviesList movieSystem = new MoviesList();

        // Adding movies
        movieSystem.addAtBeginning("3 Idiots", "RajKumar Hirani", 2009, 8.4);
        movieSystem.addAtEnd("Taare Zameen Par", "Amir Khan", 2007, 8.3);
        movieSystem.addAtEnd("KGF", "Prashanth Neel", 2018, 8.2);

        // Display all movies (forward and reverse)
        movieSystem.displayMoviesForward();
        movieSystem.displayMoviesReverse();

        // Search movies by director or rating
        movieSystem.searchMovies("Taare Zameen Par", 8.3);

        // Update movie rating
        movieSystem.updateRating("KGF", 9.0);

        // Display movies again after updating
        movieSystem.displayMoviesForward();

        // Remove a movie
        movieSystem.removeMovie("KGF");

        // Display movies after removal
        movieSystem.displayMoviesForward();
    }
}
