class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
            set.add(reversenum(num));
        }
        return set.size();
    }

    public static int reversenum(int n)
    {
        int ans=0;
        while(n>0)
        {
            int rem=n%10;
            ans=ans*10+rem;
            n/=10;
        }
        return ans;
    }
}