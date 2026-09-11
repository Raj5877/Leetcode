class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> sets = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int k=nums.length-1;
        int i;
        int j;
        while(k>=2){
            i=0;
            j=k-1;
            int num = -nums[k];
            while(i<j){
                if(nums[i]+nums[j] > num){
                    j--;
                }
                else if(nums[i]+nums[j] < num){
                    i++;
                }
                else{
                    List<Integer> temp = new ArrayList<>(List.of(nums[i],nums[j],-num));
                    if(sets.contains(temp)){
                        i++;
                    }
                    else{
                        result.add(temp);
                        sets.add(temp);
                        i++;
                    }
                }
            }
            k--;
        }
        return result;
    }
}
