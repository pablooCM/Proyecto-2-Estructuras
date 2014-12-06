

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

public class CarrilloMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarrilloMap frame = new CarrilloMap();
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
	public CarrilloMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750,750,750,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Sar = new JButton("");
		Sar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Sar.setBorder(null);
		Sar.setOpaque(false);
		Sar.setBackground(Color.PINK);
		Sar.setBounds(28, 11, 361, 294);
		contentPane.add(Sar);
		
		JButton Bel = new JButton("");
		Bel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Bel.setOpaque(false);
		Bel.setBackground(Color.YELLOW);
		Bel.setBorder(null);
		Bel.setBounds(305, 327, 173, 272);
		contentPane.add(Bel);
		
		JButton Bel2 = new JButton("");
		Bel2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Bel2.setBorder(null);
		Bel2.setBackground(Color.CYAN);
		Bel2.setOpaque(false);
		Bel2.setBounds(476, 397, 54, 140);
		contentPane.add(Bel2);
		
		JButton Fil = new JButton("");
		Fil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Fil.setOpaque(false);
		Fil.setBorder(null);
		Fil.setBackground(Color.BLUE);
		Fil.setBounds(530, 320, 194, 201);
		contentPane.add(Fil);
		
		JButton Pal = new JButton("");
		Pal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Pal.setBackground(Color.RED);
		Pal.setBorder(null);
		Pal.setOpaque(false);
		Pal.setBounds(399, 31, 120, 283);
		contentPane.add(Pal);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Guanacaste\\Carrillo.JPG"));
		lblNewLabel.setBounds(10, 11, 774, 588);
		contentPane.add(lblNewLabel);
	}

}
