class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(Arrays.stream(nums1).boxed().toArray(Integer[]::new)));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(Arrays.stream(nums2).boxed().toArray(Integer[]::new)));

        List<Integer> result = new ArrayList<>(set1);
        List<Integer> result2 = new ArrayList<>(set2);

        result.removeAll(set2);
        result2.removeAll(set1);

        return Arrays.asList(result, result2);
    }
}