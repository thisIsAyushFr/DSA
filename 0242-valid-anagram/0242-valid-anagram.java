class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] charcounts = new int[26];

        for(int i=0;i<s.length();i++){
            charcounts[s.charAt(i)-'a']++;
            charcounts[t.charAt(i)-'a']--;
        }

        for(int i : charcounts){
            if(i!=0){
                return false;
            }
        }
        return true;
     }
}