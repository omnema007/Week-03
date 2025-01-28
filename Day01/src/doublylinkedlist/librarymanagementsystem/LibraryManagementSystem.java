package doublylinkedlist.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBookAtBeginning("To Kill a Mockingbird", "Harper Lee", "Fiction", 101, true);
        library.addBookAtEnd("1984", "George Orwell", "Dystopian", 102, true);
        library.addBookAtEnd("Moby Dick", "Herman Melville", "Adventure", 103, false);

        // Add book at a specific position
        library.addBookAtPosition("Pride and Prejudice", "Jane Austen", "Romance", 104, true, 2);

        // Display books
        library.displayBooksForward();
        library.displayBooksReverse();

        // Search for a book
        library.searchBook("George Orwell");
        library.searchBook("The Great Gatsby");

        // Update book availability
        library.updateAvailability(103, true);

        // Display books after update
        library.displayBooksForward();

        // Remove a book
        library.removeBook(102);

        // Display books after removal
        library.displayBooksForward();

        // Count total books
        library.countBooks();
    }
}
