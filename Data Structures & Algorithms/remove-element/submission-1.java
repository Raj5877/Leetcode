class Solution {
    public void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int removeElement(int[] nums, int val) {
        int first=0;
        int last = nums.length-1;
        int k=0;
        while(first<=last){
            if(nums[first]==val){
                swap(nums,first,last);
                last--;
            }
            if(nums[first]!=val){
                first++;
                k++;
            }
        }
        return k;
    }
}