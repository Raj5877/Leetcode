class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>(); 
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefix[i+1] = prefix[i] + nums[i];
            if(map.containsKey(prefix[i+1]-k)){
                count += map.get(prefix[i+1]-k);
            }
            map.put(prefix[i+1], map.getOrDefault(prefix[i+1],0)+1);
        }
        return count;
    }
}