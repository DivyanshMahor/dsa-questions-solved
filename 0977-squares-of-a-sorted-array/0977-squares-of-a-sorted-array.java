class Solution {
    public int[] sortedSquares(int[] nums) {
int n = nums.length;
        int[] arr = new int[n];

        int left = 0;
        int right = arr.length-1;
        int fill = arr.length-1;

        while(left <= right){

            int sqleft = nums[left] * nums[left];
            int sqright = nums[right] * nums[right];

            if(sqleft > sqright){ 

                arr[fill] = sqleft;
                fill--;
                left++;
            }
            else{
                arr[fill] = sqright;
                fill--;
                right--;
            }
            
        
        }
        return arr;
        
    }
}