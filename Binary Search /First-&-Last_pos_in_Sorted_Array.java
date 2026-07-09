class Solution {
    public int[] searchRange(int[] nums, int target) {
    
        int first = findfirst(nums,target);
        int last = findlast(nums,target);
        return new int[]{first,last};
    }
    public int findfirst(int[] nums,int target){
        int low = 0;
        int high = nums.length -1;
        int res  = -1;
        while(low <= high){
            int guess = low + (high - low)/2;
            if(nums[guess] < target) {
                low = guess + 1;
            }
            else if(nums[guess] > target){
                high = guess-1;
            }
            else{
                res = guess;
                high = guess-1;
            }
        }
        return res;
    }
     public int findlast(int[] nums,int target){
        int low = 0;
        int high = nums.length -1;
        int res  = -1;
        while(low <= high){
            int guess = low + (high - low)/2;
            if(nums[guess] < target) {
                low = guess + 1;
            }
            else if(nums[guess] > target){
                high = guess-1;
            }
            else{
                res = guess;
                low = guess+1;
            }
        }
        return res;
    }
}
