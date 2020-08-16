import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {


    }
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < nums.length; i ++){
            if (map.containsKey(nums[i])){
                flag = true;
            }else {
                map.put(nums[i],i);
            }
        }
        return flag;
    }


}
