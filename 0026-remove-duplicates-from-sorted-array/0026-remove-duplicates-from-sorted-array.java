class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 1; //unique element

        int i = 0;
        int j = 1;

        int n = nums.length;

        while (j < n) { // yaha muje lag rhahai i nhi j hoga

            if (nums[j] == nums[j - 1]) {
                j++;
                continue;
             // ya shayd ander hi chalega 
            }
  nums[i+1]  = nums[j];
   j++;
  k++;
i++;
            
            
        }return k;

    }
}