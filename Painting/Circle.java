package Painting;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class Circle extends AShape {
	int radius;
	public Circle(int x, int y, Color color,Stroke stroke,
	 Boolean fill ) {
		super(x, y, color,  stroke, fill);
		radius = 1;
	}
	

	@Override
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.setStroke(stroke);
		if ( getFilled()) {
			g.fillOval(location.x-radius, location.y-radius, 2*radius,2*radius);
		}
			else {
				g.drawOval(location.x-radius, location.y-radius, 2*radius,2*radius);
		}
		
	
	}


	@Override
	public void setSecondPoint(int x, int y) {
		radius = (int) Math.sqrt((location.x-x)*(location.x-x) + (location.y-y)*(location.y-y));		
	}

}
