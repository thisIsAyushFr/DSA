class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int r=26-(s.charAt(i)-'a');
            int p=i+1;
            sum+= r*p;
        }
        return sum;
    }
}