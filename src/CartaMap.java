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


public class CartaMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartaMap frame = new CartaMap();
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
	public CartaMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700,700,700,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Par = new JButton("");
		Par.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaiMap obj= new ParaiMap();
				obj.setVisible(true);
			}
		});
		Par.setOpaque(false);
		Par.setBorder(null);
		Par.setBackground(Color.MAGENTA);
		Par.setBounds(120, 202, 49, 96);
		contentPane.add(Par);
		
		JButton Par2 = new JButton("");
		Par2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ParaiMap obj= new ParaiMap();
				obj.setVisible(true);
			
			}
		});
		Par2.setOpaque(false);
		Par2.setBorder(null);
		Par2.setBackground(Color.MAGENTA);
		Par2.setBounds(161, 295, 49, 83);
		contentPane.add(Par2);
		
		JButton Ore = new JButton("");
		Ore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OreaMap obj= new OreaMap();
				obj.setVisible(true);
			}
		});
		Ore.setBackground(Color.MAGENTA);
		Ore.setBorder(null);
		Ore.setOpaque(false);
		Ore.setBounds(102, 58, 38, 141);
		contentPane.add(Ore);
		
		JButton Tej = new JButton("");
		Tej.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElGuarMap obj= new ElGuarMap();
				obj.setVisible(true);
			}
		});
		Tej.setOpaque(false);
		Tej.setBorder(null);
		Tej.setBackground(Color.DARK_GRAY);
		Tej.setBounds(32, 257, 89, 83);
		contentPane.add(Tej);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\provincias\\cartago_costa_rica_map.jpeg"));
		lblNewLabel.setBounds(0, 0, 684, 427);
		contentPane.add(lblNewLabel);
	}

}
