import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaxiShould {

    @Test
    void not_have_passenger_when_created() {
        // Arrange
        Taxi taxi = new Taxi();

        // Assert
        assertFalse(taxi.passengerOnBoard());
    }

    @Test
    void have_passenger() {
        //arrange
        Taxi taxi = new Taxi();
        //act
        taxi.loadPassenger();
        //assert
        assertTrue(taxi.passengerOnBoard());
    }

    @Test
    void unload_passenger() {
        //arrange
        Taxi taxi = new Taxi();
        taxi.loadPassenger();

        //act
        taxi.unloadPassenger();

        //assert
        assertFalse(taxi.passengerOnBoard());
    }
}
