package doublylinkedlist.moviemanagementsystem;

class MoviesList {
    private Movie head;
    private Movie tail;

    //method to add a mobie at the beginning
    public void addAtBeginning(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director,yearOfRelease, rating);

        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    //method to add a movie at the end
    public void addAtEnd(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);

        if(tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    //method to remove a movie
    public void removeMovie(String title) {
        Movie temp = head;

        while(temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) {
                    head = head.next;
                    if(head != null) {
                        head.prev = null;
                    }
                } else if (temp == tail) {
                    tail = tail.prev;
                    if(tail != null) {
                        tail.next = null;
                    } else {
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                    }
                    System.out.println("Movie " + title + " removed");
                    return;
                }
                temp = temp.next;
            }

        }
        System.out.println("Movie " + title + " not found");
    }

    //method to search movies
    public void searchMovies(String director, double rating) {
        Movie temp = head;
        System.out.println("Movies by Director " + director + " or with rating >= " + rating + ":");
        boolean found = false;

        while (temp != null) {
            if(temp.director.equalsIgnoreCase(director) || temp.rating >= rating) {
                System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }

        if(!found) {
            System.out.println("No movies found");
        }
    }

    //method to display movie in forward order
    public void displayMoviesForward() {
        Movie temp = head;

        if (temp == null) {
            System.out.println("No movies available");
            return;
        }

        System.out.println("Movies Forward: ");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    //method to display movie in backward order
    public void displayMoviesReverse() {
        Movie temp = tail;

        if (temp == null) {
            System.out.println("No movies available.");
            return;
        }

        System.out.println("Movies (Reverse):");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    // Update the rating of a movie by title
    public void updateRating(String title, double newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating of movie " + title + " updated to " + newRating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie " + title + " not found.");
    }
}
