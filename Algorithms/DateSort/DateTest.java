package Algorithms.DateSort;

public class DateTest {


    public static void main(String[] args) {
        Date d1 = new Date(12,23,1999);

        Date d2 = new Date(1,2,1990);
        Date d3 = new Date(1,2,1994);
        Date[] arr = {d1, d2, d3};
        Insertion.sort(arr);
        System.out.println(arr[0].year);
        System.out.println(arr[1].year);
        System.out.println(arr[2].year);
    }
}
