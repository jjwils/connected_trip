import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TaxiShould {

    @Test
    void not_have_passenger(){
        // Arrange
        Taxi taxi = new Taxi();

        // Act

        // Assert
        assertFalse(taxi.passengerOnBoard());
    }
}
