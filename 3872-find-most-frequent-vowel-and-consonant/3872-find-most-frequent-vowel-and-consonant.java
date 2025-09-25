class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> con=new HashMap<>();
        Map<Character,Integer> vow=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                vow.put(c,vow.getOrDefault(c,0)+1);
            }
            else
            {
                con.put(c,con.getOrDefault(c,0)+1);
            }
        }
        int vc=0;
        for(Map.Entry<Character,Integer> e:vow.entrySet())
        {
            if(e.getValue()>vc)
            {
                vc=e.getValue();
            }
        }
        int cc=0;
        for(Map.Entry<Character,Integer> e:con.entrySet())
        {
            if(e.getValue()>cc)
            {
                cc=e.getValue();
            }
        }
        return vc+cc;
    }
}