class Solution {
    public int maxDifference(String s) {
        int c1=0;
        int c2=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(char ch:map.keySet()){
            int f = map.get(ch);
            if(f%2 !=0) {
                if(f >c1){
                    c1=f;}
            }
            else{
                if(f< c2){
                    c2 =f;
                }
            }
        }
        return c1-c2;
    }
}