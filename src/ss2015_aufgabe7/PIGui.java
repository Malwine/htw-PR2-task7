package ss2015_aufgabe7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PIGui extends JFrame implements ActionListener, WindowListener, ChangeListener{
	JPanel southPanel;
	JSlider slider;
	
	private class PaintCanvas extends JPanel{
		
		@Override	
		protected void paintComponent(Graphics g) {	
			g.drawRect(20, 20, 400,	400); 				//first 2: start point; second 2: size of element 		  
			g.drawArc(20, 20, 800, 800, 90, 90);
		}
	}

	PIGui(){
		super("Calculation of PI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().add( new PaintCanvas(), BorderLayout.CENTER);
	    
		southPanel = initSouthPanel();
		this.add(southPanel, BorderLayout.SOUTH);
		
	    this.setSize(460,700);
		this.setVisible(true);
	}
	
	private JPanel initSouthPanel() {
		
		JPanel panel = new JPanel(new BorderLayout()); // HINT: von Flowlayout zu BorderLayout 
		
		//add control elements
		slider =  initJSlider();
		slider.addChangeListener(this);
		panel.add(slider, BorderLayout.NORTH);
		
		JPanel panelCenter = new JPanel(new GridLayout(3,2));
		panel.add(panelCenter, BorderLayout.CENTER);
		
		JLabel label1 = new JLabel("Anzahl Punkte:");
		label1.setBorder(new EmptyBorder(10,10,10,10));
		panelCenter.add(label1);
		
		JLabel label2 = new JLabel("Anzahl rote Punkte:");
		label2.setBorder(new EmptyBorder(10,10,10,10));
		panelCenter.add(label2);
		
		JLabel label3 = new JLabel("Anzahl blaue Punkte:");
		label3.setBorder(new EmptyBorder(10,10,10,10));
		panelCenter.add(label3);
		
		JLabel labelSouth = new JLabel("labelSouth");
		panel.add(labelSouth, BorderLayout.SOUTH);
		
		return panel;
	}

	private JSlider initJSlider(){
		JSlider pixel = new JSlider(JSlider.HORIZONTAL, 0, 30, 15);
	    pixel.addChangeListener(this);
	    pixel.setMajorTickSpacing(10);
        pixel.setMinorTickSpacing(1);
        pixel.setPaintTicks(true);
        pixel.setPaintLabels(true);
        pixel.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
        pixel.setFont(new Font("Serif", Font.ITALIC, 15));
        return pixel;
	}
	
	public static void main(String[] args) {
		new PIGui();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
