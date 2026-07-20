import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> h1 = new HashMap<>();
        for(char i : s.toCharArray()){
            if(h1.containsKey(i)){
                h1.put(i,h1.get(i)+1);
            }
            else{
                h1.put(i,1);
            }
        }
        int ans=0;
        for(int i=0; i<s.length();i++){
            if(h1.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}