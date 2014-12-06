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


public class SiquiMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SiquiMap frame = new SiquiMap();
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
	public SiquiMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton sq = new JButton("");
		sq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		sq.setOpaque(false);
		sq.setBorder(null);
		sq.setBackground(Color.MAGENTA);
		sq.setBounds(420, 98, 164, 101);
		contentPane.add(sq);
		
		JButton sq2 = new JButton("");
		sq2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		sq2.setOpaque(false);
		sq2.setBorder(null);
		sq2.setBackground(Color.MAGENTA);
		sq2.setBounds(364, 233, 119, 85);
		contentPane.add(sq2);
		
		JButton sq3 = new JButton("");
		sq3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {GeneraReporte obj= new GeneraReporte();
			obj.setVisible(true);
			}
		});
		sq3.setOpaque(false);
		sq3.setBorder(null);
		sq3.setBackground(Color.MAGENTA);
		sq3.setBounds(226, 385, 147, 112);
		contentPane.add(sq3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Limon\\Siqui.JPG"));
		lblNewLabel.setBounds(0, 0, 584, 550);
		contentPane.add(lblNewLabel);
	}

}
