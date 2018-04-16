package pt.sorter;

import common.sorting.SortingAlgorithm;
import pt.entidades.Empregado;

import java.util.List;

public class BubbleSortEmpregado implements SortingAlgorithm<Empregado> {

    @Override public List<Empregado> sort(List<Empregado> unorderedList) {
        for(int i = 0; i < unorderedList.size(); i++) {
            for(int j = 0; j < unorderedList.size() - 1; j++) {
                if(unorderedList.get(j).getMatricula().hashCode() >
                    unorderedList.get(i).getMatricula().hashCode()) {
                    Empregado aux = unorderedList.get(i);
                    unorderedList.set(i, unorderedList.get(j));
                    unorderedList.set(j, aux);
                }
            }
        }

        return unorderedList;
    }
}
