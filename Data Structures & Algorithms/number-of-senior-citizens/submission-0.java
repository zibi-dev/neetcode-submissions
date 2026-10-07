class Solution {
    public int countSeniors(String[] details) {
        int result = 0;

        for (String detail : details) {
            int age = Integer.valueOf(detail.substring(11, 13));

            if (age > 60) {
                result++;
            }
        }

        return result;
    }
}