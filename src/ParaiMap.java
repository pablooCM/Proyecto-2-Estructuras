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


public class ParaiMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaiMap frame = new ParaiMap();
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
	public ParaiMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Para = new JButton("");
		Para.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Para.setOpaque(false);
		Para.setBorder(null);
		Para.setBackground(Color.YELLOW);
		Para.setBounds(46, 39, 65, 86);
		contentPane.add(Para);
		
		JButton oro = new JButton("");
		oro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			
			}
		});
		oro.setBorder(null);
		oro.setBackground(Color.BLACK);
		oro.setOpaque(false);
		oro.setBounds(32, 168, 291, 314);
		contentPane.add(oro);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Cartago\\Para.JPG"));
		lblNewLabel.setBounds(0, 0, 523, 482);
		contentPane.add(lblNewLabel);
	}

}
