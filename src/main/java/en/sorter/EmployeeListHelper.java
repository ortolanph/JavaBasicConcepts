package en.sorter;

import en.entitties.Employee;
import en.entitties.Person;
import en.entitties.Registration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class EmployeeListHelper {
    public static List<Employee> createEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        employees.add(
            Employee.newEmployee(
                createPerson(
                    1,
                    "John Lennon",
                    LocalDate.of(1940, Month.OCTOBER, 9),
                    "",
                    ""),
                Registration.newRegistration(LocalDate.of(1960, Month.DECEMBER, 1), 1),
                "1111"
            ));

        employees.add(
            Employee.newEmployee(
                createPerson(
                    1,
                    "Ringo Starr",
                    LocalDate.of(1940, Month.JULY, 7),
                    "",
                    ""),
                Registration.newRegistration(LocalDate.of(1960, Month.APRIL, 1), 1),
                "4444"
            ));

        employees.add(
            Employee.newEmployee(
                createPerson(
                    1,
                    "Paul McCartney",
                    LocalDate.of(1942, Month.JUNE, 18),
                    "",
                    ""),
                Registration.newRegistration(LocalDate.of(1960, Month.DECEMBER, 1), 2),
                "2222"
            ));

        employees.add(
            Employee.newEmployee(
                createPerson(
                    1,
                    "George Harrison",
                    LocalDate.of(1943, Month.FEBRUARY, 25),
                    "",
                    ""),
                Registration.newRegistration(LocalDate.of(1960, Month.MARCH, 1), 1),
                "3333"
            ));

        return employees;
    }

    private static Person createPerson(
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
