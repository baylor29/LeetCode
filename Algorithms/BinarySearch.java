package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int tgt = 1;
        int right = arr.length - 1;
        int left = 0;
        int a = BinarySearch(arr,tgt,left, right);
        System.out.println(a);

    }

    public static int BinarySearch(int[] arr, int tgt, int left, int right){
        System.out.println("asdf");

        int a = (right+left)/2;


            if (right - left >= 0) {
                if (arr[a] == tgt) {
                    return a;
                } else if (arr[a] > tgt) {
                    return BinarySearch(arr, tgt, left,
                            a-1);

                } else if (arr[(right+left)/2] < tgt) {
                    return BinarySearch(arr, tgt, a+1, right);
                }
            }
           return -1;
        }


}
