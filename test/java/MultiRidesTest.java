import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiRidesTest {
    @Test
    public void givenMultipleDistanceAndTime_ShouldReturnTotalFare() {
        MultipleRides multiInvoice = new MultipleRides();
        double distance1 = 2.0;
        double distance2 = 3.0;
        int time1 = 5;
        int time2 = 8;
        double fare1 = multiInvoice.multiCalculateFare(distance1, time1);
        double fare2 = multiInvoice.multiCalculateFare(distance2, time2);
        double fare = fare1 + fare2;

        assertEquals(63, fare, 0.0);
    }
}