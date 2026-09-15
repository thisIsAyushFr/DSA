class Solution {
    public int arrangeCoins(int n) {
       int ans = 0 ,i = 1;
        while(n >= i){
            ans++;
            n -= i;
            i++;
        }
        return ans;

    }
}