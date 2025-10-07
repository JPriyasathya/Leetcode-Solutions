class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                ans+=entry.getKey();
            }
        }
        return ans;
    }
}