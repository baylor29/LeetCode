package Algorithms.QuickSort;
import Algorithms.PriorityQueue.UnorderedMaxPQ;
import edu.princeton.cs.algs4.StdRandom;

import Algorithms.DateSort.Insertion;

public class QuickSort {

    public static void exch(Comparable[] a, int i, int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }



    public static int partition(Comparable[] a, int lo, int hi){
        int i = lo;
        int j = hi + 1;
        while(true){
            while (a[++i].compareTo(a[lo]) < 0)
                if (i == hi) break;
                while(a[lo].compareTo(a[--j]) < 0)
                    if (j == lo) break;
            if (i >= j) break;
            exch(a,i,j);

        }
        exch(a,lo,j);
        return j;
    }

    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    private static void sort(Comparable[] a, int lo, int hi){
        if (hi <= lo) return;
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    public static void main(String[] args) {
        String[]  a  = {"Q","U","I","C","K","S","O","R","T","E","X","A","M","P","L","E"};
        sort(a);
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }



}
