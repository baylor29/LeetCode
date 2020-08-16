import java.io.*;
import java.util.*;


public class BalancedTunnel {
    public static void main(String[] args) {
        int n = 7;
        int[] in = {5,2,3,6,7,1,4};
        int[] out = {2,3,6,7,1,4,5};

//        int n = 5;
//        int[] in = {3,5,2,1,4};
//        int[] out = {4,3,2,5,1};

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            map.put(out[i],n-1-i);
        }
        int count = 0;
        for (int i = 0; i < n-1; i++){

            if (map.get(in[i]) > map.get(in[i+1])){
                count++;
            }
        }


        System.out.println(count);

    }




}
