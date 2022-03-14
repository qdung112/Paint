package Painting;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;

public class Rectangle extends AShape{


	protected  double  width;
	protected  double height;
	static int getx;
	static int gety;
	Point secondPoint;

	public Rectangle(int x, int y, Color color, double width, double height,Stroke stroke, boolean filled) {
		super(x, y, color, stroke, filled);
		secondPoint = new Point(x, y);
	
	}

	@Override
	public void setSecondPoint(int x, int y) {
		this.secondPoint.setLocation(x, y);
		}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw(Graphics2D g) {
		getx=Math.min(location.x,secondPoint.x);
		gety=Math.min(location.y,secondPoint.y);
	 width = Math.abs(secondPoint.x-location.x);
	height = Math.abs(secondPoint.y-location.y);
	
		g.setColor(color);
		g.setStroke(stroke);
		 if (getFilled()) {
				g.fillRect(getx, gety,(int)getWidth(),(int)getHeight());}
		 else
			 g.drawRect(getx, gety,(int)getWidth(),(int)getHeight());
	}

	}

