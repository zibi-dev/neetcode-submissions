class Solution {
    public boolean divideArray(int[] nums) {
        if (nums.length % 2 != 0) return false;
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                set.remove(i);
            }
        }

        return set.isEmpty();
    }
}