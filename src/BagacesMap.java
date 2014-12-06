

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BagacesMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BagacesMap frame = new BagacesMap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BagacesMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0,0,0,0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton MC = new JButton("");
		MC.setOpaque(false);
		MC.setBorder(null);
		MC.setBackground(Color.PINK);
		MC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		MC.setBounds(118, 0, 124, 133);
		contentPane.add(MC);
		
		JButton MC1 = new JButton("");
		MC1.setOpaque(false);
		MC1.setBorder(null);
		MC1.setBackground(Color.PINK);
		MC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		MC1.setBounds(189, 132, 59, 23);
		contentPane.add(MC1);
		
		JButton MC3 = new JButton("");
		MC3.setOpaque(false);
		MC3.setBorder(null);
		MC3.setBackground(Color.PINK);
		MC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		MC3.setBounds(235, 0, 34, 110);
		contentPane.add(MC3);
		
		JButton MC2 = new JButton("");
		MC2.setOpaque(false);
		MC2.setBorder(null);
		MC2.setBackground(Color.PINK);
		MC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		MC2.setBounds(128, 132, 44, 23);
		contentPane.add(MC2);
		
		JButton For = new JButton("");
		For.setOpaque(false);
		For.setBorder(null);
		For.setBackground(Color.PINK);
		For.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		For.setBounds(266, 11, 164, 144);
		contentPane.add(For);
		
		JButton For2 = new JButton("");
		For2.setOpaque(false);
		For2.setBorder(null);
		For2.setBackground(Color.PINK);
		For2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		For2.setBounds(303, 155, 50, 98);
		contentPane.add(For2);
		
		JButton BA = new JButton("");
		BA.setOpaque(false);
		BA.setBorder(null);
		BA.setBackground(Color.PINK);
		BA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		BA.setBounds(21, 155, 284, 395);
		contentPane.add(BA);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Guanacaste\\Bagaces.JPG"));
		lblNewLabel.setBounds(0, 0, 485, 550);
		contentPane.add(lblNewLabel);
	}
}
