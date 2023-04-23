package LightsOut;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

import LightsOut.VentanaPrincipal;

public class VentanaPrincipal extends JFrame{
	private PanelMenu panelMenu;
	private PanelTablero panelTablero;
	private PanelBotones panelBotones;
	private PanelInfo panelInfo;
	
	public VentanaPrincipal() {
		panelMenu = new PanelMenu();
		panelTablero = new PanelTablero();
		panelBotones = new PanelBotones();
		panelInfo = new PanelInfo();
		
		setLayout(new BorderLayout());
		
		add(panelMenu, BorderLayout.NORTH);
		add(panelTablero, BorderLayout.WEST);
		add(panelBotones, BorderLayout.EAST);
		add(panelInfo, BorderLayout.SOUTH);
		
		setSize(new Dimension(900,585));
		setResizable(true);
		setTitle("Lights Out");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		VentanaPrincipal vc = new VentanaPrincipal();
	}
}
