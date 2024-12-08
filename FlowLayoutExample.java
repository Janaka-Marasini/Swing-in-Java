package com.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample {
	public static void main(String[]args) {
		JFrame frame=new JFrame("flowlayoutExample");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		frame.add(new JButton ("button 1"));
		frame.add(new JButton ("button 2"));
		frame.add(new JButton ("button 3"));
		frame.add(new JButton ("button 4"));
		frame.add(new JButton ("button 5"));
		frame.setVisible(true);
	}
}
