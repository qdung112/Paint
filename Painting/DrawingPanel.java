package Painting;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class DrawingPanel extends JPanel {
	StatusBar statusBar;
	String shapeType="";
	String Colortype="";
	String fill ="";
	Color color = Color.BLACK;
	Color colorWhite = Color.WHITE;
	Boolean filled = false;
	 
	 
    Stroke stroke = new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
    Stroke strokeEraser = new BasicStroke(30, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
	AShape lastShape;
    List<AShape> shapes;
    
 public void setStrokeEraser(int w) {
    	
		this.strokeEraser = new BasicStroke((w+2)*6, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
	}
    
    public void setStroke(int w) {
    	
		this.stroke = new BasicStroke(w, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
	}
    
   
	
	public DrawingPanel(StatusBar statusBar) {
		this.statusBar = statusBar;
		shapes = new ArrayList<AShape>();
		setPreferredSize(new Dimension(700,500));
		
		
	
		
		MouseAdapter mouse = new MouseAdapter() {

			
		@Override
			public void mousePressed(MouseEvent e) {
				setfill();
				setColor();
				
				switch (shapeType) {
				
				case "P" : lastShape = new Pencil(e.getX(), e.getY(), color,stroke);
					shapes.add(lastShape);
					   break;	  

				case "C": lastShape = new Circle(e.getX(), e.getY(), color,stroke,filled);
					shapes.add(lastShape);
					   break;
					
				case "L": lastShape = new Line(e.getX(), e.getY(), color, stroke);
					shapes.add(lastShape);
                       break;
				         
				case "R" : lastShape = new Rectangle(e.getX(), e.getY(),color,getWidth(),getHeight(),stroke,filled);
					shapes.add(lastShape);
	                   break;
	                   
				case "S" : lastShape = new Square(e.getX(), e.getY(),color,getWidth(),getHeight(),stroke,filled);
					shapes.add(lastShape);
					   break;
					   
				case "E" : lastShape = new Eclipse(e.getX(), e.getY(),color,getWidth(),getHeight(),stroke,filled);
					shapes.add(lastShape);
					   break;
					   
				case "Er" : lastShape = new Eraser(e.getX(), e.getY(),colorWhite,strokeEraser);
					shapes.add(lastShape);
				       break;
				}					
				repaint();
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				setfill();
				setColor();
				
				lastShape.setSecondPoint(e.getX(), e.getY());
				repaint();
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			
				lastShape.setSecondPoint(e.getX(), e.getY());
				lastShape = null;
		
			   }
			public void mouseMoved( MouseEvent e )
	        {
				setfill();
				setColor();
				
				switch (shapeType) {
			case "P" : Pencil p = new Pencil(e.getX(),e.getY(),color,stroke);
				shapes.add(p);
					break;
					
			case "Er" : lastShape = new Eraser(e.getX(), e.getY(),colorWhite,strokeEraser);
				shapes.add(lastShape);
					break;	 
						
				}
				repaint();
	            statusBar.setX(String.valueOf(e.getX()));
	            statusBar.sety(String.valueOf(e.getY()));
	        } 
		};
		addMouseListener(mouse);
		addMouseMotionListener(mouse);
	}

	
	public void paintComponent(Graphics g) {
		setBackground(Color.white);
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		for(AShape sh:shapes) {
			
			sh.draw(g2d);
	}
	}
	
	public void setShapeType(String type) {
		this.shapeType = type;
		
		switch (type) {
		case "L": this.statusBar.setMessage("Line");
			break;
		case "C": this.statusBar.setMessage("Circle");
			break;
		case "R": this.statusBar.setMessage("Rectangle");
			break;
		case "S": this.statusBar.setMessage("Square");
		  	break;
		case "P": this.statusBar.setMessage("Pencil");
		  	break;
		case "E": this.statusBar.setMessage("Eclipse");
		  	break;
		case "Er": this.statusBar.setMessage("Eraser");
			break;
		}
	}
	public void setColorType(String type) {
		this.Colortype = type;
	switch (type) {
	case "Black": this.statusBar.setcolor("Black");
		break;
	case "White":  this.statusBar.setcolor("White");
		break;
	case "Red":  this.statusBar.setcolor("Red");
		break;
	case "Blue":  this.statusBar.setcolor("Blue");
	  	break;
	case "Green": this.statusBar.setcolor("Green");
		break;
	case "Pink":  this.statusBar.setcolor("Pink");
	  	break;
	case "Orange":  this.statusBar.setcolor("Orange");
	  	break;
	case "Yellow":  this.statusBar.setcolor("Yellow");
	  	break;
	}
	}
	
	public void setColor() {
		switch (Colortype) {
		case "Black" : 
			color = Color.BLACK;
		break;
		case "White" : 
			color = Color.WHITE;
		break;
		case "Red" : 
			color = Color.RED;
		break;
		case "Blue" : 
			color = Color.BLUE;
		break;
		case "Green" : 
			color = Color.GREEN;
		break;
		case "Pink" : 
			color = Color.PINK;
		break;
		case "Orange" : 
			color = Color.ORANGE;
		break;
		case "Yellow" : 
			color = Color.YELLOW;
		break;
		
		}
	}
	public void setFillType(String type) {
		this.fill = type;
		}
	public void setfill() {
		switch (fill) {
		case "Fill" : 
			filled = true;
		break;
		case "Draw":
			filled = false;
			break;
	}
		
	}
	
}

