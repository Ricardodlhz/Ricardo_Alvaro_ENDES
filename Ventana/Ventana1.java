package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Ventana1 frame1;
	private JTextField texto1;
	

	public JTextField getTexto1() {
		return texto1;
	}

	public void setTexto1(JTextField texto1) {
		this.texto1 = texto1;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new Ventana1();
					frame1.setVisible(true);
					Ventana2.frame2=new Ventana2();
					Ventana2.frame2.setVisible(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Dime tu nombre");
		etiqueta1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		etiqueta1.setBounds(25, 69, 108, 36);
		contentPane.add(etiqueta1);
		
		texto1 = new JTextField();
		texto1.setFont(new Font("Verdana", Font.BOLD, 13));
		texto1.setBounds(200, 78, 172, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		JButton boton1 = new JButton("Enviar");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				Ventana2.frame2.setVisible(true);
				Ventana2.frame2.getTexto2().setText(texto1.getText());
				
			}
		});
		boton1.setBounds(148, 173, 108, 23);
		contentPane.add(boton1);
	}
}
