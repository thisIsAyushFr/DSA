class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        int cm=0;
        char arr[] = s.toCharArray();
        int len = arr.length;

        for(int i=0;i<k;i++){
            if("aeiou".indexOf(arr[i])!=-1){
                c++;
            }
        }

        cm=c;
        for(int i=k;i<len;i++){
            if("aeiou".indexOf(arr[i])!=-1){
                c++;
            }
            if("aeiou".indexOf(arr[i-k])!=-1){
                c--;
            }
            cm = Math.max(c,cm);
        }
        return cm;
    }
}