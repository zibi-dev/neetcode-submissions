class Solution {
    public int scoreOfString(String s) {
        char[] chars = s.toCharArray();
        int result = 0;

        for (int i = 1; i < chars.length; i++) {
            result += Math.abs(chars[i] - chars[i -1]);
        }

        return result;
    }
}