 // Interface for ticket booking
interface Ticket {
    void bookTickets();
}

// Class for booking movie tickets
class Movie implements Ticket {
    private int noOfTickets;
    private double pricePerTicket;

    // Constructor for Movie class
    public Movie(int noOfTickets, double pricePerTicket) {
        this.noOfTickets = noOfTickets;
        this.pricePerTicket = pricePerTicket;
    }

    // Method to calculate and display total cost for movie tickets
    @Override
    public void bookTickets() {
        double totalCost = noOfTickets * pricePerTicket;
        System.out.println("Total cost for movie tickets: $" + totalCost);
    }
}

// Class for booking train tickets
class Train implements Ticket {
    private int noOfTickets;
    private String ticketClass;
    private double pricePerTicket;

    // Constructor for Train class
    public Train(int noOfTickets, String ticketClass) {
        this.noOfTickets = noOfTickets;
        this.ticketClass = ticketClass;
        this.pricePerTicket = getPricePerTicket(ticketClass);
    }

    // Method to calculate price per ticket based on ticket class
    private double getPricePerTicket(String ticketClass) {
        // Assume different prices for different ticket classes
        if (ticketClass.equalsIgnoreCase("first")) {
            return 100.0;
        } else if (ticketClass.equalsIgnoreCase("second")) {
            return 80.0;
        } else {
            return 50.0;
        }
    }

    // Method to calculate and display total cost for train tickets
    @Override
    public void bookTickets() {
        double totalCost = noOfTickets * pricePerTicket;
        System.out.println("Total cost for train tickets: $" + totalCost);
    }
}

public class ClassTicket {
    public static void main(String[] args) {
        // Create object of Movie and calculate total cost for movie tickets
        Ticket movieTicket = new Movie(3, 12.5);
        movieTicket.bookTickets();

        // Create object of Train and calculate total cost for train tickets
        Ticket trainTicket = new Train(5, "second");
        trainTicket.bookTickets();
    }
}
