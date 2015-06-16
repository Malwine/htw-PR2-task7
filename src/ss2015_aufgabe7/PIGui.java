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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PIGui extends JFrame implements ActionListener, WindowListener, ChangeListener{
	
	private class PaintCanvas extends JPanel{
		
		@Override	
		protected void paintComponent(Graphics g) {	
			g.drawRect(20, 20, 400,	400); 				//first 2: start point; second 2: size of element 		  
			g.drawArc(20, 20, 800, 800, 90, 90);
		}
	}
	
	static final int P_MIN = 0;
    static final int P_MAX = 30;
    static final int P_INIT = 15;

	PIGui(){
		super();
		this.setTitle("Calculation of PI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().add( new PaintCanvas(), BorderLayout.CENTER);
	    
	    JSlider pixel = initJSlider();
	    
		
	    this.add(pixel, BorderLayout.SOUTH);
		this.setSize(460,700);
		this.setVisible(true);
	}
	
	private JSlider initJSlider(){
		JSlider pixel = new JSlider(JSlider.HORIZONTAL, P_MIN, P_MAX, P_INIT);
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
