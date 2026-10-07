class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[right] + nums[left];

                if (sum > 0) {
                    right--;

                } else if (sum < 0) {
                    left++;

                } else {
                    result.add(Arrays.asList(nums[i], nums[right], nums[left]));
                    left++;
                    right--;
                }

            }
        }
        return new ArrayList<>(result);
    }
}