package lc_1000.lc794;

public class Solution {
    public boolean validTicTacToe(String[] board) {
        int a=0,b=0,c1=0,c2=0,d=0;
        for(int i=0;i<3;i++){
            if(board[i].equals("XXX")){
                ++c1;
            }
            else if(board[i].equals("OOO")){
                ++c2;
            }
            for(int j=0;j<3;j++){
                if(board[i].charAt(j)=='X'){
                    ++a;
                }
                else if(board[i].charAt(j)=='O'){
                    ++b;
                }
            }
        }
        for(int j=0;j<3;j++){
            if(board[0].charAt(j)=='X' && board[1].charAt(j)=='X' &&board[2].charAt(j)=='X'){
                ++c1;
            }
            else if(board[0].charAt(j)=='O' && board[1].charAt(j)=='O' &&board[2].charAt(j)=='O'){
                ++c2;
            }
        }
        if(board[0].charAt(0)=='X' && board[1].charAt(1)=='X' &&board[2].charAt(2)=='X'){
            ++c1;
            ++d;
        }
        else if(board[0].charAt(0)=='O' && board[1].charAt(1)=='O' &&board[2].charAt(2)=='O'){
            ++c2;
            ++d;
        }
        if(board[0].charAt(2)=='X' && board[1].charAt(1)=='X' &&board[2].charAt(0)=='X'){
            ++c1;
            ++d;
        }
        else if(board[0].charAt(2)=='O' && board[1].charAt(1)=='O' &&board[2].charAt(0)=='O'){
            ++c2;
            ++d;
        }
        if(a<b || a-b>1){
            return false;
        }
        if(a==b && c1>=1){
            return false;
        }
        if(a>b && c2>=1){
            return false;
        }
        if(a+b==9 && c1==2 || a+b==9 && c2==2){
            return true;
        }
        if(d==0 && c1+c2>1 || d>0 &&c1+c2-d>0){
            return false;
        }
        return true;
    }
}
