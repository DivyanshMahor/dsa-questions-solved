class Solution {
    public int removeDuplicates(int[] nums) {

        int left = 0;
        int unique = 1;
        int checker = 1;

        while(checker < nums.length){

            if(nums[left] != nums[checker] ){
                nums[left+1] = nums[checker];
                unique++;
                left++;
            }else{
                checker++;
            }
        }
        return unique;
    }
}