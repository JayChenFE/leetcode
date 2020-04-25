/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y, count = 0;

        while (xor != 0) {
            count += 1;
            // remove the rightmost bit of '1'
            xor = xor & (xor - 1);
        }

        return count;

    }
}
// @lc code=end
