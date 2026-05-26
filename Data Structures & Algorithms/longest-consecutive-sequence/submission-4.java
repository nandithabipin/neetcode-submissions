class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Set<Integer> st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        for(int num:nums){
            int streak=0,curr=num;
            while(st.contains(curr)){
                streak++;
                curr++;
            }
            res=Math.max(res,streak);
        }
        return res;
    }
}
