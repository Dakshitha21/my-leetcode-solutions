class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev = 0, doubleRev = 0;
        int temp = num;
        while(temp > 0){
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        while(rev > 0){
            doubleRev = (doubleRev * 10) + ( rev % 10);
            rev = rev / 10;
        }
        if(doubleRev == num)
            return true;
        else
            return false;
    }
}