package Calculadora.Ecuaciones;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SeleccionIdioma extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public SeleccionIdioma(Principal principal) {

        setLayout(new BorderLayout());

        //parte de arriba de la calculadora
        JPanel arriba = new JPanel();
        arriba.setBackground(new Color(255, 255, 255));
        arriba.setPreferredSize(new Dimension(771, 412));
        arriba.setLayout(null);

        //logo de utc
        JLabel logoutc = new JLabel(new ImageIcon("C:\\Users\\ferna\\OneDrive\\Pictures\\Calculadora\\images.jpeg"));
        logoutc.setBounds(26, -12, 272, 279);
        arriba.add(logoutc);

        //Logo de ingenieria
        JLabel ingenieria = new JLabel(new ImageIcon("C:\\Users\\ferna\\OneDrive\\Pictures\\Calculadora\\inge.png"));
        ingenieria.setBounds(1220, 10, 312, 255);
        arriba.add(ingenieria);

        //Titulo de calculadora de ecuaciones diferenciales
        JLabel titulo = new JLabel("¡CALCULADORA DE ECUACIONES DIFERENCIALES!");
        titulo.setBounds(377, 112, 753, 50);
        titulo.setFont(new Font("Yu Gothic UI Semilight", Font.ITALIC, 32));
        titulo.setOpaque(true);
        titulo.setBackground(new Color(255, 255, 255));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        arriba.add(titulo);

        //Parte de abajo de la calculadora
        JPanel abajo = new JPanel();
        abajo.setBackground(new Color(255, 255, 255));
        abajo.setPreferredSize(new Dimension(771,412));
        add(abajo, BorderLayout.SOUTH);
        abajo.setLayout(null);
        
                //Boton para seleccionar el idipoma de español
                JButton espanol = new JButton("ESPAÑOL");
                abajo.add(espanol);
                espanol.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
                espanol.setBackground(Color.LIGHT_GRAY);
                espanol.setForeground(Color.BLACK);
                espanol.setBounds(110,310,200,50);
                espanol.setPreferredSize(new Dimension(200,200));
                espanol.setFocusPainted(false);
                
                        //Texto de seleccione idioma en español
                        JLabel texto1 = new JLabel("¡Seleccione el idioma!");
                        texto1.setForeground(new Color(0, 0, 0));
                        abajo.add(texto1);
                        texto1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
                        texto1.setOpaque(true);
                        texto1.setBackground(new Color(255, 255, 255));
                        texto1.setHorizontalAlignment(SwingConstants.CENTER);
                        texto1.setBounds(53,250,317,50);
                        
                                //Texto de seleccione idioma en nahuatl
                                JLabel texto2 = new JLabel("Dialogo provicional");
                                abajo.add(texto2);
                                texto2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
                                texto2.setOpaque(true);
                                texto2.setBackground(new Color(255, 255, 255));
                                texto2.setHorizontalAlignment(SwingConstants.CENTER);
                                texto2.setBounds(1118,250,350,50);
                                
                                        JButton nahuatl = new JButton("NAHUATL");
                                        abajo.add(nahuatl);
                                        nahuatl.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
                                        nahuatl.setBackground(Color.LIGHT_GRAY);
                                        nahuatl.setForeground(Color.BLACK);
                                        nahuatl.setBounds(1197,310,190,50);
                                        nahuatl.setPreferredSize(new Dimension(200,200));
                                        nahuatl.setFocusPainted(false);
                                        
                                        JLabel texto2_1 = new JLabel("Select the language!");
                                        texto2_1.setOpaque(true);
                                        texto2_1.setHorizontalAlignment(SwingConstants.CENTER);
                                        texto2_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
                                        texto2_1.setBackground(new Color(255, 255, 255));
                                        texto2_1.setBounds(575, 250, 350, 50);
                                        abajo.add(texto2_1);
                                        
                                        JButton ingles = new JButton("ENGLISH");
                                        ingles.addActionListener(new ActionListener() {
                                        	@Override
                                        	public void actionPerformed(ActionEvent e) {
                                        		principal.verPantalla("Pantalla4");
                                        	}
                                        });
                                        ingles.setPreferredSize(new Dimension(200, 200));
                                        ingles.setForeground(Color.BLACK);
                                        ingles.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
                                        ingles.setFocusPainted(false);
                                        ingles.setBackground(Color.LIGHT_GRAY);
                                        ingles.setBounds(646, 310, 200, 50);
                                        abajo.add(ingles);
                                        nahuatl.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                principal.verPantalla("Pantalla1N");
                                            }
                                        });
                espanol.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        principal.verPantalla("Pantalla1");
                    }
                });
        add(arriba, BorderLayout.PAGE_START);
    }
}