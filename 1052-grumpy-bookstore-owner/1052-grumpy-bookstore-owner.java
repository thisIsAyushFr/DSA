class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max=0;
        int sum=0;
        int window=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0) sum+=customers[i];
            if(i<minutes){
                if(grumpy[i]==1) window+=customers[i];
                else window+=0;
            }
            else{
                 if(grumpy[i]==1) window+=customers[i];
                 else window+=0;
                 if (grumpy[i - minutes] == 1) {
                     window -= customers[i - minutes];
                    } else {
             window -= 0;
             }
            }
           max=Math.max(window,max); 
        }
        return sum+max;
    }
}