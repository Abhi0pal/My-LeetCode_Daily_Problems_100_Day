class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int n = x % 10;
            
            // Check for overflow before updating rev hello this is for the nothing
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && n > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && n < -8)) {
                return 0;
            }
            
            rev = rev * 10 + n;
            x /= 10;
        }
        
        return rev;
        
    }
}
