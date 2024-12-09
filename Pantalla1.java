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

public class Pantalla1 extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Pantalla1(Principal principal) {

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
                JButton iniciar = new JButton("INICIAR");
                abajo.add(iniciar);
                iniciar.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));
                iniciar.setBackground(Color.LIGHT_GRAY);
                iniciar.setForeground(Color.BLACK);
                iniciar.setBounds(115,247,245,88);
                iniciar.setPreferredSize(new Dimension(200,200));
                iniciar.setFocusPainted(false);
                                
                                        
                JButton chat = new JButton("CHAT-GPT");                                      
                abajo.add(chat);                                       
                chat.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 30));                                       
                chat.setBackground(Color.LIGHT_GRAY);                                       
                chat.setForeground(Color.BLACK);                                                                              
                chat.setBounds(1168,247,222,88);                                        
                chat.setPreferredSize(new Dimension(200,200));                                       
                chat.setFocusPainted(false);                                                                              
                chat.addActionListener(new ActionListener() {                                           
                	@Override                                            
                	public void actionPerformed(ActionEvent e) {                                                
                		principal.verPantalla("Pantalla1");                                            
                	}                                        
                });
                iniciar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        principal.verPantalla("Pantalla2");
                    }
                });
        add(arriba, BorderLayout.PAGE_START);
        
        JLabel titulo_1 = new JLabel("¡BIENVENIDO!");
        titulo_1.setOpaque(true);
        titulo_1.setHorizontalAlignment(SwingConstants.CENTER);
        titulo_1.setPreferredSize(new Dimension(771, 412));
        titulo_1.setFont(new Font("Yu Gothic UI Semilight", Font.ITALIC, 57));
        titulo_1.setBackground(Color.WHITE);
        titulo_1.setBounds(377, 352, 753, 50);
        arriba.add(titulo_1);

    }
}
