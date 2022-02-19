import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvoiceTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CarInvoice Invoice = new CarInvoice();
        double distance = 2.0;
        int time = 5;
        double fare = Invoice.calculateFare(distance, time);
        assertEquals(25, fare, 0.0);
    }
}