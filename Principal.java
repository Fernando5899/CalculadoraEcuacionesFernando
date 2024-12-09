package Calculadora.Ecuaciones;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Principal extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private CardLayout general;
	private JPanel panel;
	
	public static void main(String[] args) { 
		SwingUtilities.invokeLater(Principal::new);
	}
	
	public Principal() {
		
		general = new CardLayout();
		panel = new JPanel(general);
		
		setTitle("¡Calculadora de ecuaciones diferenciales!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1542,824);
		setLocationRelativeTo(null);
		
		panel.add(new SeleccionIdioma(this), "Idioma");
		panel.add(new Pantalla1(this), "Pantalla1");
		panel.add(new Pantalla2(this), "Pantalla2");
		panel.add(new Pantalla3(this), "Pantalla3");
		panel.add(new Pantalla4(this), "Pantalla4");
		panel.add(new Pantalla5(this), "Pantalla5");
		panel.add(new Pantalla6(this), "Pantalla6");
		panel.add(new Pantalla7(this), "Pantalla7");
		
		add(panel);
		setVisible(true);
	}
	
	public void verPantalla(String titulo) {
		general.show(panel, titulo);
	}

}
