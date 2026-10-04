class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map=new HashMap();

        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        int maxv=0;
        int maxc=0;

        for(char c:map.keySet()){
            if(c=='a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {
                    if (map.get(c) > maxv) {
                    maxv = map.get(c);
                }

            } else {

                if (map.get(c) > maxc) {
                    maxc = map.get(c);
                }
            }
        }

        return maxv + maxc;
    }
}