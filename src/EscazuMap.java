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


public class EscazuMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscazuMap frame = new EscazuMap();
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
	public EscazuMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700,700,700,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jfknaskldm = new JButton("");
		jfknaskldm.setOpaque(false);
		jfknaskldm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		jfknaskldm.setVerifyInputWhenFocusTarget(false);
		jfknaskldm.setBorder(null);
		jfknaskldm.setBackground(Color.GREEN);
		jfknaskldm.setBounds(267, 251, 231, 79);
		contentPane.add(jfknaskldm);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\San Jose\\Mapa-de-Escazu.jpg"));
		lblNewLabel.setBounds(0, 0, 684, 661);
		contentPane.add(lblNewLabel);
	}

}
