class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int[] prefix = new int[n+1];
        int[] postfix = new int[n+1];
        Arrays.fill(prefix,1);
        Arrays.fill(postfix,1);        
        for(int i=0;i<n;i++){
            prefix[i+1] = prefix[i] * nums[i];
            postfix[n-i-1] = postfix[n-i] * nums[n-i-1];
        }
        for(int i=0;i<n;i++){
            output[i] = prefix[i]*postfix[i+1];
        }
        return output;
    }    
}  
