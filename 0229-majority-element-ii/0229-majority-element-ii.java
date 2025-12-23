class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
            int count = hm.get(num);
            if(count > (n / 3) && !(l.contains(num)))
                    l.add(num);
        }
        return l;
    }
}