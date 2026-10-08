class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;
        // Set List<List<Integers>> result = new HashSet<>();
        int minValue = Integer.MAX_VALUE;
        int res = nums[0]  + nums[0] + nums[0];

        for(int i = 0; i < n-2; i++){

            int left = i + 1;
            int right = n-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum > target){
                    // result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;

                }

                else if(sum < target){
                    // result.add(Arrays.asList(nums[i] , nums[left], nums[right] ));
                    left++;

                }

                else{
                    return sum;
                }

                int diff = Math.abs(sum - target);

                if( minValue > diff ){
                    minValue = diff;
                    res = sum;

                }

            }
        }

        return res;
        
    }
}