package LightsOut;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class cuadrado extends JPanel{
	public void tablero() {
		setSize(new Dimension(100,100));
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		//RECTANGULOS
		Rectangle2D.Double rectangulo1 = new Rectangle2D.Double(5,5,100,100);
		
		//YELLOW
		g2d.setColor(Color.YELLOW);
		g2d.draw(rectangulo1);
		g2d.fill(rectangulo1);
		
		g2d.setColor(Color.BLUE);
		
	}
}
