class Solution {
    public int climbStairs(int n) {
        if(n<=0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        int x = 2;
        int y=1;
        int z=0;
        for(int i=2;i<n;i++){
            z=x+y;
            y=x;
            x=z;
        }
        return z;
    }
}