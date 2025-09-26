class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int small=1;
        for(int num:nums)
        {
            if(small==num)small++;
        }
        return small;
    }
}