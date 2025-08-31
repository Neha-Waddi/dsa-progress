import java.util.HashSet;
import java.util.Set;

public class validSudoku {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            Set<Character> seen=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && !seen.add(board[i][j])){
                    return false;
                }
            }
        }
        for(int i=0;i<9;i++){
            Set<Character> seen=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]!='.' && !seen.add(board[j][i])){
                    return false;
                }
            }
        }
        for(int i=0;i<9;i++){
            Set<Character> seen=new HashSet<>();
            for(int j=0;j<9;j++){
                int r=3*(i/3)+(j/3);
                int c=3*(i%3)+(j%3);
                if(board[r][c]!='.' && !seen.add(board[r][c])){
                    return false;
                }
            }
        }
        return true;
    }
}
