package Painting;

import java.awt.Color;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;

public class Line extends AShape{
	Point secondPoint;
	public Line(int x, int y, Color color,Stroke stroke) {
		super(x, y, color, stroke);
		secondPoint = new Point(x, y);
	}

	@Override
	public void setSecondPoint(int x, int y) {
		this.secondPoint.setLocation(x, y);		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.setStroke(stroke);
		g.drawLine(location.x, location.y,secondPoint.x,secondPoint.y);
		
	}

}
