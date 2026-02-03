class Solution {
    public int findComplement(int num) {
        String n = "";
        while(num > 0){
            n = (num % 2) + n;
            num = num / 2;
        }
        n = n.replace('0','x');
        n = n.replace('1', '0');
        n = n.replace('x','1');
        int res = Integer.parseInt(n, 2);
        return res;
    }
}