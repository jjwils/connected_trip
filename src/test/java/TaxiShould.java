import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaxiShould {

    @Test
    void not_have_passenger() {
        // Arrange
        Taxi taxi = new Taxi();

        // Act

        // Assert
        assertFalse(taxi.passengerOnBoard());
    }

    @Test
    void have_passenger() {
        //arrange
        Taxi taxi = new Taxi();

        //act
        taxi.passengerOnBoard(true);
        //assert
        assertTrue(taxi.passengerOnBoard());
    }

    @Test
    void unload_passenger() {
        Taxi taxi = new Taxi();
        taxi.passengerOnBoard(false);
        assertTrue(taxi.passengerOnBoard());
    }
}
