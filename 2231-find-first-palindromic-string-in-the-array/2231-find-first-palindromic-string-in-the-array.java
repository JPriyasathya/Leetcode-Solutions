class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(isPalindrome(words[i]))return words[i];
        }
        return ""; 
    }
    public boolean isPalindrome(String words)
    {
        int left=0,right=words.length()-1;
        while(left<right)
        {
            char c=words.charAt(left);
            char s=words.charAt(right);
            if(c!=s)return false;
            left++;
            right--;
        }
        return true;
    }
}