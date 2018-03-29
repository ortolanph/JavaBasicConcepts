package en.sorter;

import en.entitties.Employee;

import java.util.Comparator;

public class RegistrationDescendingSorter implements Comparator<Employee> {

    @Override
    public int compare(
        Employee employee1,
        Employee employee2) {

        return employee2
            .getRegistration()
            .compareTo(employee1.getRegistration());
    }

}
