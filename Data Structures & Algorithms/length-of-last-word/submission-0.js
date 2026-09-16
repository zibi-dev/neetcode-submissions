class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLastWord(s) {
        const words = s.trim().split(/\s+/);

        return words.at(-1).length;
    }
}
