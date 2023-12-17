package com.Pratice;

public class Suduko {

	private static final int board_size=9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board= {
				{5,3,0,0,0,0,0,0,0},
				{0,8,0,0,4,0,0,0,0},
				{0,0,1,0,5,0,8,0,0},
				{0,0,9,0,0,0,0,0,0},
				{0,0,2,0,8,0,0,0,0},
				{0,7,0,0,0,1,0,0,0},
				{0,0,4,0,0,0,5,0,0},
				{0,0,0,3,0,0,0,0,0},
				{0,1,0,0,0,6,0,7,0}
		};
		boolean done=solve(board);
		if(done) {
			System.out.println("sucess");
		}
		else {
			System.out.print("unsucessfull");
		}
		for(int row=0;row<board_size;row++) {
			if(row%3==0&&row!=0) {
				System.out.println("_________");
			}
			for(int col=0;col<board_size;col++) {
				if(col%3==0&&col!=0) {
					System.out.print("|");
				}
				System.out.print(board[row][col]);
			}
			System.out.println();
		}
	}

	private static boolean solve(int[][] board)
	{
		for(int row=0;row<board_size;row++) 
		{
			for(int col=0;col<board_size;col++)
			{
				if(board[row][col]==0) 
				{
					
				for(int num=1;num<=board_size;num++) 
				{
					if(validate(board,num, row, col)) 
						
					{
						 board[row][col] = num;
						if(solve(board)) {
						return true;
					}
						else {
			                board[row][col] = 0;
			              }
					}
				
					
				}

				return false;
				}
	
			}
		}
		return true;
		
	}
	private static boolean validate(int [][] board, int num, int row, int col) {
		return (!rowValidate(board,num,row))&&(! colValidate(board,num,col))&&(!boxValidate(board,num,row,col));
	}
	
	
	private static boolean boxValidate(int[][] board, int num, int row, int col) {
		 int localBoxRow = row - row % 3;
		    int localBoxColumn = col - col % 3;
		    
		    for (int i = localBoxRow; i < localBoxRow + 3; i++) {
		      for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
		        if (board[i][j] == num) {
		          return true;
		        }
		      }
		    }
		    return false;
	}

	private static boolean colValidate(int[][] board, int num, int col) {
		for(int row=0;row<board_size;row++) {
			if(board[row][col]==num) {
				return true;
			}
		}
		return false;
	}

	private static boolean rowValidate(int[][] board,int num,int row) {

		for(int col=0;col<board_size;col++) {
			if(board[row][col]==num) {
				return true;
			}
		}
		return false;
		
	}
}
