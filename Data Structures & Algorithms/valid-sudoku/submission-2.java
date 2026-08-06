class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row;
        HashSet<Character> col;
        HashSet<Character> box;
        for(int i=0;i<9;i++){
            row = new HashSet<>();
            col = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){ 
                    if(row.contains(board[i][j]))
                        return false;
                    else{
                        row.add(board[i][j]);
                    }
                }
                if(board[j][i]!='.'){
                    if(col.contains(board[j][i]))
                        return false;
                    else{
                        col.add(board[j][i]);
                    }
                }
            }
        }
        for(int i=0;i<9;i++){
            int k = (i/3)*3;
            box = new HashSet<>();
            for(int j=0;j<9;j++){
                if(j%3==0 && j!=0)
                    k++;
                if(board[k][3*(i%3) + j%3]!='.'){
                    if(box.contains(board[k][3*(i%3) + j%3])){
                        return false;
                    }
                    else
                        box.add(board[k][3*(i%3) + j%3]);
                }
            }
        }
        return true;
    }
}
