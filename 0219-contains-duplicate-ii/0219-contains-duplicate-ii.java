class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> m1 = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(m1.containsKey(nums[i])){
                if(i - m1.get(nums[i])<=k){
                    return true;
                }
            }
            m1.put(nums[i],i);
        }
        return false;
    }
}