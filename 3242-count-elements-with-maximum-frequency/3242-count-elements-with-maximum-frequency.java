class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int maxfreq=0,count=0;
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int freq:map.values())
        {
            maxfreq=Math.max(maxfreq,freq);
        }
        for(int num:nums)
        {
            if(map.get(num)==maxfreq)count++;
        }
        return count;
    }
}