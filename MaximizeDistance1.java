public class MaximizeDistance1 {
    public static void main(String[] args) {
        int[] seats = {0,1,0,0,0,0,0,0,1,1,0,1,1};
        int max = maxDistToClosest(seats);
        System.out.println(max);

    }

    public static int maxDistToClosest(int[] seats) {

        int iniOne = -1;
        int finalOne = -1;
        boolean flag = false;
        int midZero = 0;
        int max = 0;
        int j = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]== 1&&flag== false){
                iniOne = i;
                flag = true;
            }
            if (seats[i] == 1) {
                finalOne = i;
                j = i;
            } else {
                midZero = i - j;
            }
            if (midZero > max) {
                max = midZero;
            }
            System.out.println("max = " + max);
        }
        int max2 = Math.max(iniOne, seats.length-1-finalOne);
        return Math.max(max2, (max+1)/2 );

    }

}
