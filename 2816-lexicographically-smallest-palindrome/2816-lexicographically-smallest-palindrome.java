class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr=s.toCharArray();
        int left=0,right=arr.length-1,count=0;
        while(left<right)
        {
            if(arr[left]!=arr[right])
            {
                if(arr[left]>arr[right])
                {
                    arr[left]=arr[right];
                }
                else
                {
                    arr[right]=arr[left];
                }
                count++;
            }
            left++;
            right--;
        }
        if(count==0)return s;
        return new String(arr);
    }
}