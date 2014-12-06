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


public class LimonMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LimonMap frame = new LimonMap();
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
	public LimonMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Pco = new JButton("");
		Pco.setBorder(null);
		Pco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PocociMap obj= new PocociMap();
				obj.setVisible(true);
			}
		});
		Pco.setOpaque(false);
		Pco.setBackground(Color.GREEN);
		Pco.setBounds(25, 0, 228, 175);
		contentPane.add(Pco);
		
		JButton Siqui = new JButton("");
		Siqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SiquiMap obj = new SiquiMap();
				obj.setVisible(true);
			}
		});
		Siqui.setBorder(null);
		Siqui.setBackground(Color.PINK);
		Siqui.setOpaque(false);
		Siqui.setBounds(132, 186, 151, 70);
		contentPane.add(Siqui);
		
		JButton Tala = new JButton("");
		Tala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TalaMap obj = new TalaMap();
				obj.setVisible(true);
			}
		});
		Tala.setOpaque(false);
		Tala.setBorder(null);
		Tala.setBackground(Color.BLUE);
		Tala.setBounds(106, 440, 302, 121);
		contentPane.add(Tala);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\provincias\\limon_costa_rica_map.jpeg"));
		lblNewLabel.setBounds(0, 0, 584, 561);
		contentPane.add(lblNewLabel);
	}

}
