package pt.entidades;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class MatriculaTest {

    @Test
    public void signumTest() throws Exception {
        Matricula matriculaX = Matricula
            .novaMatricula(LocalDate.of(2018, Month.JANUARY, 1), 1);
        Matricula matriculaY = Matricula
            .novaMatricula(LocalDate.of(2018, Month.FEBRUARY, 1), 1);

        assertTrue(matriculaX.compareTo(matriculaY) == (matriculaY.compareTo(matriculaX)) * -1);
    }

    @Test
    public void testarTransitividade() throws Exception {
        Matricula matriculaX = Matricula
            .novaMatricula(LocalDate.of(2018, Month.MARCH, 1), 1);
        Matricula matriculaY = Matricula
            .novaMatricula(LocalDate.of(2018, Month.FEBRUARY, 1), 1);
        Matricula matriculaZ = Matricula
            .novaMatricula(LocalDate.of(2018, Month.JANUARY, 1), 1);

        assertTrue(matriculaX.compareTo(matriculaY) > 0);
        assertTrue(matriculaY.compareTo(matriculaZ) > 0);
        assertTrue(matriculaX.compareTo(matriculaZ) > 0);
    }

    @Test
    public void testarEquals() throws Exception {
        Matricula matriculaX = Matricula
            .novaMatricula(LocalDate.of(2018, Month.MARCH, 1), 1);
        Matricula matriculaY = Matricula
            .novaMatricula(LocalDate.of(2018, Month.MARCH, 1), 1);

        assertTrue(matriculaX.compareTo(matriculaY) == 0);
        assertEquals(matriculaX, matriculaY);
        assertTrue(matriculaX.compareTo(matriculaY) == 0 && matriculaX.equals(matriculaY));
    }

}

