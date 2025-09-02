class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int left=0,max=0;
        for(int right=0;right<s.length();right++)
        {
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>2)
            {
                char cl=s.charAt(left);
                map.put(cl,map.get(cl)-1);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;

    }
}