class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int zeros=0;
        int maxl=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeros++;
        while(zeros>k){
            if(nums[l]==0) zeros--;
            l++;
            
        }
        maxl = Math.max(maxl,i-l+1);
        }
        return maxl;
    }
    
}
