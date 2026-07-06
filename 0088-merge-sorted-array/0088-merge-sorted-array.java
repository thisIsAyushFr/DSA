class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m-1;
        int r = n-1;
        int i = m+n-1;

        while(l>=0 && r>=0){
            if(nums1[l]>nums2[r]){
                nums1[i]=nums1[l];
                l-=1;
            }
            else{
                nums1[i]=nums2[r];
                r-=1;
            }
            i-=1;
        }
        while(r>=0){
            nums1[i]=nums2[r];
            r--;
            i--;
        }
    }
}