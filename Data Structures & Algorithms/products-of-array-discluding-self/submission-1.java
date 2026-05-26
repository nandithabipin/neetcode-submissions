class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int prdt=1;
            for(int j=0;j<nums.length;j++){
                if(j!=i)
                prdt*=nums[j];

            }
            res[i]=prdt;
        }
        return res;

        
    }
}  
