class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int r=people.length-1;
        int c=0;
        while(l<=r){
            c++;
            if((people[r]+people[l])<=limit){
                l++;
            }
            r--;
        }
        return c;
    }
}