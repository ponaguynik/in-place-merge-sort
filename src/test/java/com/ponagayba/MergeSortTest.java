package com.ponagayba;

import org.junit.Test;


import static org.junit.Assert.*;

public class MergeSortTest {

    private int[] array = {5, 10, 4, 8, 9, 3, 7, 2, 6, 1};

    @Test
    public void shouldSortArray() {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MergeSort.sort(array);
        assertArrayEquals(sortedArray, array);
    }

}