package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(obstacle(obstacleGrid));
	// write your code here
    }
    public static int obstacle(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        matrix[0][0] = 1;
        for (int i=0;i<rows;i++){
            matrix[i][0] = matrix[i-1][0] == Integer.MIN_VALUE ? Integer.MIN_VALUE : 1;
        }
        for (int i=0;i<cols;i++){
            if (matrix[0][i] == Integer.MIN_VALUE){
                continue;
            }
            matrix[0][i] = matrix[0][i-1] == Integer.MIN_VALUE ? Integer.MIN_VALUE : 1;
        }
        for (int i=1;i<rows;i++){
            for (int j=1;j<cols;j++){
                if (matrix[i-1][j] == Integer.MIN_VALUE){
                    matrix[i][j] = matrix[i][j-1];
                } else if (matrix[i][j-1] == Integer.MIN_VALUE){
                    matrix[i][j] = matrix[i-1][j];
                } else {
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
                }
            }
        }
        return matrix[rows-1][cols-1];
    }
}
