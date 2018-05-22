package en.sorter;

import common.sorting.SortingAlgorithm;
import en.entitties.Employee;

import java.util.List;

public class BubbleSortEmployee implements SortingAlgorithm<Employee> {

    @Override public List<Employee> sort(List<Employee> unorderedList) {
        for(int i = 0; i < unorderedList.size(); i++) {
            for(int j = 0; j < unorderedList.size() - 1; j++) {
                if(unorderedList.get(j).getRegistration().hashCode() >
                    unorderedList.get(i).getRegistration().hashCode()) {
                    Employee aux = unorderedList.get(i);
                    unorderedList.set(i, unorderedList.get(j));
                    unorderedList.set(j, aux);
                }
            }
        }

        return unorderedList;
    }
}
