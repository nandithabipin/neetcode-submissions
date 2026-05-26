class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            continue;
            if(nums[i+1]==nums[i]+1)
            count++;
        }
        return count;
    }
}
