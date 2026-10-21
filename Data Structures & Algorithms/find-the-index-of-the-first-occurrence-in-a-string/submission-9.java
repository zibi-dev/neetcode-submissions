class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            System.out.println(i + " " + needle.length());
            if (i + needle.length() > haystack.length()) {
                break;
            }
            String subStr = haystack.substring(i, i + needle.length());

            System.out.println(subStr);

            if (subStr.equals(needle)) {
                return i;
            } 
        }

        return -1;
    }
}