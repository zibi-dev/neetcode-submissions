class Solution {
    /**
     * @param {number[]} arr
     * @return {number[]}
     */
    replaceElements(arr) {
        let curMax = arr.at(-1)
        const result = arr.slice(0, -1)
        result.push(-1)

        for (let i = result.length - 2; i >= 0; i--) {
            const temp = result[i];
            result[i] = curMax;
            if (temp > curMax) curMax = temp
        }

        return result
    }
}
