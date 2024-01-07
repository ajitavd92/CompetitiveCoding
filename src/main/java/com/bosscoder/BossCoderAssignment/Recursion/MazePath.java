package com.bosscoder.BossCoderAssignment.Recursion;

public class MazePath {

	public static void main(String[] args) {
		int[][] grid = { { 0, 0, 0, 0 },
                { 0, -1, 0, 0 },
                { -1, 0, 0, 0 },
                { 0, 0, 0, 0 } };

// Calculate and print the number of unique paths with obstacles
		System.out.println(mazePath(grid,0,0));

	}
	
	public static int mazePath(int arr[][], int r, int c) {
		
		if(r==arr.length-1 && c==arr[0].length-1) return 1;
		
		if(r>=arr.length || c>=arr[0].length || arr[r][c]==-1) return 0;
		
		return mazePath(arr, r+1, c) + mazePath(arr, r, c+1);
		
	}

}
