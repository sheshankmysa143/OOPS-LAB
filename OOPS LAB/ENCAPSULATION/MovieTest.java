package Encapsulation;

class MovieTicket {
    private String movieName;
    private int numberOfTickets;
    private double ticketPrice;

    public void setMovieName(String name) {
        this.movieName = name;
    }

    public void setNumberOfTickets(int count) {
        if (count > 0) {
            this.numberOfTickets = count;
        } else {
            System.out.println("Ticket count must be positive.");
        }
    }

    public void setTicketPrice(double price) {
        if (price > 0) {
            this.ticketPrice = price;
        }
    }

    public double getTotalAmount() {
        return numberOfTickets * ticketPrice;
    }

    public void printBill() {
        System.out.println("Movie: " + movieName);
        System.out.println("Tickets: " + numberOfTickets);
        System.out.println("Total Amount: ₹" + getTotalAmount());
    }
}

public class MovieTest {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.setMovieName("RRR");
        ticket.setNumberOfTickets(3);
        ticket.setTicketPrice(150);

        ticket.printBill();
    }
}
