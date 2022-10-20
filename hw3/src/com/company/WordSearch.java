package com.company;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(word.charAt(0)==board[i][j] && search(board,word,0,i,j))
                    return true;
            }
        }
        return false;
    }

    public boolean search(char[][] board, String word, int index, int i, int j){
        if(word.length() <= index)
            return true;

        if(i<0 ||j<0 || i>=board.length || j>=board[0].length || board[i][j]=='0' || board[i][j]!=word.charAt(index))
            return false;

        char temp = board[i][j];
        board[i][j] = '0';

        if(search(board,word,index+1,i+1,j) ||
                search(board,word,index+1,i-1,j) ||
                search(board,word,index+1,i,j+1) ||
                search(board,word,index+1,i,j-1))
            return true;

        board[i][j] = temp;

        return false;
    }
}
