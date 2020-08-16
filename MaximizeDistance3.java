public class MaximizeDistance3 {
    public static void main(String[] args) {
        int[] seats = {0,0,0,1};
        int max = maxDistToClosest(seats);
        System.out.println(max);

    }

    public static int maxDistToClosest(int[] seats) {
        int flag = 0;
        int initial = 0;
        int middle = 0;
        int end = 0;
        int mid;
        for (int i = 0; i < seats.length; i ++){
                if (seats[i] == 1 && flag == 0) {
                    System.out.println("test");
                    initial = i;
                    flag = 1;
                }
                for (int j = i+1; j < seats.length; j++) {
                if (flag == 1 && seats[i] == 1) {
                    if (seats[j] == 1){
                        mid = j - i - 1;
                        System.out.println("mid = " + mid);
                        if (mid > middle){
                            middle = mid;
                        }
                        break;
                    }

                }
            }
        }
        System.out.println("initial = " + initial);
        System.out.println("middle = "+ middle);
        System.out.println("end = " + end);
return Math.max(Math.max(initial,(middle+1)/2),end);



    }
}