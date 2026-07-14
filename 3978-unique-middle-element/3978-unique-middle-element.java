class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int m = nums[nums.length / 2];
        int c = 0;
        for (int i : nums) {
            if (m == i) {
                c++;
            }
        }
        return c == 1;
    }
}