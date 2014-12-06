
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class distritosCantoon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					distritosCantoon frame = new distritosCantoon();
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
	public distritosCantoon() {
		setTitle("Distritos de un Cant\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDistritosDeBagaces = new JLabel("Distritos de");
		lblDistritosDeBagaces.setBounds(28, 25, 64, 22);
		contentPane.add(lblDistritosDeBagaces);
		
		JLabel lblBagaces = new JLabel("Bagaces");
		lblBagaces.setFont(new Font("Calibri", Font.BOLD, 11));
		lblBagaces.setBounds(102, 29, 46, 14);
		contentPane.add(lblBagaces);
		
		JLabel lblNewLabel = new JLabel("Bagaces - Mocote - Fortuna");
		lblNewLabel.setBounds(38, 58, 383, 65);
		contentPane.add(lblNewLabel);
	}
}
