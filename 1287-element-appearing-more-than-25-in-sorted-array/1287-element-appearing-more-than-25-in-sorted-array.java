class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
            int count = hm.get(num);
            if(count > (n / 4))
                return num;
        }
        return 0;
    }
}