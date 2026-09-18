class Solution {
    public int[] sortedSquares(int[] nums) {

        int size = nums.length;
        int[] arr = new int[size];
        int fit = arr.length-1;

        int left = 0;
        int right = nums.length-1;

        while(left <= right){

            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if(leftsq >= rightsq){
                arr[fit] = leftsq;
                left++;
                fit--;
            }
            else if (leftsq <= rightsq){
                arr[fit] = rightsq;
                right--;
                fit--;
            }
        }

        
return arr;

    }
}