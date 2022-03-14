package Painting;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;






public abstract class AShape {
	protected Point location;
	protected Color color;
	protected Stroke stroke;
	protected Boolean fill = false;
	
	public AShape(int x, int y, Color color,Stroke stroke, boolean fill) {
		this.location = new Point(x,y);
		this.color = color;
		this.stroke = stroke;
		this.fill = fill;
	}
	
    public AShape(int x, int y, Color color, Stroke stroke) {
		this.location = new Point(x,y);
		this.color = color;
		this.stroke = stroke;
	}
    
    
    public Stroke getStroke() {
		return stroke;
	}


	public void setStroke(Stroke stroke) {
		this.stroke = stroke;
	}


	public Boolean getFilled() {
		return fill;
	}
	

	public void setFilled(Boolean fill) {
		this.fill = fill;
	}


	public abstract void  setSecondPoint(int x, int y);
	public abstract void draw(Graphics2D g);
}
