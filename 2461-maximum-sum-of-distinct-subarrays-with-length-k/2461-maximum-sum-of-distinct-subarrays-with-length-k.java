class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h1 = new HashMap<>();

        long wsum=0;
        long sum=0;

        for(int i=0;i<k;i++){
            if(h1.containsKey(nums[i])){
                h1.put(nums[i],h1.get(nums[i])+1);
            }
            else{
                h1.put(nums[i],1);
            }
            wsum+=nums[i];
            if(h1.size()==k) sum=Math.max(sum,wsum);
        }

        for(int i=k;i<nums.length;i++){
            if(h1.containsKey(nums[i])){
                h1.put(nums[i],h1.get(nums[i])+1);
            }
            else
                h1.put(nums[i],1);

            wsum+=nums[i];
            int old = nums[i-k];

            h1.put(old,h1.get(old)-1);

            if(h1.get(old)==0) h1.remove(old);
            wsum-=old;
            if(h1.size()==k) sum=Math.max(sum,wsum);
        }
        return sum;
    }
}