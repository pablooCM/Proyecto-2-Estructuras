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


public class CoroMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoroMap frame = new CoroMap();
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
	public CoroMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700,700,700,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton SIdro = new JButton("");
		SIdro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SIdro.setOpaque(false);
		SIdro.setBorder(null);
		SIdro.setBackground(Color.RED);
		SIdro.setBounds(55, 554, 63, 54);
		contentPane.add(SIdro);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\San Jose\\Coro.JPG"));
		lblNewLabel.setBounds(0, 0, 584, 608);
		contentPane.add(lblNewLabel);
	}

}
