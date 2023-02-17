package arrays;

import java.util.TreeSet;

//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int target = 7;
        System.out.println(searchInsert(numbers, target));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
            else if (target < nums[i])
                return i;
        }
        return nums.length;

    }

}
