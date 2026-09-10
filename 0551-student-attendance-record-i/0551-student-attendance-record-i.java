class Solution {
    public boolean checkRecord(String s) {
        char[] arr = s.toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='A') c++;
            if(arr.length-i>2){
                if(arr[i]=='L'&&arr[i+1]=='L'&&arr[i+2]=='L')
                return false;
            }
        }
        if(c>1){
            return false;
        }
        return true;
    }
}