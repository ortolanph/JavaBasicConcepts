package common.sorting.impl;

import common.sorting.SortingAlgorithm;

import java.util.List;

public class BubbleSort implements SortingAlgorithm<String> {

    @Override public List<String> sort(List<String> unorderedList) {
        for(int i = 0; i < unorderedList.size(); i++) {
            for(int j = 0; j < unorderedList.size() - 1; j++) {
                if(unorderedList.get(j).hashCode() > unorderedList.get(i).hashCode()) {
                    String aux = unorderedList.get(i);
                    unorderedList.set(i, unorderedList.get(j));
                    unorderedList.set(j, aux);
                }
            }
        }

        return unorderedList;
    }

}
