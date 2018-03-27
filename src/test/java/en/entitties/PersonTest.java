package en.entitties;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testReflexivity() throws Exception {
        Person person = createPerson(
            1,
            "Person",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            null);

        assertTrue(person.equals(person));
    }

    @Test
    public void testSymmetry() throws Exception {
        Person person1 = createPerson(
            1,
            "Person",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            null);

        Person person2 = createPerson(
            1,
            "Person",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            "912345678");

        assertTrue(person1.equals(person2));
        assertTrue(person2.equals(person1));
    }

    @Test
    public void testTransitivity() throws Exception {
        Person person1 = createPerson(
            1,
            "Person",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            null);

        Person person2 = createPerson(
            1,
            "Person",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            "912345678");

        Person person3 = createPerson(
            1,
            "Person",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            "987654321");

        assertTrue(person1.equals(person2));
        assertTrue(person2.equals(person3));
        assertTrue(person1.equals(person3));
    }

    @Test
    public void testHashCode() throws Exception {
        Person person1 = createPerson(
            1,
            "Person",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            null);

        Person person2 = createPerson(
            1,
            "Person",
            LocalDate.of(2017, Month.JANUARY, 1),
            "12345678",
            "912345678");

        assertTrue(person1.equals(person2));
        assertTrue(person1.hashCode() == person2.hashCode());
    }

    private Person createPerson(
        int id,
        String name,
        LocalDate birthDay,
        String phone,
        String mobile) {

        Person person = new Person();

        person.setId(id);
        person.setName(name);
        person.setBirthDay(birthDay);
        person.setPhone(phone);
        person.setMobile(mobile);

        return person;
    }

}
