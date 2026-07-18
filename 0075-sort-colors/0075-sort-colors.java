class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                // 0 ko left side bhejo
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {
                // 1 already middle me sahi hai
                mid++;

            } else {
                // 2 ko right side bhejo
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}