class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder(100);
        for(String str : strs){
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        return new String(sb.toString());
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str);
        StringBuilder temp;
        int i=0;
        while(i!=sb.length()){
            int j=i;
            while(sb.charAt(j)!='#') j++;
            int len = Integer.parseInt(sb.substring(i,j));
            i=j+1;
            temp = new StringBuilder(sb.substring(i,i+len));
            list.add(temp.toString());
            i+=len;
        }
        return list;
    }
}
