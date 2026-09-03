class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int[] result = new int[nums1.length];
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                result[k++] = nums1[i++];
            }
            else{
                result[k++] = nums2[j++];
            }
        }
        while(i<m){
            result[k++] = nums1[i++];
        }
        while(j<n){
            result[k++] = nums2[j++];
        }
        k=0;
        while(k<m+n){
            nums1[k] = result[k];
            k++;
        }
    }
}