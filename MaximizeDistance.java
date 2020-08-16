public class MaximizeDistance {

    public static void main(String[] args){
        int[] seats = {1,1,1,0,1,1,1};
        int max = maxDistToClosest(seats);
        System.out.println(max);
    }

    public static int maxDistToClosest(int[] seats) {

        int length = seats.length;
        int maxZero = 1;
        int zeros = 0;
        int iniZero = 0;
        int finalZero = 0;
        int j=0;
        int k= length-1;

        if (seats[0]!= 0 && seats[length-1]!= 0){
        for (int i = 0; i < length; i++){
            if (seats[i]==1){
                j = i;
            }
            else{
                zeros = i-j;
            }
            if(zeros>maxZero){
                maxZero = zeros;
            }
        }}
        else {
            if (seats[0] == 0) {
                for (int i = 1; i < length; i++) {
                    if (seats[i] == 1) {
                        j = i;
                        break;
                    } else {
                        iniZero = i - 0+1;
                    }
                }//System.out.println("iniZero = "+iniZero);
            }
            if (seats[length - 1] == 0) {
                for (int i = length - 2; i > 0; i--) {
                    if (seats[i] == 1) {
                        k = i;
                        break;
                    } else {
                        finalZero = (length - 1) - (i)+1;
                    }
                }// System.out.println("finalZero =  "+finalZero);
            }
            for (int i = j; i <= k; i++) {
                if (seats[i] == 1) {
                    j = i;
                } else {
                    zeros = i - j;
                }
                if (zeros > maxZero) {
                    maxZero = zeros;
                }

            }
        }
        int max2 = Math.max(iniZero,finalZero);
        if (max2>maxZero/2){
            return max2;
        }
      if (maxZero%2==1){
            return (maxZero/2)+1;
        }
        else return maxZero/2;
        }
}
