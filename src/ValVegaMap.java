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


public class ValVegaMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValVegaMap frame = new ValVegaMap();
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
	public ValVegaMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750,750,750,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Sarch = new JButton("");
		Sarch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Sarch.setOpaque(false);
		Sarch.setBorder(null);
		Sarch.setBackground(Color.ORANGE);
		Sarch.setBounds(10, 271, 104, 328);
		contentPane.add(Sarch);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Alajuela\\ValVe.JPG"));
		lblNewLabel.setBounds(0, 0, 498, 599);
		contentPane.add(lblNewLabel);
	}

}
