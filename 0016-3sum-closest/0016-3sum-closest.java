class Solution {
    public int threeSumClosest(int[] nums, int target) {
int n = nums.length;
        Arrays.sort(nums);

        int finalSum = nums[0]+nums[1]+nums[2];

        for(int i = 0; i < n-2; i++){

            int left = i+1;
            int right = n-1;

            

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == target){
                    return sum;
                }
                else if(sum > target){
                    right--;
                }
                else{
                    left++;
                }

                if(Math.abs(sum - target ) < Math.abs( finalSum - target )){
                    finalSum = sum;
                }
            }
        }

        return finalSum;
        
    }
}