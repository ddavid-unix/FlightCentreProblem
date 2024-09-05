public class FareCalculator 
{
    // Calculate fares based on advance booking period
    public double calculateFare(double baseFare, int advanceDays)
    {
        if (advanceDays >= 14) 
        {
            return baseFare * 0.5; // 50% off for 2 weeks advance booking
        } 
        else if (advanceDays >= 7) 
        {
            return baseFare * 0.8; // 20% off for 1 week advance booking
        } 
        else
        {
            return baseFare; // No discount for shorter advance periods
        }
    }
}
