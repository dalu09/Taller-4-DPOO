package LightsOut;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelBotones extends JPanel {
	private JButton btnNew;
	private JButton btnRestart;
	private JButton btnTop;
	private JButton btnPlayer;
	
	public PanelBotones() {
		setLayout(new GridLayout(4,1));
		
		btnNew = new JButton("NUEVO");
		btnNew.setPreferredSize(new Dimension(180, 10));
		btnNew.setBackground(new Color(0, 169, 224));
		btnNew.setForeground(Color.WHITE);
		
		btnRestart = new JButton("REINICIAR");
		btnRestart.setPreferredSize(new Dimension(180, 10));
		btnRestart.setBackground(new Color(0, 169, 224));
		btnRestart.setForeground(Color.WHITE);
		
		btnTop = new JButton("TOP-10");
		btnTop.setPreferredSize(new Dimension(180, 10));
		btnTop.setBackground(new Color(0, 169, 224));
		btnTop.setForeground(Color.WHITE);
		
		btnPlayer = new JButton("Cambiar Jugador");
		btnPlayer.setPreferredSize(new Dimension(180, 10));
		btnPlayer.setBackground(new Color(0, 169, 224));
		btnPlayer.setForeground(Color.WHITE);
		
		add(btnNew);
		add(btnRestart);
		add(btnTop);
		add(btnPlayer);
	}
	
	

}
