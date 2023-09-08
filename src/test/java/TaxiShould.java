import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class TaxiShould {

    private Taxi taxi;

    @BeforeEach
    void setup() {
        taxi = new Taxi();
    }

    @Test
    void not_have_passenger_when_created() {
        // Arrange


        // Assert
        assertFalse(taxi.passengerOnBoard());
    }

    @Test
    void have_passenger() {
        //arrange

        //act
        taxi.loadPassenger();
        //assert
        assertTrue(taxi.passengerOnBoard());
    }

    @Test
    void unload_passenger() {
        //arrange

        taxi.loadPassenger();

        //act
        taxi.unloadPassenger();

        //assert
        assertFalse(taxi.passengerOnBoard());
    }

    @Test
    void has_current_position() {
        //arrange

        //act


        //assert
        assertEquals("0,0", taxi.position());
    }

}
