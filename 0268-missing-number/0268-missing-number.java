class Solution {
    public int missingNumber(int[] nums) {
        int c=nums.length;
        for(int i=0;i<nums.length;i++){
            c=c^(nums[i]^i);
        }
        return c;
    }
}