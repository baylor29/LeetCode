public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }

    public static void rotate(int[] nums, int k) {
        int tmp;

        for (int i = 1; i <= k; i++){
            tmp = nums[nums.length-1];
            for (int j = nums.length-2;j >= 0; j -- ){
                nums[j+1] = nums[j];

            }
            nums[0] = tmp;
        }



    }




}
