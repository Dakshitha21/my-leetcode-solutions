class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int xor = 0;
        for(int k : hm.keySet()){
            if(hm.get(k) == 2)
                xor ^= k;
        }
        return xor;
    }
}