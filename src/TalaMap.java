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


public class TalaMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TalaMap frame = new TalaMap();
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
	public TalaMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Cah = new JButton("");
		Cah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Cah.setOpaque(false);
		Cah.setBorder(null);
		Cah.setBackground(Color.RED);
		Cah.setBounds(334, 29, 167, 111);
		contentPane.add(Cah);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Limon\\tala.JPG"));
		lblNewLabel.setBounds(0, 0, 584, 504);
		contentPane.add(lblNewLabel);
	}

}
