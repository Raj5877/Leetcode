class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            }
            else{
                map.put(s,new ArrayList<String>());
                map.get(s).add(strs[i]);
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
