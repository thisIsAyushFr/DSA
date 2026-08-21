class Solution {
    public int countGoodSubstrings(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> h1 = new HashMap<>();
        int c=0;
        if(s.length() < 3) {
            return 0;
        }
        for(int i =0;i<3;i++){
            if(h1.containsKey(arr[i])){
                h1.put(arr[i],h1.get(arr[i])+1);
            }
            else{
                h1.put(arr[i],1);
            }
        }
        if(h1.size()==3){
                c++;
            }
        for(int i = 3;i<arr.length;i++){
            if(h1.containsKey(arr[i])){
                h1.put(arr[i],h1.get(arr[i])+1);
            }
            else{
                h1.put(arr[i],1);
            }
            char old = arr[i-3];
                        h1.put(old, h1.get(old) - 1);

            if(h1.get(old) == 0){
                h1.remove(old);
            }

            if(h1.size() == 3){
                c++;
            }
        }

        return c;
    }
}