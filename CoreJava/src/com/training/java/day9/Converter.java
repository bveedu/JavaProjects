package com.training.java.day9;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Converter extends JFrame implements ActionListener{

	private JLabel label=new JLabel("Distance in Miles");
	private JTextField input =new JTextField(6);
	
	private JTextArea display= new JTextArea(10,20);
	private JButton button =new JButton("Convert");
	public Converter(){
		Container pane =getContentPane();
	    pane.setLayout(new FlowLayout());
		//pane.setLayout(new GridLayout(2,2));
		//pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
		pane.add(label);
		pane.add(input);
		pane.add(button);
		pane.add(display);
		display.setLineWrap(true);
		display.setEditable(true);
		button.addActionListener(this);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter con=new Converter();
		con.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con.setSize(800,300);
		//con.pack();
		con.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {
		double miles =Double.valueOf(input.getText());
		double km=miles*1.65;
		display.append(miles +" miles equals "+km +" Kilometers\n");
		
	}

}
