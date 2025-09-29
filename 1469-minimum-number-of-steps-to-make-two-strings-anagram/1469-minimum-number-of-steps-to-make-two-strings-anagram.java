class Solution {
    public int minSteps(String s, String t) {
        int n=s.length();
        int m=t.length();
        int count=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<m;i++)
        {
            char ch=t.charAt(i);
            if(map.containsKey(ch) && map.get(ch) >0)
            {
                map.put(ch,map.get(ch)-1);
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}