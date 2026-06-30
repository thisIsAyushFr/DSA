class Solution {
    public String reverseVowels(String s) {
        char[] arr1=s.toCharArray();
        int l=0;
        int r=arr1.length-1;
        while(l<r){
            if("aeiou".indexOf(Character.toLowerCase(arr1[l]))==-1){
                l++;
                continue;
            }
            if("aeiou".indexOf(Character.toLowerCase(arr1[r]))==-1){
                r--;
                continue;
            }
            char temp =arr1[l];
            arr1[l]=arr1[r];
            arr1[r]=temp;
            l++;
            r--;
        }
        return new String(arr1);
    }
}