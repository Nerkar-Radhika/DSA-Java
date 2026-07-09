class Solution {
    public int findCeil(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while(low <= high){
            int guess = low + (high - low)/2;
            if(arr[guess] >= x){
                high = guess-1;
                res = guess;
            }
            else{
                low = guess+1;
            }
        }
        return res;
    }
}
