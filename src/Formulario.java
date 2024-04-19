//Código resumido para pintar un JButton encima de un dibujo de Graphics

import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;
import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener{
	
	public JButton boton1;    //Instanciamos el boton como GLOBAL para poder llamarle en el método 'paint'
	public int num1;
	
	public Formulario() {
		setTitle("@jotaa_loud");
		setLayout(null);
		
		boton1= new JButton("Paint");
		boton1.addActionListener(this);     //Ponemos las coordenadas sólo en el método paint para ahorrar código
		add(boton1);
                         
		num1=0;  //Inicializamos la variable a 0 para que de negativo
		
	}
	
	
	public void paint(Graphics g) {
		
		super.paint(g);
		g.setColor(Color.red);
		g.fillRect(20, 20, 200, 160);
		
		if(num1==1) {                       //Si clickamos en el boton, se dibuja un cuadrado negro
			g.setColor(Color.black);
			g.fillRect(40, 50, 150, 100);
			
		}

		add(boton1);                      //Volvemos a añadir el botón, después/encima del cuadrado(No vale sólo con el setBounds)
		boton1.setBounds(60,50,80,30);    
		
	}
	
	
public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== boton1) {
			num1=1;                      //Si clickamos en el boton, la variable se pone a ON y repinta(El cuadrado ahora será negro)
			repaint();
		}
		
	}
	
	
	public static void main(String[]args) {
		Formulario fm= new Formulario();
		fm.setBounds(0,0,300,220);
		fm.setVisible(true);
	}
}