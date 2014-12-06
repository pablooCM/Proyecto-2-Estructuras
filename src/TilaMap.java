
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

public class TilaMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TilaMap frame = new TilaMap();
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
	public TilaMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700,700,700,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Ar = new JButton("");
		Ar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Ar.setOpaque(false);
		Ar.setBorder(null);
		Ar.setBackground(Color.YELLOW);
		Ar.setBounds(240, 168, 321, 174);
		contentPane.add(Ar);
		
		JButton TM = new JButton("");
		TM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		TM.setOpaque(false);
		TM.setBorder(null);
		TM.setBackground(Color.YELLOW);
		TM.setBounds(10, 11, 221, 180);
		contentPane.add(TM);
		
		JButton SR = new JButton("");
		SR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SR.setOpaque(false);
		SR.setBorder(null);
		SR.setBackground(Color.YELLOW);
		SR.setBounds(35, 202, 98, 162);
		contentPane.add(SR);
		
		JButton TL = new JButton("");
		TL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		TL.setOpaque(false);
		TL.setBorder(null);
		TL.setBackground(Color.YELLOW);
		TL.setBounds(143, 320, 202, 89);
		contentPane.add(TL);
		
		JButton LBa = new JButton("");
		LBa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		LBa.setOpaque(false);
		LBa.setBorder(null);
		LBa.setBackground(Color.YELLOW);
		LBa.setBounds(35, 402, 137, 138);
		contentPane.add(LBa);
		
		JButton QG = new JButton("");
		QG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		QG.setOpaque(false);
		QG.setBorder(null);
		QG.setBackground(Color.YELLOW);
		QG.setBounds(211, 510, 212, 89);
		contentPane.add(QG);
		
		JButton QG2 = new JButton("");
		QG2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		QG2.setOpaque(false);
		QG2.setBorder(null);
		QG2.setBackground(Color.YELLOW);
		QG2.setBounds(182, 420, 103, 77);
		contentPane.add(QG2);
		
		JButton Tr = new JButton("");
		Tr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		Tr.setOpaque(false);
		Tr.setBorder(null);
		Tr.setBackground(Color.YELLOW);
		Tr.setBounds(366, 402, 168, 96);
		contentPane.add(Tr);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBorder(null);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Guanacaste\\Tila.JPG"));
		lblNewLabel.setBounds(0, 0, 684, 599);
		contentPane.add(lblNewLabel);
	}

}
