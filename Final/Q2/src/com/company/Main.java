package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] grid = {
                {"1","1","1","1","0"},
                {"1","1","0","1","0"},
                {"1","1","0","0","0"},
                {"0","0","0","0","0"}
        };
        System.out.println(numberOfIsland(grid));
	// write your code here
    }
    //time complexity is O(n^2)
    public static int numberOfIsland(String[][] matrix){
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (matrix[i][j].equals("1") && visited[i][j] == false){
                    count ++;
                    islandVisited(matrix, visited, i, j);
                }
            }
        }
        return count;
    }
    private static void islandVisited(String[][] matrix, boolean[][] visited, int row, int col){
        int maxRow = matrix.length;
        int maxCol = matrix[0].length;

        if(row < 0 || col < 0 || row >= maxRow || col >= maxCol || matrix[row][col].equals("0") || visited[row][col] == true){
            return;
        }
        visited[row][col] = true;
        islandVisited(matrix, visited, row-1, col);
        islandVisited(matrix, visited, row, col-1);
        islandVisited(matrix, visited, row, col+1);
        islandVisited(matrix, visited, row+1, col);

    }

}
