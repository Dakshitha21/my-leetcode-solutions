class Solution {
    public int countDigits(int num) {
        int temp = num;
        int dig = 0, count = 0;
        while(temp > 0){
            dig = temp % 10;
            if( dig != 0 && num % dig == 0)
                count ++;
            temp = temp / 10;
        }
        return count;
    }
}