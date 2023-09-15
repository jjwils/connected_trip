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
//        assertEquals(1,taxi.getGridMeter());
        assertEquals(1, taxi.xPosition());


    }

    @Test
    void move_right_by_two_cells() {
        //act
        taxi.move("R");
        taxi.move("R");

        //assert
        //assertEquals(1,taxi.getGridMeter());
        assertEquals("2,0", taxi.position());
        assertEquals(2, taxi.xPosition());
    }

    @Test
    void move_to_down() {
        //act
        taxi.move("D");

        //assert
        assertEquals("0,1", taxi.position());
        assertEquals(1, taxi.yPosition());
    }

    @Test
    void move_to_up() {
        //act
        taxi.move("U");

        //assert
        assertEquals("0,-1", taxi.position());
        assertEquals(-1, taxi.yPosition());
    }

}
