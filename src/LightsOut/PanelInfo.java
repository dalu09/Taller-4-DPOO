package LightsOut;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelInfo extends JPanel {
	private JTextField txtjugadas;
	private JTextField txtjugador;
	private JLabel jugadas;
	private JLabel jugador;
	
	public PanelInfo() {
		
		txtjugadas = new JTextField("");
		txtjugadas.setPreferredSize(new Dimension(50, 20));
		
		txtjugador = new JTextField("");
		txtjugador.setPreferredSize(new Dimension(50, 20));
		
		jugadas = new JLabel("Jugadas:");
		jugadas.setPreferredSize(new Dimension(52, 20));
		
		jugador = new JLabel("Jugador:");
		jugador.setPreferredSize(new Dimension(50, 20));
		
		add(jugadas);
		add(txtjugadas);
		add(jugador);
		add(txtjugador);
	}
}
