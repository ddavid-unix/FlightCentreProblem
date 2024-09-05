import java.util.ArrayList;
import java.util.List;
public class Flight 
{
    private String flightNumber;
    private String departureCity;
    private String destinationCity;
    private String departureTime;
    private String arrivalTime;
    private double baseFare;
    private int availableSeats;
    // Constructor to initialize flight details
    public Flight(String flightNumber, String departureCity, String destinationCity, 
    String departureTime, String arrivalTime, double baseFare, int availableSeats)
    {
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.baseFare = baseFare;
        this.availableSeats = availableSeats;
    }
    // Getter methods
    public String getFlightNumber() 
    { 
        return flightNumber;
    }
    public String getDepartureCity() 
    { 
        return departureCity; 
    }
    public String getDestinationCity()
    {
        return destinationCity;
    }
    public String getDepartureTime()
    { 
        return departureTime; 
    }
    public String getArrivalTime()
    { 
        return arrivalTime; 
    }
    public double getBaseFare()
    { 
        return baseFare; 
    }
    public int getAvailableSeats()
    { 
        return availableSeats;
    }
    // Reduce available seats when a booking is made
    public void bookSeat(int seats)
    {
        if (seats <= availableSeats)
        {
            availableSeats -= seats;
        } 
        else 
        {
            System.out.println("Not enough seats available.");
        }
    }
    // Display flight details as a string
    @Override
    public String toString()
    {
        return String.format("Flight: %s, From: %s To: %s, Departs: %s, Arrives: %s, Base Fare: $%.2f, Seats: %d",
                flightNumber, departureCity, destinationCity, departureTime, arrivalTime, baseFare, availableSeats);
    }
}
