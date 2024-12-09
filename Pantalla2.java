package Calculadora.Ecuaciones;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla2 extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Pantalla2(Principal principal) {
		
        setLayout(new BorderLayout());

        setSize(1542,824);
        //parte de arriba de la calculadora
        JPanel arriba = new JPanel();
        arriba.setBackground(new Color(255, 255, 255));
        arriba.setPreferredSize(new Dimension(771, 412));
        arriba.setLayout(null);

        //logo de utc
        JLabel logoutc = new JLabel(new ImageIcon("C:\\Users\\ferna\\OneDrive\\Pictures\\Calculadora\\images.jpeg"));
        logoutc.setBounds(26, -12, 265, 247);
        arriba.add(logoutc);

        //Logo de ingenieria
        JLabel ingenieria = new JLabel(new ImageIcon("C:\\Users\\ferna\\OneDrive\\Pictures\\Calculadora\\inge.png"));
        ingenieria.setBounds(1254, 10, 278, 225);
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
        add(abajo, BorderLayout.CENTER);
                abajo.setLayout(null);
        
                //Boton para seleccionar el idipoma de español
                JButton siguiente = new JButton("SIGUIENTE ");
                siguiente.setBounds(115, 247, 245, 88);
                abajo.add(siguiente);
                siguiente.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
                siguiente.setBackground(Color.LIGHT_GRAY);
                siguiente.setForeground(Color.BLACK);
                siguiente.setPreferredSize(new Dimension(200,200));
                siguiente.setFocusPainted(false);
                                
                                        
                JButton atras = new JButton("ATRAS");                                      
                atras.setBounds(1168, 247, 222, 88);
                abajo.add(atras);                                       
                atras.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));                                       
                atras.setBackground(Color.LIGHT_GRAY);                                       
                atras.setForeground(Color.BLACK);
                atras.setPreferredSize(new Dimension(200,200));                                       
                atras.setFocusPainted(false);                                                                              
                
                JLabel lblNewLabel_1 = new JLabel("Para una resta usar: -");
                lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
                lblNewLabel_1.setBounds(56, -1, 350, 33);
                abajo.add(lblNewLabel_1);
                
                JLabel lblNewLabel_2 = new JLabel("Para una división usar: /");
                lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
                lblNewLabel_2.setBounds(56, 67, 328, 33);
                abajo.add(lblNewLabel_2);
                
                JLabel lblNewLabel_3 = new JLabel("Para una multiplicación usar: *");
                lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
                lblNewLabel_3.setBounds(56, 125, 408, 33);
                abajo.add(lblNewLabel_3);
                
                JLabel lblNewLabel_5 = new JLabel("Para el seno usar: sin()");
                lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
                lblNewLabel_5.setBounds(468, -1, 333, 33);
                abajo.add(lblNewLabel_5);
                
                JLabel lblNewLabel_6 = new JLabel("Para usar el coseno usar: cos()");
                lblNewLabel_6.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
                lblNewLabel_6.setBounds(468, 67, 333, 33);
                abajo.add(lblNewLabel_6);
                
                JLabel lblNewLabel_7 = new JLabel("Para usar la Tangente usar: tan()");
                lblNewLabel_7.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
                lblNewLabel_7.setBounds(468, 125, 368, 33);
                abajo.add(lblNewLabel_7);
                
                JLabel lblNewLabel_9 = new JLabel("Usar una conbinación de uno o mas para");
                lblNewLabel_9.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
                lblNewLabel_9.setBounds(900, 15, 461, 33);
                abajo.add(lblNewLabel_9);
                
                JLabel lblNewLabel_10 = new JLabel("escribir la ecuación diferencial. :)");
                lblNewLabel_10.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
                lblNewLabel_10.setBounds(900, 42, 465, 33);
                abajo.add(lblNewLabel_10);
                atras.addActionListener(new ActionListener() {                                           
                	@Override                                            
                	public void actionPerformed(ActionEvent e) {                                                
                		principal.verPantalla("Pantalla1");                                            
                	}                                        
                });
                siguiente.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        principal.verPantalla("Pantalla3");
                    }
                });
        add(arriba, BorderLayout.PAGE_START);
        
        JLabel lblNewLabel = new JLabel("¡FORMAS DE INGRESAR UNA ECUACIÓN DIFERENCIAL!");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 29));
        lblNewLabel.setBounds(377, 235, 762, 50);
        arriba.add(lblNewLabel);
        
        JLabel suma = new JLabel("Para una suma usar: +");
        suma.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        suma.setBounds(56, 345, 328, 33);
        arriba.add(suma);
        
        JLabel lblNewLabel_4 = new JLabel("Para una exponencial usar: e");
        lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        lblNewLabel_4.setBounds(468, 345, 333, 33);
        arriba.add(lblNewLabel_4);
        
        JLabel lblNewLabel_8 = new JLabel("Para elevar algo usar: ^");
        lblNewLabel_8.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
        lblNewLabel_8.setBounds(900, 345, 328, 33);
        arriba.add(lblNewLabel_8);
    }
}
