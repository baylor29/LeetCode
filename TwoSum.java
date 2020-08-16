import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 10;
        TwoSum ts = new TwoSum();
        int[] pos = ts.twoSum(nums,target);
        System.out.println(pos[0] +" "+pos[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =  new HashMap<>();
        int[] pos = new int[2];
        for (int i  = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i <map.size();i ++){
            if (map.containsKey(target - nums[i])&& map.get(target - nums[i])!= i) {
                pos[0] = i;
                pos[1] = map.get(target - nums[i]);
            }

        }
        return pos;

    }
}
