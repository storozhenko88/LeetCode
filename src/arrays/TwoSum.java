package arrays;


// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(numbers, target));
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] + nums [i + 1] == target)
                return new int[]{i, i+1};
        }
        return new int[]{};
    }

}
