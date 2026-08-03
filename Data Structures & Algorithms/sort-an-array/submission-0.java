class Solution {
    public static void heapify(int arr[], int n,int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        
        if(left<n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right<n && arr[right] > arr[largest]){
            largest = right;
        }
        if(largest!=i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr,n,largest);
        }
    }
    
    public static void heap_sort(int[] arr){
        int n = arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        while(n>0){
            int temp = arr[0];
            arr[0] = arr[n-1];
            arr[n-1] = temp;
            heapify(arr,--n,0);
        }
    }

    public int[] sortArray(int[] nums) {
        heap_sort(nums);
        return nums;
    }
}