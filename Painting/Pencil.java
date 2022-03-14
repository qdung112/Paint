package Painting;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.util.ArrayList;







 


public class Pencil extends AShape{
	ArrayList<Point> points;
	Point secondPoint;
	Point firstPoint;
	
	public Pencil(int x, int y, Color color, Stroke stroke) {
		super(x, y, color, stroke);
		points = new ArrayList<Point>();
		firstPoint = new Point(x,y);
		points.add(firstPoint);
		

	}

	
	public  void  setSecondPoint(int x, int y) {
		secondPoint = new Point(x, y);
		points.add(secondPoint);
	}
	
	@Override
	public void draw(Graphics2D g) {
		
		g.setColor(color);
		g.setStroke(stroke);
		for (int i = 0; i < points.size() - 1; i++) {
			Point p1 = points.get(i);
			Point p2 = points.get(i + 1);
			g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p2.getX(),(int) p2.getY());
		}
	}

}


