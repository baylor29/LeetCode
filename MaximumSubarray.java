public class MaximumSubarray {

    public static void main(String[] args) {


        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = maxSubArray(nums);
        System.out.print(max);


    }


    public static int maxSubArray(int[] nums) {

        int max = nums[0];

        for (int i = 0; i < nums.length; i ++){

            int a = 0;

            for (int j = 1; j <= nums.length; j++) {

                if (i + j - 1 < nums.length ) {
                    a = a + nums[i + j - 1];

                    if (a > max) {
                        max = a;
                    }

                }
            }

        }
        return max;

    }


}



