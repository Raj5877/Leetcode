class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1,e2) -> e2.getValue() - e1.getValue());
        int[] most_freq = new int[k];
        for(int i=0;i<k;i++){
            most_freq[i] = list.get(i).getKey();
        }
        return most_freq;
    }
}
