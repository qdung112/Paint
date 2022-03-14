package Painting;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorChooser extends JPanel{

	
	DrawingPanel drawingPanel;
	
	JRadioButton chooseFillColor;
	JRadioButton chooseDrawColor;
	
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JSlider thicknessSlider;
	
	
	public ColorChooser(DrawingPanel drawingPanel) {
		
		this.drawingPanel = drawingPanel;
		
		ChangeListener change = new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				drawingPanel.setStroke(source.getValue());
				drawingPanel.setStrokeEraser(source.getValue());
			}
		};
		
		
		
		ActionListener action = new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				String com = e.getActionCommand();
				drawingPanel.setColorType(com);
				drawingPanel.setFillType(com);
			}
		};
		
		
		panel1 = new JPanel();
	
		panel1.setPreferredSize(new Dimension(200,100));
		panel1.setLayout(new GridLayout(2,4,5,5));
		
		JButton WhiteButton = new JButton();
		WhiteButton.setBackground(Color.WHITE);
		WhiteButton.addActionListener(action);
		WhiteButton.setActionCommand("White");
		panel1.add(WhiteButton);
		
		JButton BlackButton = new JButton();
		BlackButton.setBackground(Color.BLACK);
		BlackButton.addActionListener(action);
		BlackButton.setActionCommand("Black");
		panel1.add(BlackButton);
		
		JButton RedButton = new JButton();
		RedButton.setBackground(Color.RED);
		RedButton.addActionListener(action);
		RedButton.setActionCommand("Red");
		panel1.add(RedButton);
		
		JButton GreenButton = new JButton();
		GreenButton.setBackground(Color.GREEN);
		GreenButton.addActionListener(action);
		GreenButton.setActionCommand("Green");
		panel1.add(GreenButton);
		
		JButton BlueButton = new JButton();
		BlueButton.setBackground(Color.BLUE);
		BlueButton.addActionListener(action);
		BlueButton.setActionCommand("Blue");
		panel1.add(BlueButton);
		
		JButton PinkButton = new JButton();
		PinkButton.setBackground(Color.PINK);
		PinkButton.addActionListener(action);
		PinkButton.setActionCommand("Pink");
		panel1.add(PinkButton);
		
		JButton OrangeButton = new JButton();
		OrangeButton.setBackground(Color.ORANGE);
		OrangeButton.addActionListener(action);
		OrangeButton.setActionCommand("Orange");
		panel1.add(OrangeButton);
		
		JButton YellowButton = new JButton();
		YellowButton.setBackground(Color.YELLOW);
		YellowButton.addActionListener(action);
		YellowButton.setActionCommand("Yellow");
		panel1.add(YellowButton);
		
		panel3 = new JPanel();
		chooseFillColor = new JRadioButton("Fill");
		chooseFillColor.setActionCommand("Fill");
		chooseFillColor.addActionListener(action);
		
		
		 chooseDrawColor = new JRadioButton("Draw");
		 chooseDrawColor .setActionCommand("Draw");
		 chooseDrawColor.addActionListener(action);
		 
		 ButtonGroup group = new ButtonGroup();
		 group.add(chooseFillColor);
		 group.add(chooseDrawColor);
		
		panel3.setLayout(new GridLayout(2,1));
		panel3.add(chooseFillColor);
		panel3.add(chooseDrawColor);
		
		panel4 = new JPanel();
		TitledBorder colourViewBorder = new TitledBorder("Colour");
		panel4.setBorder(colourViewBorder);
		
		panel4.setLayout(new FlowLayout());
		panel4.add(panel3);
		panel4.add(panel1);
		
		panel2 = new JPanel();
		
		thicknessSlider = new JSlider(JSlider.HORIZONTAL, 1, 5, 3);
		thicknessSlider.setName("ThicknessSlider");
		thicknessSlider.setMinorTickSpacing(1);
		thicknessSlider.setMajorTickSpacing(4);
		thicknessSlider.setPaintTicks(true);
		thicknessSlider.setPaintLabels(true);
		thicknessSlider.setSnapToTicks(true);
		thicknessSlider.setPreferredSize(new Dimension(225, 80));
		Hashtable labels = new Hashtable();
		labels.put(1, new JLabel("Thin"));
		labels.put(5, new JLabel("Thick"));
		thicknessSlider.setLabelTable(labels);
		thicknessSlider.addChangeListener(change);
		panel2.add(thicknessSlider);
		
		TitledBorder ThinknessViewBorder = new TitledBorder("ThinkNess");
	    panel2.setBorder(ThinknessViewBorder);
		
	    setLayout(new FlowLayout());
	    add(panel4);
	    add(panel2);
	    
	}

}
