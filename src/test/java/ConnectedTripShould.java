import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConnectedTripShould {

    @Mock
    GridNavigator gridNavigator;

    @Test
    public void one_equal_one () throws Exception{
        assertEquals(1,1);
    }

    @Test
    public void driverA(){
        assertTrue(gridNavigator.passanger());
    }
}
