class Solution {
    public String reverseWords(String s) {
        String[] words=s.split("\\s+");
        StringBuilder reverse=new StringBuilder();
        for(String c:words)
        {
            StringBuilder reversed=new StringBuilder(c);
            reversed.reverse();
            reverse.append(reversed).append(" ");
        }
        return reverse.toString().trim();
    }
}