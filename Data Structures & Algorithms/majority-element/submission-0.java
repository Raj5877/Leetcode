class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        int maxValue = Integer.MIN_VALUE;
        int maxKey = 0;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue()>maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey; 
    }
}