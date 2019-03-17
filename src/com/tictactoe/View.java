package com.tictactoe;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblPlayersTurn;
	private JPanel panel_1;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;

	//Create the application.
	public View() {
		initialize();
	}

	//Initialize the contents of the frame.
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 451, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblPlayersTurn = new JLabel("Player's turn");
		panel.add(lblPlayersTurn);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3,3));
		
		btn1 = new JButton();
		panel_1.add(btn1);
		
		btn2 = new JButton();
		panel_1.add(btn2);
		
		btn3 = new JButton();
		panel_1.add(btn3);
		
		btn4 = new JButton();
		panel_1.add(btn4);
		
		btn5 = new JButton();
		panel_1.add(btn5);
		
		btn6 = new JButton();
		panel_1.add(btn6);
		
		btn7 = new JButton();
		panel_1.add(btn7);
		
		btn8 = new JButton();
		panel_1.add(btn8);
		
		btn9 = new JButton();
		panel_1.add(btn9);
		
	}
	
	public void showFrame()
	{
		frame.setVisible(true);
	}

	void serBtnListeners(ActionListener arr[])
	{
		btn1.addActionListener(arr[0]);
		btn2.addActionListener(arr[1]);
		btn3.addActionListener(arr[2]);
		btn4.addActionListener(arr[3]);
		btn5.addActionListener(arr[4]);
		btn6.addActionListener(arr[5]);
		btn7.addActionListener(arr[6]);
		btn8.addActionListener(arr[7]);
		btn9.addActionListener(arr[8]);
	}
	void disableButtons()
	{
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
	}
	
	//Setters

	void setTitle(String s)
	{
		lblPlayersTurn.setText(s);
	}
	void setBtn1(char player)
	{
		btn1.setText(String.valueOf(player));
	}
	void setBtn2(char player)
	{
		btn2.setText(String.valueOf(player));
	}
	void setBtn3(char player)
	{
		btn3.setText(String.valueOf(player));
	}
	void setBtn4(char player)
	{
		btn4.setText(String.valueOf(player));
	}
	void setBtn5(char player)
	{
		btn5.setText(String.valueOf(player));
	}
	void setBtn6(char player)
	{
		btn6.setText(String.valueOf(player));
	}
	void setBtn7(char player)
	{
		btn7.setText(String.valueOf(player));
	}
	void setBtn8(char player)
	{
		btn8.setText(String.valueOf(player));
	}
	void setBtn9(char player)
	{
		btn9.setText(String.valueOf(player));
	}
}