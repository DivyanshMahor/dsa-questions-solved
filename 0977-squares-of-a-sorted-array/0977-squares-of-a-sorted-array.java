class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int k = nums.length-1;
        int n = nums.length;
        int[] arr = new int[n];

        while(left <= right){
            int lsq = nums[left] * nums[left];
            int rsq = nums[right] * nums[right];

            if(lsq >= rsq) {
                arr[k] = lsq;
                left++;
                
            }
            else if(rsq >= lsq){
                arr[k] = rsq;
                right--;
            }
            k--;
        }
return arr;
    }
    
}