class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        HashSet<Integer> s1 = new HashSet<>();
        for(int i : arr){
            if(h1.containsKey(i)){
                h1.put(i,h1.get(i)+1);
            }
            else{
                h1.put(i,1);
            }
        }
        for(int i : h1.values()){
            if(s1.contains(i)) return false;
            else s1.add(i);
        }
        return true;
    }
}