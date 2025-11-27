class Solution {
    public int mySqrt(int x) {
        if(x <= 0)
            return 0;
        double n = 0;
        if(x > 0){
            n = Math.pow(x, 0.5);
        }
        int n1 = (int) n;
        return n1;
    }
}