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


public class StDomingoMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StDomingoMap frame = new StDomingoMap();
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
	public StDomingoMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750,750,750,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton StD = new JButton("");
		StD.setOpaque(false);
		StD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		StD.setBorder(null);
		StD.setBackground(Color.GREEN);
		StD.setBounds(0, 363, 207, 90);
		contentPane.add(StD);
		
		JButton StR = new JButton("");
		StR.setBackground(Color.YELLOW);
		StR.setOpaque(false);
		StR.setBounds(0, 452, 237, 76);
		contentPane.add(StR);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBorder(null);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Heredia\\Mingo.JPG"));
		lblNewLabel.setBounds(0, 0, 734, 557);
		contentPane.add(lblNewLabel);
	}

}
