import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaxiShould {

    private Taxi taxi;

    @BeforeEach
    void setup() {
        taxi = new Taxi();
    }

    @Test
    void not_have_passenger_when_created() {
        // Assert
        assertFalse(taxi.passengerOnBoard());
    }

    @Test
    void have_passenger() {
        //act
        taxi.loadPassenger();
        //assert
        assertTrue(taxi.passengerOnBoard());
    }

    @Test
    void unload_passenger() {

        taxi.loadPassenger();

        //act
        taxi.unloadPassenger();

        //assert
        assertFalse(taxi.passengerOnBoard());
    }

    @Test
    void start_at_origin() {
        //assert
        assertEquals("0,0", taxi.position());
    }

    @Test
    void move_to_right() {
        //act
        taxi.move("R");
        //assert
        assertEquals("1,0", taxi.position());

    }

    @Test
    void showGridMeter() {
        //act

        //assert
        assertNotNull(taxi.initialPosition()-taxi.finalPosition());
    }

}
