package Painting;
import java.awt.GridLayout;

import javax.swing.*;
public class StatusBar extends JPanel{
	JLabel shape;
	JLabel color;
	JLabel getX;
	JLabel gety;
	public StatusBar() {
		shape = new JLabel("Shape");
		
		color = new JLabel("Color");
		getX = new JLabel("0", JLabel.RIGHT);
		gety  = new JLabel("0", JLabel.RIGHT);
	
		setLayout(new GridLayout(1,4));
		add(shape);
		add(color);
		add(getX);
		add(gety);
	}
	
	public void setMessage(String text) {
		
		this.shape.setText("Shape: "+text);
	}
	
	public void setcolor(String text) {
		color.setText("Color: "+text);
	}
	
	public void setX(String text) {
		getX.setText("X: " + text);
	}
	
    public void sety(String text) {
	gety.setText("Y: " +text);
	    }
}
