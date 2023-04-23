package LightsOut;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class PanelTablero extends JPanel{
	private cuadrado cuadrado;
	
	public PanelTablero() {
		setLayout(new GridLayout(3,3));
		setPreferredSize(new Dimension(400, 400));
		setVisible(true);
		
		cuadrado = new cuadrado();
		
		add(cuadrado);
	}
	
}
