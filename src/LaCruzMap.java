

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

public class LaCruzMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LaCruzMap frame = new LaCruzMap();
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
	public LaCruzMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750,750,750,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton StE = new JButton("");
		StE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		StE.setOpaque(false);
		StE.setBorder(null);
		StE.setBackground(Color.GREEN);
		StE.setBounds(0, 407, 592, 180);
		contentPane.add(StE);
		
		JButton LC = new JButton("");
		LC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		LC.setBorder(null);
		LC.setBackground(Color.PINK);
		LC.setOpaque(false);
		LC.setBounds(313, 78, 162, 318);
		contentPane.add(LC);
		
		JButton LG = new JButton("");
		LG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		LG.setOpaque(false);
		LG.setBackground(Color.BLUE);
		LG.setBorder(null);
		LG.setBounds(485, 109, 170, 272);
		contentPane.add(LG);
		
		JButton StC = new JButton("");
		StC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		StC.setOpaque(false);
		StC.setBackground(Color.BLUE);
		StC.setBorder(null);
		StC.setBounds(665, 157, 59, 272);
		contentPane.add(StC);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Guanacaste\\LaCruz.JPG"));
		lblNewLabel.setBounds(0, 0, 734, 688);
		contentPane.add(lblNewLabel);
	}

}
