import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BookingSystem
 {
    private List<Flight> flights; // List of all flights
    private FareCalculator fareCalculator;
    // Constructor initializes the flight list and fare calculator
    public BookingSystem() 
    {
        flights = new ArrayList<>();
        fareCalculator = new FareCalculator();
        generateSampleFlights(); // Generate some sample flights for demonstration
    }
    // Generates sample flight data
    private void generateSampleFlights()
    {
        flights.add(new Flight("FL123", "Sydney", "Melbourne", "08:00", "09:30", 200.00, 10));
        flights.add(new Flight("FL124", "Sydney", "Brisbane", "10:00", "11:45", 180.00, 8));
        flights.add(new Flight("FL125", "Melbourne", "Sydney", "12:00", "13:30", 220.00, 5));
        // Add more flights as needed
    }
    // Main menu to interact with the booking system
    public void start() 
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Welcome to the Flight Booking System");
            System.out.println("1. Search Flights");
            System.out.println("2. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) 
            {
                case 1:
                    searchFlights(scanner);
                    break;
                case 2:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
    // Search for flights based on user input
    private void searchFlights(Scanner scanner) 
    {
        System.out.print("Enter departure city: ");
        String departureCity = scanner.nextLine();
        System.out.print("Enter destination city: ");
        String destinationCity = scanner.nextLine();
        System.out.print("Enter advance booking days: ");
        int advanceDays = scanner.nextInt();
        // Display flights that match the search criteria
        for (Flight flight : flights) 
        {
            if (flight.getDepartureCity().equalsIgnoreCase(departureCity) &&
                flight.getDestinationCity().equalsIgnoreCase(destinationCity)) 
                {
                    double fare = fareCalculator.calculateFare(flight.getBaseFare(), advanceDays);
                    System.out.println(flight + String.format(", Applicable Fare: $%.2f", fare));
            }
        }
    }
    // Main method to run the booking system
    public static void main(String[] args) 
    {
        BookingSystem system = new BookingSystem();
        system.start();
    }
}
