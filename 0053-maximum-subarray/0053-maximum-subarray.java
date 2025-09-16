class Solution {
    public int maxSubArray(int[] nums) {
        int maxnum=nums[0];
        int curnum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curnum=Math.max(nums[i],curnum+nums[i]);
            maxnum=Math.max(curnum,maxnum);
        }
        return maxnum;
    }
}