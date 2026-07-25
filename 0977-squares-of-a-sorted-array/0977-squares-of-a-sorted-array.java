class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;

        int left = 0; int right = n-1;
        int fill = n-1;
        int[] arr = new int[n];

        while(left <= right){

            int sqleft = nums[left] * nums[left];
            int sqright = nums[right] * nums[right];

            if( sqleft > sqright )  {

                arr[fill] = sqleft;
                fill--;
                left++;
            }

            else
            //  ( sqleft < sqright )
            {

                arr[fill] = sqright;
                fill--;
                right--;
            }
        }
        
        return arr;
    }
}