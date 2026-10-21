class Solution {
    public int arraySign(int[] nums) {
        boolean hasZero = false;
        int numNegative = 0;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }

            if (num < 0) {
                numNegative++;
            }
        }

        if (numNegative % 2 == 0) {
            return 1;
        }

        return -1;
    }
}