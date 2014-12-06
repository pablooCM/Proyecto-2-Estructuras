

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

public class NicoyaMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NicoyaMap frame = new NicoyaMap();
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
	public NicoyaMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650,650,650,650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Nicoya");
		
		JButton SA = new JButton("");
		SA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SA.setOpaque(false);
		SA.setBorder(null);
		SA.setBackground(new Color(51, 153, 0));
		SA.setBounds(257, 11, 315, 136);
		contentPane.add(SA);
		
		JButton SA2 = new JButton("");
		SA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SA2.setOpaque(false);
		SA2.setBorder(null);
		SA2.setBackground(new Color(51, 153, 0));
		SA2.setBounds(267, 148, 180, 33);
		contentPane.add(SA2);
		
		JButton SA3 = new JButton("");
		SA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SA3.setOpaque(false);
		SA3.setBorder(null);
		SA3.setBackground(new Color(51, 153, 0));
		SA3.setBounds(340, 178, 101, 63);
		contentPane.add(SA3);
		
		JButton SA4 = new JButton("");
		SA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SA4.setOpaque(false);
		SA4.setBorder(null);
		SA4.setBackground(new Color(51, 153, 0));
		SA4.setBounds(313, 181, 27, 47);
		contentPane.add(SA4);
		
		JButton NC = new JButton("");
		NC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		NC.setOpaque(false);
		NC.setBorder(null);
		NC.setBackground(new Color(51, 153, 0));
		NC.setBounds(223, 158, 43, 367);
		contentPane.add(NC);
		
		JButton NC2 = new JButton("");
		NC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		NC2.setOpaque(false);
		NC2.setBorder(null);
		NC2.setBackground(new Color(51, 153, 0));
		NC2.setBounds(266, 192, 53, 333);
		contentPane.add(NC2);
		
		JButton NC3 = new JButton("");
		NC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		NC3.setOpaque(false);
		NC3.setBorder(null);
		NC3.setBackground(new Color(51, 153, 0));
		NC3.setBounds(323, 239, 53, 97);
		contentPane.add(NC3);
		
		JButton NC4 = new JButton("");
		NC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		NC4.setOpaque(false);
		NC4.setBorder(null);
		NC4.setBackground(new Color(51, 153, 0));
		NC4.setBounds(22, 233, 199, 286);
		contentPane.add(NC4);
		
		JButton NC5 = new JButton("");
		NC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		NC5.setOpaque(false);
		NC5.setBorder(null);
		NC5.setBackground(new Color(51, 153, 0));
		NC5.setBounds(32, 521, 114, 63);
		contentPane.add(NC5);
		
		JButton SM = new JButton("");
		SM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SM.setOpaque(false);
		SM.setBorder(null);
		SM.setBackground(new Color(51, 153, 0));
		SM.setBounds(145, 530, 167, 81);
		contentPane.add(SM);
		
		JButton SM2 = new JButton("");
		SM2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SM2.setOpaque(false);
		SM2.setBorder(null);
		SM2.setBackground(new Color(51, 153, 0));
		SM2.setBounds(103, 585, 43, 33);
		contentPane.add(SM2);
		
		JButton MN = new JButton("");
		MN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		MN.setOpaque(false);
		MN.setBorder(null);
		MN.setBackground(new Color(51, 153, 0));
		MN.setBounds(376, 252, 71, 150);
		contentPane.add(MN);
		
		JButton MN2 = new JButton("");
		MN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		MN2.setOpaque(false);
		MN2.setBorder(null);
		MN2.setBackground(new Color(51, 153, 0));
		MN2.setBounds(451, 206, 43, 196);
		contentPane.add(MN2);
		
		JButton MN3 = new JButton("");
		MN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		MN3.setOpaque(false);
		MN3.setBorder(null);
		MN3.setBackground(new Color(51, 153, 0));
		MN3.setBounds(494, 283, 140, 103);
		contentPane.add(MN3);
		
		JButton QH = new JButton("");
		QH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		QH.setOpaque(false);
		QH.setBorder(null);
		QH.setBackground(new Color(51, 153, 0));
		QH.setBounds(504, 148, 79, 127);
		contentPane.add(QH);
		
		JButton QH1 = new JButton("");
		QH1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		QH1.setOpaque(false);
		QH1.setBorder(null);
		QH1.setBackground(new Color(51, 153, 0));
		QH1.setBounds(457, 148, 48, 57);
		contentPane.add(QH1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Guanacaste\\Nicoya.JPG"));
		label.setBounds(0, 0, 662, 646);
		contentPane.add(label);
	}

}
