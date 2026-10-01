class Solution {
    public int removeDuplicates(int[] nums) {

        int left = 0;
        int right = 1;
        int k = 1;
        int s = nums.length;

        while(right < s){

            if(nums[left] != nums[right]){
                nums[left+1] = nums[right];
                k++;
                left++;
            }else{
                right++;
            }
        }

return k;
        
    }
}