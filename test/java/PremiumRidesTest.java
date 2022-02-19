import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PremiumRidesTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnNormalTotalFare() {
        PremiumRides fare = new PremiumRides();
        double distance = 2.0;
        int time = 5;
        double normalFare = fare.normalCalculateFare(distance, time);
        double premiumFare = fare.premiumCalculateFare(distance, time);
        assertEquals(25, normalFare, 0.0);
        assertEquals(50, premiumFare, 0.0);

    }

}
