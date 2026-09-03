class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length - 1;
        while(i<=j){
            if(!Character.isLetter(arr[i]) && !Character.isDigit(arr[i])){
                i++;
                continue;
            }
            if(!Character.isLetter(arr[j]) && !Character.isDigit(arr[j])){
                j--;
                continue;
            }
            if(Character.toLowerCase(arr[i])!=Character.toLowerCase(arr[j])){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
