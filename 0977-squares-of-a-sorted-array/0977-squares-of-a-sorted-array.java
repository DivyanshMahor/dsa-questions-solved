class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int k = nums.length-1;
        int arr[] = new int[nums.length]; 

        while( left <= right ){

            int lsq = nums[left] * nums[left];
            int rls = nums[right] * nums[right];

            if( lsq < rls ){
                arr[k] = rls;
                right--;
                k--;

            }else{
            arr[k] = lsq;
            left++;
            k--;
            }
        }
        return arr;
    }
}