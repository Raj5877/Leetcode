class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int product=1;
        boolean flagZero = false;
        int indexZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(flagZero){
                    return output;
                }
                else{
                    flagZero = true;
                    indexZero = i;
                }
            }
            else{
                product*=nums[i];
            }
        }
        if(flagZero){
            output[indexZero] = product;
        }
        else{
            for(int i=0;i<nums.length;i++){
                output[i] = product/nums[i];
            }
        }
        return output;
    }
}  
