class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[]{0, 1};
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                result[0] = nums[i];
            } else if (nums[i] - nums[i - 1] == 2) {
                result[1] = nums[i] - 1;
            } 
        }

        if (nums[nums.length - 1] != nums.length) {
            result[1] = nums.length;
        }

        return result;
    }
}
