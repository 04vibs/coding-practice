class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultarray=new int[2];
        for (int i=0;i<nums.length-1;i++){
            for(int k=i+1;k<nums.length;k++)
            {
                 if(target==nums[i]+nums[k])
                 {
                     resultarray[0]=i;
                     resultarray[1]=k;
                 }
            }
        }
        return resultarray;
    }
}