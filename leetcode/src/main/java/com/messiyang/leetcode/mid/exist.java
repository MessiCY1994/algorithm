package com.messiyang.leetcode.mid;

/**
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。
 * 如果 word 存在于网格中，返回 true ；否则，返回 false 。
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/22 10:17 下午
 */
public class exist {
    public boolean exist(char[][] board, String word) {
        if (board == null) return false;
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        char[] words = word.toCharArray();
        for (int i = 0; i < m; i++){
            for(int j=0;j<n;j++){
               if(board[i][j]==words[0]){
                   if(backtracking(board,words,i,j,0,visited)){
                       return true;
                   }
                }
            }
        }
        return false;
    }

    public  boolean backtracking(char[][] board,char[] words,int m,int n,int k,boolean[][] visited){
        if(board[m][n]==words[k]){
            visited[m][n] = true;
            if(k==words.length-1||
                    (n>0&&!visited[m][n-1]&&backtracking(board,words,m,n-1,k+1,visited))||
                    (m>0&&!visited[m-1][n]&&backtracking(board,words,m-1,n,k++,visited))||
                    (n<board[0].length-1&&visited[m][n+1]&&backtracking(board,words,m,n+1,k+1,visited))||
                    (m<board.length-1&&!visited[m+1][n]&&backtracking(board,words,m+1,n,k+1,visited))
            )
            visited[m][n] = false;

        }
        return false;
    }

    public static void main(String[] args) {
        char[] temp = new char[]{1,2,3};
        System.out.println(temp.length);
    }
}
