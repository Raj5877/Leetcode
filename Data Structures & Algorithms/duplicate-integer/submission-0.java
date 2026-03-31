class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hp = new HashSet<>();
        for(int num:nums){
            if(!hp.add(num)){
                return true;
            }
        }
        return false;
    }
}