class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        s=s.toLowerCase();
        t=t.toLowerCase();
        int[] freq=new int[26];
        for(char c:s.toCharArray())
        {
            if(Character.isLetter(c))
            {
                freq[c-'a']++;
            }
        }
        for(char c:t.toCharArray())
        {
            if(Character.isLetter(c))
            {
                freq[c-'a']--;
                if(freq[c-'a']<0)return false;
            }
        }
        return true;
    }
}