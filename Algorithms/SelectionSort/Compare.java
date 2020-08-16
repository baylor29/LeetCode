package Algorithms.SelectionSort;

public class Compare implements Comparable<Integer>{
    public int a;
    public int compareTo(Integer i){
        if (a < i){
            return -1;
        }else if (a > i){
            return 1;
        }else return 0;


    };





}
