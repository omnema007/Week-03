package circularlinkedlist.onlineticketreservationsystem;

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        
        system.addTicket(101, "Ravi", "Avatar 2", "A12", "2025-01-28 14:00");
        system.addTicket(102, "Deepak", "Spider-Man", "B3", "2025-01-28 15:00");
        system.addTicket(103, "Amit", "Avatar 2", "C5", "2025-01-28 16:00");

        system.displayTickets();

        system.searchTicket("Ravi");

        system.searchTicket("Avatar 2");

        system.removeTicket(102);

        system.displayTickets();

        system.totalTickets();
    }
}
