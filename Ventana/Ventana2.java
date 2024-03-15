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

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Ventana2 frame2;
	private JTextField texto2;

	public JTextField getTexto2() {
		return texto2;
	}

	public void setTexto2(JTextField texto2) {
		this.texto2 = texto2;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 = new Ventana2();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta2 = new JLabel("Hola");
		etiqueta2.setFont(new Font("Tahoma", Font.BOLD, 13));
		etiqueta2.setBounds(37, 77, 98, 20);
		contentPane.add(etiqueta2);
		
		texto2 = new JTextField();
		texto2.setEditable(false);
		texto2.setBounds(169, 78, 128, 20);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		JButton boton2 = new JButton("Volver");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				Ventana1.frame1.setVisible(true);
			}
		});
		boton2.setBounds(153, 180, 89, 23);
		contentPane.add(boton2);
	}

}
