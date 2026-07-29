class Solution {
    public void sortColors(int[] nums) {

        int low = 0; int mid = 0; int high = nums.length-1;

        while(mid <= high){

            if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            }

            else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            else{
                mid++;
            }
        }
        
    }

    void swap(int []arr,int po1, int  po2 ){
        int temp = arr[po1];
        arr[po1] = arr[po2];
        arr[po2] = temp;
    }
}