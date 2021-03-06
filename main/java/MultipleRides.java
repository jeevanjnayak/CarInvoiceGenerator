public class MultipleRides {

    private static final double COST_PER_KILOMETER = 10;
    private static final int COST_PER_MINUTE = 1;
    private static final int MINIMUM_FARE = 5;


    public double multiCalculateFare(double distance, int time) {
        double totalFare = distance * COST_PER_KILOMETER + time * COST_PER_MINUTE;
        if (totalFare < MINIMUM_FARE)
            totalFare = MINIMUM_FARE;
        return totalFare;
    }
}