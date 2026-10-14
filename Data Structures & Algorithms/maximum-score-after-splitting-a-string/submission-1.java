class Solution {
    public int maxScore(String s) {
        int maxScore = 0;

        for (int i = 1; i < s.length(); i++) {
            int leftCount = (int) s.substring(0, i).chars().filter(c -> c == '0').count();
            int rightCount = (int) s.substring(i).chars().filter(c -> c == '1').count();
            maxScore = Math.max(maxScore, leftCount + rightCount);
        }

        return maxScore;
    }

}