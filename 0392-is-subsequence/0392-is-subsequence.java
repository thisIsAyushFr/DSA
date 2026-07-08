class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1=0;
        int p2=0;
        int cn=s.length();
        while(cn>0 &&p2<t.length() &&p1<s.length()){
            if(s.charAt(p1)==t.charAt(p2)){
                p1++;
                p2++;
                cn--;
                continue;
            }
            else{
                p2++;
            }
        }
        if(cn==0){
            return true;
        }
        return false;
    }
}