import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnhancedInvoiceTest {
    @Test
    public void givenMultipleDistanceAndTime_ShouldReturnTotalFare() {
        EnhancedInvoice enhancedInvoice = new EnhancedInvoice();
        int rides = 2;
        double distance1 = 2.0;
        double distance2 = 3.0;
        int time1 = 5;
        int time2 = 8;
        double fare1 = enhancedInvoice.multiCalculateFare(distance1, time1);
        double fare2 = enhancedInvoice.multiCalculateFare(distance2, time2);
        double fare = fare1 + fare2;
        double avgFare = fare / rides;


        assertEquals(63, fare, 0.0);
        assertEquals(2, rides, 0);
        assertEquals(31.5, avgFare, 0.0);

    }
}
