package LightsOut;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenu extends JPanel{
	private JComboBox tam;
	private CheckboxGroup radio;
	private JLabel lbTama�o; 
	private JLabel lbDificultad;
	
	public PanelMenu() {
		/*JPanel spaceholder = new JPanel();
		spaceholder.setBackground(new Color(91, 154, 212));
		spaceholder.setPreferredSize(new Dimension(100, 185));*/
		
		String tama�os[]= {"3x3","4x4","5x5"};
		tam = new JComboBox(tama�os);
		radio = new CheckboxGroup();
		
		lbTama�o = new JLabel("Tama�o:");
		lbTama�o.setPreferredSize(new Dimension(60, 20));
		lbTama�o.setFont(new Font("Arial", Font.BOLD, 14));
		
		lbDificultad = new JLabel("Dificultad:");
		lbDificultad.setPreferredSize(new Dimension(70, 20));
		lbDificultad.setFont(new Font("Arial", Font.BOLD, 14));
		
		/*add(spaceholder);*/
		add(lbTama�o);
		add(tam);
		add(lbDificultad);
		add( new Checkbox( "F�cil",radio,true) );
        add( new Checkbox( "Medio",radio,false) );
        add( new Checkbox( "Dif�cil",radio,false) );
        
		
	}
	
	
}
