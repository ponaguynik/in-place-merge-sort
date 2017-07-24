package com.ponagayba;

public class MergeSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int start, int end) {
        int mid, left, right;
        int tmp;

        if (start >= end)
            return;

        mid = (start + end) / 2;

        sort(array, start, mid);
        sort(array, mid + 1, end);

        left = start;
        right = mid + 1;
        if (array[mid] <= array[right])
            return;

        while (left <= mid && right <= end) {
            if (array[left] <= array[right])
                left++;
            else {
                tmp = array[right];
                System.arraycopy(array, left, array, left + 1, right - left);
                array[left] = tmp;
                left++;
                mid++;
                right++;
            }
        }
    }
}
