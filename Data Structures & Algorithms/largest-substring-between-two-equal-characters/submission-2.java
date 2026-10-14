class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer entry = map.get(c);
            if (entry != null) {
                result = Math.max(result, i - entry - 1);
            } else {
                map.put(c, i);
            }
        }

        return result;
    }
}