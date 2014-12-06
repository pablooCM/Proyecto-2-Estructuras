


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

public class AbangaMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbangaMap frame = new AbangaMap();
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
	public AbangaMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(560,560,800,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton CL = new JButton("");
		CL.setBorder(null);
		CL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		CL.setOpaque(false);
		CL.setBackground(Color.MAGENTA);
		CL.setBounds(0, 265, 242, 239);
		contentPane.add(CL);
		
		JButton CL2 = new JButton("");
		CL2.setBorder(null);
		CL2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		CL2.setOpaque(false);
		CL2.setBackground(Color.MAGENTA);
		CL2.setBounds(233, 359, 130, 164);
		contentPane.add(CL2);
		
		JButton CL3 = new JButton("");
		CL3.setBorder(null);
		CL3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		CL3.setOpaque(false);
		CL3.setBackground(Color.MAGENTA);
		CL3.setBounds(233, 289, 94, 73);
		contentPane.add(CL3);
		
		JButton JN = new JButton("");
		JN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		JN.setOpaque(false);
		JN.setBorder(null);
		JN.setBackground(Color.CYAN);
		JN.setBounds(336, 166, 94, 182);
		contentPane.add(JN);
		
		JButton JN2 = new JButton("");
		JN2.setOpaque(false);
		JN2.setVerifyInputWhenFocusTarget(true);
		JN2.setBorder(null);
		JN2.setBackground(Color.CYAN);
		JN2.setBounds(429, 151, 50, 182);
		contentPane.add(JN2);
		
		JButton JN3 = new JButton("");
		JN3.setOpaque(false);
		JN3.setBorder(null);
		JN3.setBackground(Color.CYAN);
		JN3.setBounds(373, 344, 106, 124);
		contentPane.add(JN3);
		
		JButton JN4 = new JButton("");
		JN4.setOpaque(false);
		JN4.setBorder(null);
		JN4.setBackground(Color.CYAN);
		JN4.setBounds(445, 470, 148, 113);
		contentPane.add(JN4);
		
		JButton SI = new JButton("");
		SI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SI.setOpaque(false);
		SI.setBorder(null);
		SI.setBackground(Color.GREEN);
		SI.setBounds(536, 119, 160, 182);
		contentPane.add(SI);
		
		JButton SJn = new JButton("");
		SJn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneraReporte obj= new GeneraReporte();
				obj.setVisible(true);
			}
		});
		SJn.setOpaque(false);
		SJn.setBorder(null);
		SJn.setBackground(Color.ORANGE);
		SJn.setBounds(489, 310, 220, 149);
		contentPane.add(SJn);
		
		JLabel Abanga = new JLabel("New label");
		Abanga.setIcon(new ImageIcon("C:\\Users\\pablo\\workspace\\Proyecto2\\src\\Imagenes\\Guanacaste\\Abangares.JPG"));
		Abanga.setBounds(0, 0, 784, 626);
		contentPane.add(Abanga);
	}
}
