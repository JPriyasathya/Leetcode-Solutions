class Solution {
    public int countGoodSubstrings(String s) {
        // Map<Character,Integer> map= new HashMap<>();
        // int left=0,count=0;
        // for(int right=0;right<s.length();right++)
        // {
        //     char ch=s.charAt(right);
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        //     if(right-left+1>3)
        //     {
        //         char cl=s.charAt(left);
        //         map.put(cl,map.get(cl)-1);
        //         if(map.get(cl)==0)map.remove(cl);
        //         left++;
        //     }
        //     if(map.size()==3 && right-left+1 == 3)count++;
        // }
        // return count;
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            char c = s.charAt(i+2);
            if(a!=b && b!=c && c!=a)count++;
        }
        return count;
    }
}