class Solution {
    public int removeDuplicates(int[] nums) {
        
        int left = 0;
        int right = 1;
        int k = 1;
        // int hu = nums.length;

        while(right < nums.length){

            if(nums[right] != nums[right-1]){
                nums[left+1] = nums[right];
                left++;
                k++;
                right++;
            }else{
                right++;
            }
        }
        return k;
    }
}