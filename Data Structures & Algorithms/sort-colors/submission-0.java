class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;     
    }
    public void sortColors(int[] nums) {
        int i=0, j=nums.length-1;
        while(i<=j){
            while(i<=j && nums[i]==0) i++;
            while(i<=j && nums[j]==2) j--;
            if(i > j)
                break;
            if(nums[j] == 0 || nums[i] == 2){
                swap(nums,i,j);
            }
            else{
                int temp1=i+1, temp2=j-1;
                boolean found = false;
                while(temp1<=temp2){
                    if(nums[temp1] == 0 && nums[temp2] == 2){
                        swap(nums,i,temp1);
                        swap(nums,j,temp2);
                        found=true;
                        break;
                    }
                    else if(nums[temp1] == 2 && nums[temp2] == 0){
                        swap(nums,i,temp2);
                        swap(nums,j,temp1);
                        found=true;
                        break;
                    }
                    else if(nums[temp1] == 0){
                        swap(nums,i,temp1);
                        found=true;
                        break;
                    }
                    else if(nums[temp1] == 2){
                        swap(nums,j,temp1);
                        found=true;
                        break;
                    }
                    else if(nums[temp2] == 0){
                        swap(nums,i,temp2);
                        found=true;
                        break;
                    }
                    else if(nums[temp2] == 2){
                        swap(nums,j,temp2);
                        found=true;
                        break;
                    }
                    else{
                        temp1++;
                        temp2--;
                    }
                }
                if(!found)
                        break;
            }
        }
    }
}