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


public class PocociMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PocociMap frame = new PocociMap();
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
	public PocociMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750,750,750,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Cari = new JButton("");
		Cari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Cari.setOpaque(false);
		Cari.setBorder(null);
		Cari.setBackground(Color.ORANGE);
		Cari.setBounds(283, 417, 78, 51);
		contentPane.add(Cari);
		
		JButton Cari2 = new JButton("");
		Cari2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Cari2.setOpaque(false);
		Cari2.setBorder(null);
		Cari2.setBackground(Color.ORANGE);
		Cari2.setBounds(335, 355, 89, 51);
		contentPane.add(Cari2);
		
		JButton Colo = new JButton("");
		Colo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Colo.setOpaque(false);
		Colo.setBorder(null);
		Colo.setBackground(Color.ORANGE);
		Colo.setBounds(283, 111, 178, 216);
		contentPane.add(Colo);
		
		JButton Colo2 = new JButton("");
		Colo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Colo2.setOpaque(false);
		Colo2.setBorder(null);
		Colo2.setBackground(Color.ORANGE);
		Colo2.setBounds(421, 338, 78, 162);
		contentPane.add(Colo2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Limon\\Pococi.JPG"));
		lblNewLabel.setBounds(192, 69, 376, 601);
		contentPane.add(lblNewLabel);
	}

}
