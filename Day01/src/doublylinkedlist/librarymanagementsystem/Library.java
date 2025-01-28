package doublylinkedlist.librarymanagementsystem;

class Library {
    private Book head;
    private Book tail;

    // Add a new book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);

        if (head == null) { // If the list is empty
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add a new book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);

        if (tail == null) { // If the list is empty
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add a book at a specific position
    public void addBookAtPosition(String title, String author, String genre, int bookID, boolean isAvailable, int position) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);

        if (position <= 1) { // Add at the beginning if position is 1 or less
            addBookAtBeginning(title, author, genre, bookID, isAvailable);
            return;
        }

        Book current = head;
        int currentPosition = 1;

        while (current != null && currentPosition < position - 1) { // Traverse to the position
            current = current.next;
            currentPosition++;
        }

        if (current == null) { // If the position is beyond the end, add at the end
            addBookAtEnd(title, author, genre, bookID, isAvailable);
        } else { // Insert at the specific position
            newBook.next = current.next;
            newBook.prev = current;
            if (current.next != null) {
                current.next.prev = newBook;
            }
            current.next = newBook;

            // Update the tail if newBook is added at the end
            if (newBook.next == null) {
                tail = newBook;
            }
        }
    }

    // Remove a book by Book ID
    public void removeBook(int bookID) {
        Book current = head;

        while (current != null) {
            if (current.bookID == bookID) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Book with ID " + bookID + " has been removed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    // Search for a book by Title or Author
    public void searchBook(String query) {
        Book current = head;
        boolean found = false;

        System.out.println("Search results for \"" + query + "\":");
        while (current != null) {
            if (current.title.equalsIgnoreCase(query) || current.author.equalsIgnoreCase(query)) {
                System.out.println("Book ID: " + current.bookID + ", Title: " + current.title +
                        ", Author: " + current.author + ", Genre: " + current.genre +
                        ", Available: " + current.isAvailable);
                found = true;
            }
            current = current.next;
        }

        if (!found) {
            System.out.println("No books found with the query \"" + query + "\".");
        }
    }

    // Update a book's Availability Status by Book ID
    public void updateAvailability(int bookID, boolean isAvailable) {
        Book current = head;

        while (current != null) {
            if (current.bookID == bookID) {
                current.isAvailable = isAvailable;
                System.out.println("Availability of book with ID " + bookID + " updated to " + isAvailable);
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        Book current = head;

        if (current == null) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("Library Books (Forward Order):");
        while (current != null) {
            System.out.println("Book ID: " + current.bookID + ", Title: " + current.title +
                    ", Author: " + current.author + ", Genre: " + current.genre +
                    ", Available: " + current.isAvailable);
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        Book current = tail;

        if (current == null) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("Library Books (Reverse Order):");
        while (current != null) {
            System.out.println("Book ID: " + current.bookID + ", Title: " + current.title +
                    ", Author: " + current.author + ", Genre: " + current.genre +
                    ", Available: " + current.isAvailable);
            current = current.prev;
        }
    }

    // Count the total number of books in the library
    public void countBooks() {
        Book current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        System.out.println("Total number of books in the library: " + count);
    }
}
