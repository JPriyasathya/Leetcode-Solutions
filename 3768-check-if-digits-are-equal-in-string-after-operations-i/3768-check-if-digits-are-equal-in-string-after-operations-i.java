class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        while (n > 2) {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';
                ans.append((a + b) % 10);
            }
            if (ans.length() == 2) {
                int a = ans.charAt(0);
                int b = ans.charAt(1);
                return a == b;
            }
            s = ans.toString();
            n = s.length();
        }
        return false;
    }
}