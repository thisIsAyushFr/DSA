class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int m=0;
        while(l<r){
            int temp = Math.min(height[l],height[r])*(r-l);
            m = Math.max(temp,m);
            if(height[l]>height[r]){
                r--;
            }
            else
            l++;
        }
        return m;
    }
}