class Solution {
    public int[] sortedSquares(int[] nums) {

int s = nums.length;
int[] arr = new int[s];
int fit = arr.length-1;

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int lsq = nums[left] * nums[left];
            int  rsq = nums[right] * nums[right];

            if(lsq >= rsq){
                 arr[fit] = lsq;
                 left++;
                 fit--;
            }else if (lsq <= rsq){
                arr[fit] = rsq;
                right--;
                
                fit--;
            }
           
        }

        return arr;
        
    }
}