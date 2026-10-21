class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // for
            // if even continue
            // else find next even and swap places
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                continue;
            } else {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        return nums;
    }
}