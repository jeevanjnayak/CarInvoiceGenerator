public class PremiumRides {
    private static final double PREMIUM_COST_PER_KILOMETER = 20;
    private static final int PREMIUM_COST_PER_MINUTE = 2;
    private static final int PREMIUM_MINIMUM_FARE = 20;
    private static final double NORMAL_COST_PER_KILOMETER = 10;
    private static final int NORMAL_COST_PER_MINUTE = 1;
    private static final int NORMAL_MINIMUM_FARE = 5;


    public double normalCalculateFare(double distance, int time) {
        double normalTotalFare = distance * NORMAL_COST_PER_KILOMETER + time * NORMAL_COST_PER_MINUTE;
        if (normalTotalFare < NORMAL_MINIMUM_FARE)
            normalTotalFare = NORMAL_MINIMUM_FARE;
        return normalTotalFare;
    }
    public double premiumCalculateFare(double distance, int time) {
        double premiumTotalFare = distance * PREMIUM_COST_PER_KILOMETER + time * PREMIUM_COST_PER_MINUTE;
        if (premiumTotalFare < PREMIUM_MINIMUM_FARE)
            premiumTotalFare = PREMIUM_MINIMUM_FARE;
        return premiumTotalFare;
    }
}
