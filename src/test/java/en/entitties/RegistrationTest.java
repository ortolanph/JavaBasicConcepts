package en.entitties;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegistrationTest {

    @Test
    public void signumTest() throws Exception {
        Registration registrationX = Registration
            .newRegistration(LocalDate.of(2018, Month.JANUARY, 1), 1);
        Registration registrationY = Registration
            .newRegistration(LocalDate.of(2018, Month.FEBRUARY, 1), 1);

        assertTrue(registrationX.compareTo(registrationY) == (registrationY.compareTo(registrationX)) * -1);
    }

    @Test
    public void testarTransitividade() throws Exception {
        Registration registrationX = Registration
            .newRegistration(LocalDate.of(2018, Month.MARCH, 1), 1);
        Registration registrationY = Registration
            .newRegistration(LocalDate.of(2018, Month.FEBRUARY, 1), 1);
        Registration registrationZ = Registration
            .newRegistration(LocalDate.of(2018, Month.JANUARY, 1), 1);

        assertTrue(registrationX.compareTo(registrationY) > 0);
        assertTrue(registrationY.compareTo(registrationZ) > 0);
        assertTrue(registrationX.compareTo(registrationZ) > 0);
    }

    @Test
    public void testarEquals() throws Exception {
        Registration registrationX = Registration
            .newRegistration(LocalDate.of(2018, Month.MARCH, 1), 1);
        Registration registrationY = Registration
            .newRegistration(LocalDate.of(2018, Month.MARCH, 1), 1);

        assertTrue(registrationX.compareTo(registrationY) == 0);
        assertEquals(registrationX, registrationY);
        assertTrue(registrationX.compareTo(registrationY) == 0 && registrationX.equals(registrationY));
    }
}
