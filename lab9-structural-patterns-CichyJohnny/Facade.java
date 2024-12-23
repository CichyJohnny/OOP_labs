class FlightSearch {
    public void search() {
        System.out.println("Searching for flights from New York to Warsaw");
        System.out.println("Flights found:\n\t- 12:00\n\t- 15:00\n\t- 18:00");
    }
}

class BookingSystem {
    public void book() {
        System.out.println("Booking flight for Jan Kowalski");
    }

}

class PaymentProcessor {
    public void pay() {
        System.out.println("Processing payment of 250.00 USD");
    }
   
}

class FlightFacade {
    private final FlightSearch flightSearch;
    private final BookingSystem bookingSystem;
    private final PaymentProcessor paymentProcessor;

    public FlightFacade() {
        flightSearch = new FlightSearch();
        bookingSystem = new BookingSystem();
        paymentProcessor = new PaymentProcessor();
    }

    public void bookFlight() {
        flightSearch.search();
        bookingSystem.book();
        paymentProcessor.pay();

        System.out.println("Flight booked.");
    }
    
}

public class Facade {
    public static void main(String[] args) {
        FlightFacade facade = new FlightFacade();
        
        facade.bookFlight();
    }
}