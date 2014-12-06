
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

public class LiberiaMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LiberiaMap frame = new LiberiaMap();
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
	public LiberiaMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,600,600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton NCo = new JButton("");
		NCo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		NCo.setBorder(null);
		NCo.setBackground(Color.CYAN);
		NCo.setOpaque(false);
		NCo.setVerifyInputWhenFocusTarget(false);
		NCo.setBounds(10, 144, 89, 150);
		contentPane.add(NCo);
		
		JButton MYo = new JButton("");
		MYo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		MYo.setBorder(null);
		MYo.setBackground(Color.CYAN);
		MYo.setOpaque(false);
		MYo.setVerifyInputWhenFocusTarget(false);
		MYo.setBounds(95, 93, 66, 78);
		contentPane.add(MYo);
		
		JButton CD = new JButton("");
		CD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		CD.setBorder(null);
		CD.setBackground(Color.CYAN);
		CD.setOpaque(false);
		CD.setVerifyInputWhenFocusTarget(false);
		CD.setBounds(105, 165, 66, 56);
		contentPane.add(CD);
		
		JButton Cu = new JButton("");
		Cu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Cu.setBorder(null);
		Cu.setBackground(Color.CYAN);
		Cu.setOpaque(false);
		Cu.setVerifyInputWhenFocusTarget(false);
		Cu.setBounds(143, 219, 46, 23);
		contentPane.add(Cu);
		
		JButton LB = new JButton("");
		LB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		LB.setBorder(null);
		LB.setBackground(Color.CYAN);
		LB.setOpaque(false);
		LB.setVerifyInputWhenFocusTarget(false);
		LB.setBounds(100, 266, 128, 128);
		contentPane.add(LB);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Guanacaste\\250px-Cant\u00F3n_de_Liberia.jpg"));
		lblNewLabel.setBounds(0, 0, 352, 487);
		contentPane.add(lblNewLabel);
	}

}
