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


public class HeredMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeredMap frame = new HeredMap();
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
	public HeredMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Hered = new JButton("");
		Hered.setOpaque(false);
		Hered.setBorder(null);
		Hered.setBackground(Color.RED);
		Hered.setBounds(149, 417, 22, 23);
		contentPane.add(Hered);
		
		JButton StD = new JButton("");
		StD.setOpaque(false);
		StD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StDomingoMap obj= new StDomingoMap();
				obj.setVisible(true);
			}
		});
		StD.setBorder(null);
		StD.setBackground(Color.MAGENTA);
		StD.setVerifyInputWhenFocusTarget(false);
		StD.setBounds(181, 417, 44, 31);
		contentPane.add(StD);
		
		JButton StB = new JButton("");
		StB.setBorder(null);
		StB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SBarMap obj= new SBarMap();
				obj.setVisible(true);
			}
		});
		StB.setOpaque(false);
		StB.setBackground(Color.BLACK);
		StB.setBounds(134, 349, 31, 67);
		contentPane.add(StB);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\provincias\\heredia-cantones.jpeg"));
		lblNewLabel.setBounds(0, 0, 584, 497);
		contentPane.add(lblNewLabel);
	}

}
