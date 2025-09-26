class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map=new HashMap<>();
        char alp='a';
        for(int i=0;i<key.length();i++)
        {
            char c=key.charAt(i);
            if(c!=' '  && !map.containsKey(c))
            {
                map.put(c,alp++);
            }
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<message.length();i++)
        {
            char c=message.charAt(i);
            if(c==' ')
            {
                s.append(' ');
            }
            else
            {
                s.append(map.get(c));
            }
        }
        return s.toString();
        
    }
}