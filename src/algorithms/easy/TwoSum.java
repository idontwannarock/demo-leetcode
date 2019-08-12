package algorithms.easy;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TwoSum {

    // Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    //
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //
    // Example:
    //
    // Given nums = [2, 7, 11, 15], target = 9,
    // Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].

    public int[] twoSum(int[] nums, int target) {
        for (int firstIndex = 0; firstIndex < nums.length; firstIndex++) {
            for (int secondIndex = firstIndex + 1; secondIndex < nums.length; secondIndex++) {
                if (nums[firstIndex] + nums[secondIndex] == target)
                    return new int[] {firstIndex, secondIndex};
            }
        }
        return null;
    }
}
