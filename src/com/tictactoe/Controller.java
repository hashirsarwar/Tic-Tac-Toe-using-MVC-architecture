package com.tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	private Model model;
	private View view;
	private ActionListener arr[] = new ActionListener[9];
	private char player[] = {'X','O'};
	private int index = 0;
	private int turn = 0;

	//Constructor
	public Controller(Model m,View v) {
		model=m;
		view=v;
	}

	//Changes the player
	private char changePlayer()
	{
		index = index == 0 ? 1 : 0;
		turn++;
		view.setTitle("Player "+player[index]+" turn");
		return player[index];
	}

	//Displays the results and disables all the buttons
	private void showResult(char status)
	{
		if(status == 'd')
			view.setTitle("DRAW!");
		else if(status == 'X')
			view.setTitle("PLAYER X WON!");
		else 
			view.setTitle("PLAYER O WON!");
		view.disableButtons();
	}

	//Updates model data
	//compute the winner(if any) using Model's computeWinner method
	//change the player's turn by calling changePlayer() method
	private void updateModel(int r,int c)
	{
		model.serArr(r, c, player[index]);
		if(turn>3)
		{
			if(model.computeWinner(r, c, player[index]))
				showResult(player[index]);
			else if(turn == 8)
				showResult('d');
			else
				changePlayer();
		}
		else changePlayer();
	}

	//Provides action for all the buttons.
	//Upadtes View and Model on each button click.
	//Displays the frame.
	public void startGame()
	{
		view.showFrame();
		view.setTitle("Player "+player[index]+" turn");
		arr[0]=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(model.getArr(0, 0)=='\0') 
				{
					view.setBtn1(player[index]);
					updateModel(0, 0);
				}
			}
		};
		
		arr[1]=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(model.getArr(0, 1)=='\0') 
				{
					view.setBtn2(player[index]);
					updateModel(0, 1);
				}
			}
		};
		
		arr[2]=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(model.getArr(0, 2)=='\0') 
				{
					view.setBtn3(player[index]);
					updateModel(0, 2);
				}
			}
		};
		arr[3]=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(model.getArr(1, 0)=='\0') 
				{
					view.setBtn4(player[index]);
					updateModel(1, 0);
				}
			}
		};
		arr[4]=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(model.getArr(1, 1)=='\0') 
				{
					view.setBtn5(player[index]);
					updateModel(1, 1);
				}
			}
		};
		arr[5]=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(model.getArr(1, 2)=='\0') 
				{
					view.setBtn6(player[index]);
					updateModel(1, 2);
				}
			}
		};
		arr[6]=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(model.getArr(2, 0)=='\0') 
				{
					view.setBtn7(player[index]);
					updateModel(2, 0);
				}
			}
		};
		arr[7]=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(model.getArr(2, 1)=='\0') 
				{
					view.setBtn8(player[index]);
					updateModel(2, 1);
				}
			}
		};
		arr[8]=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(model.getArr(2, 2)=='\0') 
				{
					view.setBtn9(player[index]);
					updateModel(2, 2);
				}
			}
		};
		
		view.serBtnListeners(arr);
	}
}