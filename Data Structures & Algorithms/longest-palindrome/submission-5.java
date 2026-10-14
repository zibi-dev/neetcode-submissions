class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;

        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int val = entry.getValue();

            if (val % 2 == 0) {
                result += val;
            } else if (val > 2) {
                result += val - 1;
            }
        }

        System.out.println(map);

        return result == s.length() ? result : result + 1;
    }
}