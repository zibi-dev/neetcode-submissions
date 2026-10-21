class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            if (reversedWord.equals(word)) {
                return word;
            }
        }

        return "";
    }
}
