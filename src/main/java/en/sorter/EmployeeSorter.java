package en.sorter;

import en.entitties.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static en.sorter.EmployeeListHelper.createEmployeeList;

public class EmployeeSorter {

    public static void main(String[] args) {
        EmployeeSorter sorter = new EmployeeSorter();

        System.out.println("ASC");

        sorter.orderAsc();

        System.out.println("DESC");

        sorter.orderDesc();

        System.out.println("ASC JAVA8");

        sorter.orderAscJava8();

        System.out.println("DESC JAVA8");

        sorter.orderDescJava8();
    }

    private void orderAsc() {
        List<Employee> employees = createEmployeeList();

        Collections.sort(employees, new RegistrationAscendingSorter());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private void orderDesc() {
        List<Employee> employees = createEmployeeList();

        Collections.sort(employees, new RegistrationDescendingSorter());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private void orderAscJava8() {
        createEmployeeList()
            .stream()
            .sorted(Comparator.comparing(Employee::getRegistration))
            .forEach(System.out::println);
    }

    private void orderDescJava8() {
        createEmployeeList()
            .stream()
            .sorted(Comparator.comparing(Employee::getRegistration).reversed())
            .forEach(System.out::println);
    }


}
