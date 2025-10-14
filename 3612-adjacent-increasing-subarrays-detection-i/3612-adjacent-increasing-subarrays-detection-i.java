class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        //if(n<2*k)return false;
        for(int i=0;i<=n-2*k;i++)
        {
            boolean a=increasingNum(nums,i,i+k-1);
            boolean b=increasingNum(nums,i+k,i+2*k-1);
            if(a&b)return true;
        }      
        return false;    
    }
    public static boolean increasingNum(List<Integer> nums,int s,int e)
    {
        if(s==e)return true;
        for(int i=s;i<e;i++)
        {
            if(nums.get(i)>=nums.get(i+1))return false;
        }
        return true;
    }
}