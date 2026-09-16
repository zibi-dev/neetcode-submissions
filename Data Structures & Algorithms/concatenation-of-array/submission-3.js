class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    getConcatenation(nums) {
        const result = [...nums, ...nums]
        return result
    }
}
