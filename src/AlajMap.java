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


public class AlajMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlajMap frame = new AlajMap();
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
	public AlajMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton UP = new JButton("");
		UP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpalaMap obj= new UpalaMap();
				obj.setVisible(true);
			}
		});
		UP.setOpaque(false);
		UP.setBorder(null);
		UP.setBackground(Color.ORANGE);
		UP.setBounds(26, 27, 143, 97);
		contentPane.add(UP);
		
		JButton LC = new JButton("");
		LC.setOpaque(false);
		LC.setBorder(null);
		LC.setBackground(Color.ORANGE);
		LC.setBounds(215, 30, 89, 90);
		contentPane.add(LC);
		
		JButton GT = new JButton("");
		GT.setOpaque(false);
		GT.setBorder(null);
		GT.setBackground(Color.ORANGE);
		GT.setBounds(167, 109, 61, 75);
		contentPane.add(GT);
		
		JButton SC = new JButton("");
		SC.setOpaque(false);
		SC.setBorder(null);
		SC.setBackground(Color.ORANGE);
		SC.setBounds(314, 64, 70, 244);
		contentPane.add(SC);
		
		JButton SC2 = new JButton("");
		SC2.setOpaque(false);
		SC2.setBorder(null);
		SC2.setBackground(Color.ORANGE);
		SC2.setBounds(226, 175, 89, 67);
		contentPane.add(SC2);
		
		JButton AR = new JButton("");
		AR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlfaroRmap obj= new AlfaroRmap();
				obj.setVisible(true);
			}
		});
		AR.setOpaque(false);
		AR.setBorder(null);
		AR.setBackground(Color.ORANGE);
		AR.setBounds(314, 312, 47, 33);
		contentPane.add(AR);
		
		JButton SR = new JButton("");
		SR.setOpaque(false);
		SR.setBorder(null);
		SR.setBackground(Color.ORANGE);
		SR.setBounds(215, 253, 89, 148);
		contentPane.add(SR);
		
		JButton NR = new JButton("");
		NR.setOpaque(false);
		NR.setBorder(null);
		NR.setBackground(Color.ORANGE);
		NR.setBounds(335, 345, 18, 56);
		contentPane.add(NR);
		
		JButton PL = new JButton("");
		PL.setOpaque(false);
		PL.setBorder(null);
		PL.setBackground(Color.ORANGE);
		PL.setBounds(307, 383, 25, 33);
		contentPane.add(PL);
		
		JButton SM = new JButton("");
		SM.setOpaque(false);
		SM.setBorder(null);
		SM.setBackground(Color.ORANGE);
		SM.setBounds(262, 414, 55, 23);
		contentPane.add(SM);
		
		JButton VV = new JButton("");
		VV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValVegaMap obj= new ValVegaMap();
				obj.setVisible(true);
			}
		});
		VV.setOpaque(false);
		VV.setBorder(null);
		VV.setBackground(Color.ORANGE);
		VV.setBounds(357, 312, 37, 33);
		contentPane.add(VV);
		
		JButton GR = new JButton("");
		GR.setOpaque(false);
		GR.setBorder(null);
		GR.setBackground(Color.ORANGE);
		GR.setBounds(385, 197, 25, 111);
		contentPane.add(GR);
		
		JButton OR = new JButton("");
		OR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrotiMap obj= new OrotiMap();
				obj.setVisible(true);
			}
		});
		OR.setOpaque(false);
		OR.setBorder(null);
		OR.setBackground(Color.ORANGE);
		OR.setBounds(254, 438, 61, 33);
		contentPane.add(OR);
		
		JButton AT = new JButton("");
		AT.setOpaque(false);
		AT.setBorder(null);
		AT.setBackground(Color.ORANGE);
		AT.setBounds(321, 403, 25, 42);
		contentPane.add(AT);
		
		JButton GR2 = new JButton("");
		GR2.setOpaque(false);
		GR2.setBorder(null);
		GR2.setBackground(Color.ORANGE);
		GR2.setBounds(363, 339, 18, 77);
		contentPane.add(GR2);
		
		JButton PO = new JButton("");
		PO.setOpaque(false);
		PO.setBorder(null);
		PO.setBackground(Color.ORANGE);
		PO.setBounds(385, 345, 18, 33);
		contentPane.add(PO);
		
		JButton Alj = new JButton("");
		Alj.setOpaque(false);
		Alj.setBorder(null);
		Alj.setBackground(Color.ORANGE);
		Alj.setBounds(404, 312, 9, 125);
		contentPane.add(Alj);
		
		JButton Alj2 = new JButton("");
		Alj2.setOpaque(false);
		Alj2.setBorder(null);
		Alj2.setBackground(Color.ORANGE);
		Alj2.setBounds(357, 414, 55, 23);
		contentPane.add(Alj2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\provincias\\map of alajuela.jpeg"));
		lblNewLabel.setBounds(0, 0, 584, 482);
		contentPane.add(lblNewLabel);
	}

}
