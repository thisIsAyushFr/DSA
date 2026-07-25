class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();


        for(int i : nums1){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }
            else
            m.put(i,1);
        }
        for (int i : nums2) {
            if (m.containsKey(i) && m.get(i) > 0) {
                ans.add(i);
                m.put(i, m.get(i) - 1);
            }
        }
    int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}