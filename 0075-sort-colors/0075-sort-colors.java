class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int end = nums.length-1;
        while( mid <= end ) {
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;

            }
            else if(nums[mid] == 2){
                swap(nums, mid, end);
                end--;
            }

            else mid++;
        }
    }
    public void swap(int[] arr,int po1,int po2){
        int temp = arr[po1];
        arr[po1] = arr[po2];
        arr[po2] = temp;
    }
}