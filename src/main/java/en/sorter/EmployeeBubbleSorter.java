package en.sorter;

import common.sorting.SortingAlgorithm;
import en.entitties.Employee;

import java.util.Collections;
import java.util.List;

import static en.sorter.EmployeeListHelper.createEmployeeList;

public class EmployeeBubbleSorter {

    public static void main(String[] args) {
        EmployeeBubbleSorter sorter = new EmployeeBubbleSorter();

        List<Employee> employees = sorter.ordenar();

        System.out.println("ASC");

        for(Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("DESC");

        Collections.reverse(employees);

        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public List<Employee> ordenar() {
        SortingAlgorithm<Employee> bubbleSorter = new BubbleSortEmployee();
        return bubbleSorter.sort(createEmployeeList());
    }

}
