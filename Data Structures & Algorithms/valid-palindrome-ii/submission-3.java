class Solution {
    int l,m;
    public boolean validPalindrome(String s) {
        if(validPalindrome2(s,0,s.length()-1)) return true;
        int i=l,j=m;
        if(validPalindrome2(s,i+1,j)) return true;
        if(validPalindrome2(s,i,j-1)) return true;
        return false;
    }
    public boolean validPalindrome2(String s,int i,int j) {
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                l=i;
                m=j;
                return false;
            }
        }
        return true;
    }
}