class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> m1 = new HashMap<>();
        char[] arr = s.toCharArray();

        for(char i : arr){
            if(m1.containsKey(i)){
                m1.put(i,m1.get(i)+1);
            }
            else{
                m1.put(i,1);
            }
        }
        List<Map.Entry<Character,Integer>> l1 = new ArrayList<>(m1.entrySet());
        l1.sort((a,b)-> b.getValue()-a.getValue());
        StringBuilder ans = new StringBuilder();
        
        for(Map.Entry<Character,Integer> i : l1) {
            for(int j =0;j<i.getValue();j++){
                ans.append(i.getKey());
            }
         }
         return ans.toString();
    }
}