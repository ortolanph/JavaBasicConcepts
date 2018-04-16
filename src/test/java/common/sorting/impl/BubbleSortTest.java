package common.sorting.impl;

import common.sorting.SortingAlgorithm;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

    private List<String> unorderedList = new ArrayList<>();

    private List<String> expected;

    private String[] letters = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    @Before
    public void setUp() throws Exception {
        List<String> source = Arrays.asList(letters);

        expected = new ArrayList<>();
        expected.addAll(Arrays.asList(letters));

        Collections.shuffle(source);
        unorderedList.addAll(source);
    }

    @Test
    public void bubbleSortTest() throws Exception {
        SortingAlgorithm sortingAlgorithm = new BubbleSort();
        List<String> actual = sortingAlgorithm.sort(unorderedList);
        assertEquals(expected, actual);
    }

}
