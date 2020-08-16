public class MaximizeDistance2 {
    public static void main(String[] args) {

    }
    public static int maxDistToClosest(int[] seats) {
        int first = -1, last = -1, max = 0;
        for (int i = 0; i < seats.length; i++){
            if (seats[i]==1) {
                if (first == -1) first = i;
                if (last != -1) max = Math.max(max, i-last);
                last = i;
            }
        }
        return Math.max(max/2, Math.max(first, seats.length - 1 - last));
    }
}
