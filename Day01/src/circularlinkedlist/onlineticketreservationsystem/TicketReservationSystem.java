package circularlinkedlist.onlineticketreservationsystem;

class TicketReservationSystem {
    private Ticket head;
    private Ticket tail;

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = tail = newTicket;
            newTicket.next = head; // Make it circular
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head; // Maintain circular nature
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = head;
        Ticket previous = tail;

        do {
            if (current.ticketID == ticketID) {
                if (current == head) {
                    head = head.next;
                    tail.next = head; // Update tail to point to new head
                } else {
                    previous.next = current.next;
                }

                if (current == tail) {
                    tail = previous; // Update tail if last ticket is removed
                }

                System.out.println("Ticket " + ticketID + " has been removed.");
                return;
            }

            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket " + ticketID + " not found.");
    }

    // Display all the tickets in the circular list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets in the system.");
            return;
        }

        Ticket current = head;
        System.out.println("Tickets in the system:");
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName +
                    ", Movie: " + current.movieName + ", Seat: " + current.seatNumber +
                    ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchTerm) {
        if (head == null) {
            System.out.println("No tickets in the system.");
            return;
        }

        Ticket current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(searchTerm) || current.movieName.equalsIgnoreCase(searchTerm)) {
                System.out.println("Found Ticket: Ticket ID: " + current.ticketID + ", Customer: " + current.customerName +
                        ", Movie: " + current.movieName + ", Seat: " + current.seatNumber +
                        ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tickets found with the given search term.");
        }
    }

    // Calculate the total number of booked tickets
    public void totalTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        int count = 0;
        Ticket current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        System.out.println("Total booked tickets: " + count);
    }
}
