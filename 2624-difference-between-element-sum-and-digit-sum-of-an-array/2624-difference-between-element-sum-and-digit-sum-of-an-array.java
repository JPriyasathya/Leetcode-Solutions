class Solution {
    public int differenceOfSum(int[] nums) {
        int ans=0;
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            ans+=nums[i];
            sum+=sumofdigit(nums[i]);
        }
        return ans-sum;
    }
    public int sumofdigit(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}