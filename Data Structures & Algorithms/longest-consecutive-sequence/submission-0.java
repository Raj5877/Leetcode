class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : nums){
            if(!set.contains(x-1)){
                list.add(x);
            }
        }
        int longest=0;
        for(int x : list){
            int count=1;
            int element = x;
            while(set.contains(element+1)){
                count++;
                element++;
            }
            if(count>longest){
                longest=count;
            }
        }
        return longest;
    }
}
