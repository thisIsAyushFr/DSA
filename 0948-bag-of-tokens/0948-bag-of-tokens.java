class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=0;
        int r=tokens.length-1;
        int score=0;
        int m=0;
        while(l<=r){
            if(tokens[l]<=power){
                score++;
                power=power-tokens[l];
                m=Math.max(m,score);
                l++;}
            else if(score>0){
                power+=tokens[r];
                score--;
                r--;
            }
            else{
                break;
            }
        }
        return m;
    }
}