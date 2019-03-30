package com.tictactoe;

public class Model {

	private char arr[][];
	private boolean winner_v=false,winner_h=false,winner_d=false;
	
	//Constructor
	Model()
	{
		arr=new char[3][3];
	}

	//Setter
	void serArr(int row,int col,char entry)
	{
		arr[row][col]=entry;
	}

	//Getter
	char getArr(int row,int col)
	{
		return arr[row][col];
	}
	
	//Function to check if there is any winner
	boolean computeWinner(int row,int col,char entry)
	{
		Thread verticalCheck = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<3;i++)
				{
					if(arr[i][col]==entry)
						winner_v=true;
					else {
						winner_v=false;
						break;
					}
				}
			}
		});
		Thread horizontalCheck = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<3;i++)
				{
					if(arr[row][i]==entry)
						winner_h=true;
					else {
						winner_h=false;
						break;
					}
				}
			}
		});
		Thread diagonalCheck = new Thread(new Runnable() {
			
			@Override
			public void run() {
				if((row==0 && col==0)||(row==2 && col==2)||(row==1 && col==1))
				{
					for(int i=0;i<3;i++)
					{
						if(arr[i][i]==entry)
							winner_d=true;
						else {
							winner_d=false;
							break;
						}
					}
				}
				if((row==0 && col==2)||(row==2 && col==0)||(row==1 && col==1))
				{
					for(int i=2,j=0;i>=0;i--,j++)
					{
						if(arr[i][j]==entry)
							winner_d=true;
						else {
							winner_d=false;
							break;
						}
					}
				}
			}
		});
		diagonalCheck.start();
		verticalCheck.start();
		horizontalCheck.start();
		try 
		{
			horizontalCheck.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		if(winner_v==false && winner_d==false && winner_h==false)
			return false;
		else 
			return true;
	}
}
