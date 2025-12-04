1class Solution {
2    public int maxRepeating(String sequence, String word) {
3        int count=0;
4        String temp=word;
5        while(sequence.contains(temp))
6        {
7            count++;
8            temp+=word;
9        }
10        return count;
11    }
12}