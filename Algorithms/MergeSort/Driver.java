package Algorithms.MergeSort;

import Algorithms.SelectionSort.SelectionSort;

import java.util.*;

public class Driver {
    public static void main(String args[]) {
        System.out.println("hello");
        Integer[] arr = new Integer[100];
        for (int i = 0; i < 100; i++) arr[i] = i;
        List<Integer> intList = Arrays.asList(arr);
        Collections.shuffle(intList);
        intList.toArray(arr);
        new MergeSort().sort(arr);
        // SelectionSort.SelectionSort(arr);
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
