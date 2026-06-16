class Solution {

    //logic fnc
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {

            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[] { i + 1, j + 1 }; //mil gya
            }

            if (sum < target) {
                i++;
            }

            if (sum > target) {
                j--;
            }
        }
        return new int[0];

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 7, 11, 15 };
        int target = 9;
    }
}