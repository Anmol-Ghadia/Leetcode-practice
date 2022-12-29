class Solution {
    public int[] twoSum(int[] nums, int target) {
        // itterating over the array to get first int
        for (int i = 0; i < nums.length; i++) {
            // itterating over the array to get second int
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}