class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char m:magazine.toCharArray())
        {
            map1.put(m,map1.getOrDefault(m,0)+1);
        }
        for(char r:ransomNote.toCharArray())
        {
            map2.put(r,map2.getOrDefault(r,0)+1);
        }
        for(char c:map2.keySet())
        {
            int need=map2.get(c);
            int aval=map1.getOrDefault(c,0);
            {
                if(aval<need)
                {
                    return false;
                }
            }
        }
        return true;
    }
}