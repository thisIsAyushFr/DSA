class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> h1 = new HashMap<>();
        char arr[] = s.toCharArray();
        for(char i : arr){
            if(h1.containsKey(i)){
                h1.put(i,h1.get(i)+1);
            }
            else{
                h1.put(i,1);
            }
        }
            int x = -1;

            for(int i : h1.values()){
                if(x==-1){
                    x=i;
                }
                else if(i!=x) return false;
            }
        return true;
    }
}