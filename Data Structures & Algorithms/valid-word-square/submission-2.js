class Solution {
    /**
     * @param {string[]} words
     * @return {boolean}
     */
    validWordSquare(words) {
        const columnWords = [];

        for (let i = 0; i < words.length; i++) {
            for (let j = 0; j < words[i].length; j++) {
                if (words[j] && words[j][i] !== undefined) {
                  columnWords[i] = (columnWords[i] ?? "") + words[j][i]
                }
            }

            if (words[i] !== columnWords[i]) return false;
        }

        return true
    }
}
