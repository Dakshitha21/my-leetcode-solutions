class Solution {
    public int sumBase(int n, int k) {
        int baseK = 0;
        while(n > 0){
            baseK = (n % k) + (baseK * 10);
            n = n / k;
        }
        int sum = 0;
        while(baseK > 0){
            sum = (baseK % 10) + sum;
            baseK = baseK / 10;
        }
        return sum;
    }
}