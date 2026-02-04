class Solution {
    public int bitwiseComplement(int n) {
         String n1 = "";
         if(n == 0)
            return 1;
        while(n > 0){
            n1 = (n % 2) + n1;
            n = n / 2;
        }
        n1 = n1.replace('0','x');
        n1 = n1.replace('1', '0');
        n1 = n1.replace('x','1');
        int res = Integer.parseInt(n1, 2);
        return res;
    }
}