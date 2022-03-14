package Painting;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MyFrame extends JFrame{
	ToolBar toolBar;
	DrawingPanel drawingPanel ;
	StatusBar statusBar;
	ColorChooser colorPanel;
	
	 
	JPanel panel;
	public MyFrame() {
		super("Paint");
		
		statusBar = new StatusBar();
		drawingPanel = new DrawingPanel(statusBar);
		toolBar = new ToolBar(drawingPanel);
		colorPanel = new ColorChooser(drawingPanel);
		
		 
		 
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(toolBar);
		panel.add(drawingPanel);
		add(panel, BorderLayout.CENTER);
	    add(colorPanel,BorderLayout.NORTH);
		add(statusBar, BorderLayout.SOUTH);
		

        this.pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();

	}
}


