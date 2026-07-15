class Solution {
    public int[] sortedSquares(int[] nums) {

int n = nums.length;
        int k =n-1;
        int i = 0;
        int j = n-1;
        int[] result =  new int[n];

        while(i<=j){
            
            int isq = nums[i]*nums[i];
            int jsq = nums[j]*nums[j];

            if(isq<jsq){
                result[k] = jsq;
             
                j--;
            }else{
                result[k] = isq;
               
                i++;
            } k--;
        }

        return result;
    }
}