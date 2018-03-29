package en.sorter;

import en.entitties.Employee;

import java.util.Comparator;

public class RegistrationAscendingSorter implements Comparator<Employee> {

    @Override
    public int compare(
        Employee employee1,
        Employee employee2) {

        return employee1
            .getRegistration()
            .compareTo(employee2.getRegistration());
    }

}
