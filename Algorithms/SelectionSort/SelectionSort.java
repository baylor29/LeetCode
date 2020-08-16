package Algorithms.SelectionSort;



public class SelectionSort {

    public static void main(String[] args) {
        Integer[] a = {3,4,5,1,6,7};

        SelectionSort(a);
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void SelectionSort(Integer[] a){

        for (int i = 0; i < a.length - 1; i++){
            for (int j = i+1; j < a.length; j++){
                if (a[i].compareTo(a[j]) > 0){
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;


                }


            }
        }

    }
}
