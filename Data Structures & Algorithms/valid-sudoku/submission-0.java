class Solution {
    char[][] board;
    public boolean isValidSudoku(char[][] board) {
        this.board = board;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(!isValid(i,j,board[i][j])){
                    return false;
                }
            }
        }
        return true;
    }


    boolean isValid(int r,int c,char n){
        if(n == '.'){
            return true;
        }
        return isValidRow(r,c,n) &&  isValidCol(r,c,n) && isValidBox(r,c,n);
    }

    boolean isValidRow(int row,int col,char num){
        for(int i=0;i<9;i++){
            if(i!= col && num == board[row][i]){
                return false;
            }
        }
        return true;
    }

    boolean isValidCol(int row , int col,char num){
        for(int i=0;i<9;i++){
            if(i!=row && num == board[i][col]){
                return false;
            }
        }
        return true;
    }

    boolean isValidBox(int row,int col,char num){
        int stR = (row/3)*3;
        int stC = (col/3)*3;
        System.out.println(row+" - "+col+" - "+stR+" - "+stC);
        for(int i=stR;i<stR+3;i++){
            for(int j=stC;j<stC+3;j++){
                if(row!=i && col!= j && board[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }
}
