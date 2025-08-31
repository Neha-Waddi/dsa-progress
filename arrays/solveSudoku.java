public class solveSudoku {
    public void solvesudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isSafe(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board)) return true;
                            board[i][j]='.';
                        }

                    }
                return false;

                }
            }
        }
        return true;
    }
    public boolean isSafe(char[][] board,int row,int col,char dig){
        for(int i=0;i<9;i++){
            if(board[i][col]==dig) return false;
            if(board[row][i]==dig) return false;
            
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==dig) return false;
        }
        return true;
    }
}
