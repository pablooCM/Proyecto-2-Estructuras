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


public class AlfaroRmap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlfaroRmap frame = new AlfaroRmap();
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
	public AlfaroRmap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750,750,750,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Zarce = new JButton("");
		Zarce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Zarce.setOpaque(false);
		Zarce.setBorder(null);
		Zarce.setBackground(Color.CYAN);
		Zarce.setBounds(516, 302, 113, 109);
		contentPane.add(Zarce);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Alajuela\\AlfaRu.JPG"));
		lblNewLabel.setBounds(0, 0, 734, 443);
		contentPane.add(lblNewLabel);
	}

}
