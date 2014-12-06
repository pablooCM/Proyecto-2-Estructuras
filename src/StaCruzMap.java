
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaCruzMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaCruzMap frame = new StaCruzMap();
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
	public StaCruzMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Bol = new JButton("");
		Bol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Bol.setOpaque(false);
		Bol.setBorder(null);
		Bol.setBackground(Color.BLACK);
		Bol.setBounds(407, 127, 113, 58);
		contentPane.add(Bol);
		
		JButton Dir = new JButton("");
		Dir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Dir.setOpaque(false);
		Dir.setBorder(null);
		Dir.setBackground(Color.BLACK);
		Dir.setBounds(358, 160, 56, 166);
		contentPane.add(Dir);
		
		JButton SC = new JButton("");
		SC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SC.setOpaque(false);
		SC.setBorder(null);
		SC.setBackground(Color.BLACK);
		SC.setBounds(271, 162, 89, 255);
		contentPane.add(SC);
		
		JButton SC2 = new JButton("");
		SC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SC2.setOpaque(false);
		SC2.setBorder(null);
		SC2.setBackground(Color.BLACK);
		SC2.setBounds(197, 216, 76, 50);
		contentPane.add(SC2);
		
		JButton CR = new JButton("");
		CR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		CR.setOpaque(false);
		CR.setBorder(null);
		CR.setBackground(Color.BLACK);
		CR.setBounds(184, 114, 76, 88);
		contentPane.add(CR);
		
		JButton TP = new JButton("");
		TP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		TP.setOpaque(false);
		TP.setBorder(null);
		TP.setBackground(Color.BLACK);
		TP.setBounds(0, 0, 183, 168);
		contentPane.add(TP);
		
		JButton ab27 = new JButton("");
		ab27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		ab27.setOpaque(false);
		ab27.setBorder(null);
		ab27.setBackground(Color.BLACK);
		ab27.setBounds(0, 179, 187, 215);
		contentPane.add(ab27);
		
		JButton ab271 = new JButton("");
		ab271.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		ab271.setOpaque(false);
		ab271.setBorder(null);
		ab271.setBackground(Color.BLACK);
		ab271.setBounds(184, 269, 77, 125);
		contentPane.add(ab271);
		
		JButton GJ = new JButton("");
		GJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		GJ.setOpaque(false);
		GJ.setBorder(null);
		GJ.setBackground(Color.BLACK);
		GJ.setBounds(73, 408, 246, 153);
		contentPane.add(GJ);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Guanacaste\\SC.JPG"));
		lblNewLabel.setBounds(0, 0, 584, 561);
		contentPane.add(lblNewLabel);
	}

}
