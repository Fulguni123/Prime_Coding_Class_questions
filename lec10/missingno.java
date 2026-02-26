class Solution {
    public int missingno(int[] arr) {
        int n = arr.length;
        
        int m = n * (n + 1) / 2;
        int k = 0;
        
        for(int i = 0; i < n; i++){
            k += arr[i];
        }
        
        return m - k;
    }
}
