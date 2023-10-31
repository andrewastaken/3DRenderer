package display;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Frame()
	{
		setContentPane(new Panel());	
		setBackground(Color.BLACK);
		setTitle(".");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args)
	{
		new Frame();
	}
}
