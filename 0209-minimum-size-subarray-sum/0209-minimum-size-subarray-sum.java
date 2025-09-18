class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int start=0,sum=0,min=Integer.MAX_VALUE;
        for(int end=0;end<n;end++)
        {
            sum+=nums[end];
            while(sum>=target)
            {
                min=Math.min(min,end-start+1);
                sum-=nums[start];
                start++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}