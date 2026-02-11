class Solution {
    public int findLucky(int[] arr) {
        int freq, max = -1;;
        for(int i = 0; i < arr.length; i++){
            freq = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j])
                    freq++;
            }
            if(arr[i] == freq)
                max = Math.max(max, arr[i]);
        }
        return max;
    }
}