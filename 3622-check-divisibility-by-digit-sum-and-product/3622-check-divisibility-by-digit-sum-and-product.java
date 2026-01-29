class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int prod = 1;
        while(temp > 0){
            sum += temp % 10;
            prod *= temp % 10;
            temp = temp / 10;
        }
        int res = sum + prod;
        if(n % res == 0)
            return true;
        else
            return false;
    }
}