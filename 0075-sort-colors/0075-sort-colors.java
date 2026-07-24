class Solution {
    public void sortColors(int[] nums) {

        int  st = 0;
        int mid = 0;
        int end = nums.length-1;
        // int n = 

        while( mid <= end ){ 

            if( nums[mid] == 0 ){

                swap(nums, st , mid );
                st++;
                mid++;
                
            }

            else if( nums[mid] == 2 ){

                swap(nums, end , mid );
                end--;
            }


            else{ // arr[m] == 1;
            
            mid++;

            }


         }
        
    }

    public void swap( int[] arr, int po1, int po2){
        int temp = arr[po1];
        arr[po1] = arr[po2];
       arr[po2] = temp;
    }
}