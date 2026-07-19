class Solution {
    public int removeDuplicates(int[] nums) {
        int k =1;
        int i = 0;
        int j=1;
        int arr = nums.length;

        while(j<arr){

            if(nums[i] ==  nums[j] ){
                j++;
            }else
            {
                nums[i+1] = nums[j];
                k++;
                j++;
                i++;
            }
        }
        return k;

    }
}