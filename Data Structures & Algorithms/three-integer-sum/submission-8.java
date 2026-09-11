class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> result = new ArrayList<>();
       for(int k=0;k<nums.length-2;k++){
        if(k>0 && nums[k]==nums[k-1]) continue;
        int i = k+1;
        int j = nums.length-1;
        while(i<j){
            int sum = nums[k] + nums[i] + nums[j];

            if(sum<0)
                i++;
            else if(sum>0)
                j--;
            else{
                result.add(new ArrayList<>(List.of(nums[k],nums[i],nums[j])));
                //check skip all the duplicate values

                while(i<j && nums[i]==nums[i+1])
                    i++;
                i++;

                while(i<j && nums[j]==nums[j-1])
                    j--;
                j--;

            }
        }
       }
       return result;
    }
}
