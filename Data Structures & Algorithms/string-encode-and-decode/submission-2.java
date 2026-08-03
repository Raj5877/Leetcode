class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder(100);
        for(String str : strs){
            sb.append(str);
            sb.append("\0");
        }
        return new String(sb.toString());
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str);
        StringBuilder temp = new StringBuilder(100);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='\0'){
                list.add(temp.toString());
                temp.setLength(0);
                continue;
            }
            temp.append(sb.charAt(i));
        }
        return list;
    }
}
