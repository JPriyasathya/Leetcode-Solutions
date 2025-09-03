class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double ans=0;
        double minans=Integer.MAX_VALUE;
        int left=0,right=nums.length-1;
        while(left<right) 
        {
            ans=(nums[left]+nums[right])/2.0;
            minans=Math.min(minans,ans);
            left++;
            right--;
        }
        return minans;
    }
}