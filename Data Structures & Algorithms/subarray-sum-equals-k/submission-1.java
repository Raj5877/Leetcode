class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int prefix = 0;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>(); 
        // Can reduce the space complexity to O(1) as we never use the previous
        // value of the prefix array, we can just use an variable
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefix+=nums[i];
            if(map.containsKey(prefix-k)){
                count += map.get(prefix-k);
            }
            map.put(prefix, map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}