package ss2015_aufgabe7;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PIGui extends JFrame {
	
	private class PaintCanvas extends JPanel{
		
		@Override	
		protected void paintComponent(Graphics g) {	
			g.drawRect(20, 20, 400,	400); 				//first 2: start point; second 2: size of element 		  
			g.drawArc(20, 20, 800, 800, 90, 90);
		}
	}

	PIGui(){
		super();
		this.setTitle("Calculation of PI");
		getContentPane().add( new PaintCanvas(), BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(460,600);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new PIGui();
	}

}
