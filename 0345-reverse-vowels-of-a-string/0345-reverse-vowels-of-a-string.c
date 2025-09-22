char* reverseVowels(char* s) {
    int n=strlen(s);
    int l=0,r=n-1;
    while(l<r)
    {
        while(l<r && strchr("aeiouAEIOU",s[l])==NULL)
        {
            l++;
        }
        while(l<r && strchr("aeiouAEIOU",s[r])==NULL)
        {
            r--;
        }
        if(l<r)
        {
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
    }
    return s;
}