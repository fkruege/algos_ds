package leetcode;

import java.util.Arrays;

/**
 * Created by fkruege on 2/20/17.
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {

        int size = 0;
        for(int i=0; i < board.length; i++){
            size += board[i].length;
        }

        char[] d1Board = new char[size];

        int d1Index = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                d1Board[d1Index++] = board[i][j];
            }
        }


        Arrays.sort(d1Board);

        for(int i = 0; i < word.length(); i++){
            char aChar = word.charAt(i);
            int index = Arrays.binarySearch(d1Board, aChar);
            if(index >= 0){
                d1Board[index] = Character.MIN_VALUE;
                Arrays.sort(d1Board);
            }else{
                return false;
            }
        }

        return true;

    }
}
