package Painting;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ToolBar extends JPanel{
	DrawingPanel drawingPanel;
	public ToolBar(DrawingPanel drawingPanel) {
		
		JButton button;
		this.drawingPanel = drawingPanel;
		
		ActionListener action = new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				String com = e.getActionCommand();
				drawingPanel.setShapeType(com);
			}
		};
		
		this.setLayout(new GridLayout(7,1));
		button = new JButton();
		button.addActionListener(action);
		button.setActionCommand("P");
		button.setBackground(Color.white);
		button.setIcon(new ImageIcon(ToolBar.class.getResource("/image/pencil.jpg")));
		add(button);
		
		button = new JButton();
		button.addActionListener(action);
		button.setActionCommand("L");
		button.setBackground(Color.white);
		button.setIcon(new ImageIcon(ToolBar.class.getResource("/image/line.png")));
		add(button);
		
		button = new JButton();
		button.addActionListener(action);
		button.setActionCommand("C");
		button.setBackground(Color.white);
		button.setIcon(new ImageIcon(ToolBar.class.getResource("/image/circle.jpg")));
		add(button);
		
		button = new JButton();
		button.addActionListener(action);
		button.setActionCommand("R");
		button.setBackground(Color.white);
		button.setIcon(new ImageIcon(ToolBar.class.getResource("/image/rectangle.jpg")));
		add(button);
		
		button = new JButton();
		button.addActionListener(action);
		button.setActionCommand("S");
		button.setBackground(Color.white);
		button.setIcon(new ImageIcon(ToolBar.class.getResource("/image/square.jpg")));
		add(button);
		
		button = new JButton();
		button.addActionListener(action);
		button.setActionCommand("E");
		button.setBackground(Color.white);
		button.setIcon(new ImageIcon(ToolBar.class.getResource("/image/eclipse.png")));
		add(button);
		
		button = new JButton();
		button.addActionListener(action);
		button.setActionCommand("Er");
		button.setBackground(Color.white);
		button.setIcon(new ImageIcon(ToolBar.class.getResource("/image/eraser.jpg")));
		add(button);
		
	}

}
