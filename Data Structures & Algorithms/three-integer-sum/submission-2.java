class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer> set = new HashMap<>();
        Set<List<Integer>> sets = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        int sum;
        for(int i=0;i<nums.length;i++){
            set.put(nums[i],i);
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                sum = nums[i] + nums[j];
                if(set.containsKey(-sum)){
                    if(set.get(-sum)<=j) continue;
                    List<Integer> temp = new ArrayList<>(List.of(nums[i],nums[j],-sum));
                    Collections.sort(temp);
                    if(sets.contains(temp)) continue;
                    else{
                        result.add(temp);
                        sets.add(temp);
                    }
                }
            }
        }
        return result;
    }
}
