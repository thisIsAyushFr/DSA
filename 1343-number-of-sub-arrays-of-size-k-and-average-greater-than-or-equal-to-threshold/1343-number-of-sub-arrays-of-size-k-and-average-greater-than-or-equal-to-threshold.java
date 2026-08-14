class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        int wsum=0;
        for(int i=0;i<k;i++){
            wsum += arr[i];
        }
        if((wsum/k)>=threshold) c++;

        for(int i=k;i<arr.length;i++){
            wsum+=arr[i];
            wsum-=arr[i-k];

            if((wsum/k)>=threshold) c++;
        }
        return c;
    }
}