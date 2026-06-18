class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

       int i = m-1; // m is last index of nums1 elem
        int j = n-1; //n is last index of nums2 elem
        int k = m+n-1;  // jo khali jagah bharega

        while(i>=0 && j>=0){

          if(nums1[i] < nums2[j] ){
            nums1[k--] = nums2[j--];
            continue;
          }

          nums1[k--] = nums1[i--];
        }

        while(j >= 0 ){
            nums1[k--] = nums2[j--];
        }

    }}