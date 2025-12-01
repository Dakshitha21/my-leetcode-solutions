class Solution {
    public int reverse(int x) {
        int M = (int)(Math.pow(2, 31) - 1);
        int m = (int)(Math.pow(-2, 31));
        int rev = 0;
        while(x != 0){
            int digit = x % 10;
            if(rev > M / 10 || rev < m / 10)
                return 0;
            else
                rev = digit + (rev * 10);
            x = x / 10;
        }
        return rev;
    }
}